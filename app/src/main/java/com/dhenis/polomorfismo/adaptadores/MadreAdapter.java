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
import com.dhenis.polomorfismo.constructores.ConstructorMadre;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class MadreAdapter extends ArrayAdapter<ConstructorMadre> {

    private List<ConstructorMadre> originalList;
    private List<ConstructorMadre> filteredList;

    public MadreAdapter(Context context, List<ConstructorMadre> madreList) {
        super(context, 0, madreList);
        this.originalList = madreList; // Asignar madreList a originalList
        this.filteredList = new ArrayList<>(originalList);
    }

    @Override
    public int getCount() {
        return filteredList.size();
    }

    @Override
    public ConstructorMadre getItem(int position) {
        return filteredList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listadeelementos, parent, false);
        }
        ConstructorMadre madre = getItem(position);

        TextView textViewNombre = convertView.findViewById(R.id.textname);
        String nombreCompleto = madre.getNombreMadre() + " " + madre.getApellidoPaterno_Madre() + " " + madre.getApellidoMaterno_Madre();
        textViewNombre.setText(nombreCompleto);

        TextView textViewEdad = convertView.findViewById(R.id.edadP);
        String edad = String.valueOf(madre.getEdad_Madre());  // Convertir la edad a String
        textViewEdad.setText(edad +" años");

        ImageView imageView = convertView.findViewById(R.id.imagenview);
        String imageUrl = madre.getImageUrl(); // Obtener la URL de la imagen única del objeto
        Picasso.get().load(imageUrl).into(imageView);

        /*ImageView imageView = convertView.findViewById(R.id.imagenview); // Agrega la referencia al ImageView en el layout listadeelementos.xml
        String imageUrl = "https://pbs.twimg.com/media/EfMyHOBXoAAhwLm.png"; // URL de la imagen de ejemplo
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
                List<ConstructorMadre> filteredList = new ArrayList<>();

                if (searchText.isEmpty()) {
                    filteredList.addAll(originalList); // Use originalList instead of filteredList
                } else {
                    for (ConstructorMadre madre : originalList) { // Use originalList instead of filteredList
                        if (madre.getNombreMadre().toLowerCase().contains(searchText) ||
                                madre.getApellidoPaterno_Madre().toLowerCase().contains(searchText) ||
                                madre.getApellidoMaterno_Madre().toLowerCase().contains(searchText)) {
                            filteredList.add(madre);
                        }
                    }
                }
                results.values = filteredList;
                results.count = filteredList.size();
                return results;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filteredList = (List<ConstructorMadre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}