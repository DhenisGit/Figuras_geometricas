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

public class PadreAdapter extends ArrayAdapter<datos_padre> {

    private List<datos_padre> originalList;
    private List<datos_padre> filteredList;

    public PadreAdapter(Context context, List<datos_padre> originalList) {
        super(context, 0, originalList);
        this.originalList = originalList;
        this.filteredList = new ArrayList<>(originalList);
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public datos_padre getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listadeelementos, parent, false);
        }

        datos_padre padre = getItem(position);

        TextView textViewNombre = convertView.findViewById(R.id.textname);
        String nombreCompleto = padre.getNombre() + " " + padre.getApellidoPaterno() + " " + padre.getApellidoMaterno();
        textViewNombre.setText(nombreCompleto);

        ImageView imageView = convertView.findViewById(R.id.imagenview); // Agrega la referencia al ImageView en el layout listadeelementos.xml
        String imageUrl = "https://i.pinimg.com/564x/5b/4b/51/5b4b51d018d2e370efb82f0be7ace9cc.jpg"; // URL de la imagen de ejemplo
        Picasso.get().load(imageUrl).into(imageView); // Carga la imagen usando Picasso

        return convertView;
    }

    @Override
    public Filter getFilter() {
    return null;
    }
}
