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

        ImageView imageView = convertView.findViewById(R.id.imagenview);
        String imageUrl = "https://i.pinimg.com/564x/c7/56/bd/c756bd48336c57258ce21658aad4f34f.jpg";
        Picasso.get().load(imageUrl).into(imageView);

        return convertView;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                if (constraint == null || constraint.length() == 0) {
                    results.values = originalList;
                    results.count = originalList.size();
                } else {
                    List<datos_madre> filteredResults = new ArrayList<>();
                    for (datos_madre item : originalList) {
                        if (item.getNombreMadre().toLowerCase().contains(constraint.toString().toLowerCase())) {
                            filteredResults.add(item);
                        }
                    }
                    results.values = filteredResults;
                    results.count = filteredResults.size();
                }
                return results;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                filteredList = (List<datos_madre>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}
