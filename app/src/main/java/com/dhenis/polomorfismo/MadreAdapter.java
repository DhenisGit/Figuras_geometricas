package com.dhenis.polomorfismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MadreAdapter extends ArrayAdapter<datos_madre> {

    private List<datos_madre> originalList;
    private List<datos_madre> filteredList;
    public MadreAdapter(Context context, List<datos_madre> madreList) {
        super(context, 0, madreList);
        this.originalList = madreList; // Asignar madreList a originalList
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

        return convertView;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String searchText = charSequence.toString().toLowerCase();
                FilterResults results = new FilterResults();
                List<datos_madre> filteredList = new ArrayList<>();

                if (searchText.isEmpty()) {
                    filteredList.addAll(originalList); // Use originalList instead of filteredList
                } else {
                    for (datos_madre madre : originalList) { // Use originalList instead of filteredList
                        if (madre.getNombreMadre().toLowerCase().contains(searchText)||
                                madre.getApellidoPaterno_Madre().toLowerCase().contains(searchText)||
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
                filteredList = (List<datos_madre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}