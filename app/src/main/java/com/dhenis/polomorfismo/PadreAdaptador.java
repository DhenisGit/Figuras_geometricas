package com.dhenis.polomorfismo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

public class PadreAdaptador extends ArrayAdapter<Padres> {

    public PadreAdaptador(Context context , List<Padres> padresList){
        super(context,0,padresList);
    }

    /*public View getView (int position, View convertView, ViewGroup parent){

        // Infla el layout personalizado para cada elemento de la lista
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_lista_padres, parent, false);
        }

        // Obtiene el elemento de la lista en la posición actual
        Padres padre = getItem(position);

        // Establece los valores de los atributos en los elementos de la vista
        TextView textViewNombre = convertView.findViewById(R.id.textnombre);
        textViewNombre.setText("Nombre: " + padre.getNombre());

        TextView textViewApellido = convertView.findViewById(R.id.textapellidos);
        textViewApellido.setText("Apellido: " + padre.getApellido_p() + padre.getApellido_m());

        TextView textViewEdad = convertView.findViewById(R.id.textedad);
        textViewEdad.setText("Edad: " + padre.getEdad());

        return convertView;
    }*/



}