package com.dhenis.polomorfismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MadreAdapter extends ArrayAdapter<datos_madre> {

    private List<datos_madre> originalList;
    private List<datos_madre> filteredList;

    public MadreAdapter(Context context, List<datos_madre> madreList) {
        super(context, 0, madreList);
        this.originalList = madreList;
        this.filteredList = new ArrayList<>(originalList);
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public datos_madre getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listadeelementos, parent, false);
        }

        datos_madre madre = getItem(position);

        TextView textViewNombre = convertView.findViewById(R.id.textname);
        String nombreCompleto = madre.getNombreMadre() + " " + madre.getApellidoPaterno_Madre() + " " + madre.getApellidoMaterno_Madre();
        textViewNombre.setText(nombreCompleto);

        ImageView imageView = convertView.findViewById(R.id.imagenview); // Agrega la referencia al ImageView en el layout listadeelementos.xml
        String imageUrl = "https://image.winudf.com/v2/image1/Y29tLmFuaW1lZ2lybHByb2ZpbGVwaWN0dXJlLnJhbmlhYXBwc19zY3JlZW5fM18xNjg2MDEzNzczXzAyMQ/screen-3.webp?fakeurl=1&type=.webp"; // URL de la imagen de ejemplo
        Picasso.get().load(imageUrl).into(imageView); // Carga la imagen usando Picasso

        return convertView;
    }

    @Override
    public Filter getFilter() {
        // ... (el código del filtro permanece sin cambios)
        return null;
    }
}
