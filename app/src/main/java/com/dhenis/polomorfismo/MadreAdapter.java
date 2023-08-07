package com.dhenis.polomorfismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MadreAdapter extends ArrayAdapter<datos_madre> {
    public MadreAdapter(Context context, List<datos_madre> madreList) {
        super(context, 0, madreList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Infla el layout personalizado para cada elemento de la lista
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listadeelementos, parent, false);
        }

        // Obtiene el elemento de la lista en la posición actual
        datos_madre madre = getItem(position);

        // Establece los valores de los atributos en los elementos de la vista
        TextView textViewNombre = convertView.findViewById(R.id.textname);
        String nombreCompleto = madre.getNombreMadre() + " " + madre.getApellidoPaterno_Madre() + " " + madre.getApellidoMaterno_Madre();
        textViewNombre.setText(nombreCompleto);

        return convertView;
    }
}
