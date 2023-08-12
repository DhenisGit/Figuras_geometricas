package com.dhenis.polomorfismo.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import android.widget.ImageView;

import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.constructores.ConstructorPadre;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class PadreAdapter extends ArrayAdapter<ConstructorPadre> {

    private List<ConstructorPadre> originalList;
    private List<ConstructorPadre> filteredList;

    public PadreAdapter(Context context, List<ConstructorPadre> originalList) {
        super(context, 0, originalList);
        this.originalList = originalList;
        this.filteredList = new ArrayList<>(originalList);
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public ConstructorPadre getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listadeelementos, parent, false);
        }
        ConstructorPadre padre = getItem(position);

        TextView textViewNombre = convertView.findViewById(R.id.textname);
        String nombreCompleto = padre.getNombre() + " " + padre.getApellidoPaterno() + " " + padre.getApellidoMaterno();
        textViewNombre.setText(nombreCompleto);

        TextView textViewEdad = convertView.findViewById(R.id.edadP);
        String edad = String.valueOf(padre.getEdad());  // Convertir la edad a String
        textViewEdad.setText(edad +" años");

        ImageView imageView = convertView.findViewById(R.id.imagenview);
        String imageUrl = padre.getImageUrl(); // Obtener la URL de la imagen única del objeto
        Picasso.get().load(imageUrl).into(imageView); // Cargar la imagen

        /*ImageView imageView = convertView.findViewById(R.id.imagenview); // Agrega la referencia al ImageView en el layout listadeelementos.xml
        String imageUrl = "https://i.pinimg.com/originals/92/ff/06/92ff06f8f5a1685ac7aad850654cf86d.jpg"; // URL de la imagen de ejemplo
        Picasso.get().load(imageUrl).into(imageView); // Carga la imagen usando Picasso*/

        return convertView;

    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String searchText = charSequence.toString().toLowerCase();
                FilterResults results = new FilterResults();
                List<ConstructorPadre> filteredList = new ArrayList<>();

                if (searchText.isEmpty()) {
                    filteredList.addAll(originalList); // Use originalList instead of filteredList
                } else {
                    for (ConstructorPadre padre : originalList) { // Use originalList instead of filteredList
                        if (padre.getNombre().toLowerCase().contains(searchText)||
                                padre.getApellidoPaterno().toLowerCase().contains(searchText)||
                                padre.getApellidoMaterno().toLowerCase().contains(searchText)) {
                            filteredList.add(padre);
                        }
                    }
                }
                results.values = filteredList;
                results.count = filteredList.size();
                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredList = (List<ConstructorPadre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}