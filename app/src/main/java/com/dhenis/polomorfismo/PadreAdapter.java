package com.dhenis.polomorfismo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

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

        return convertView;
    }

    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String searchText = charSequence.toString().toLowerCase();
                FilterResults results = new FilterResults();
                List<datos_padre> filteredList = new ArrayList<>();

                if (searchText.isEmpty()) {
                    filteredList.addAll(originalList); // Use originalList instead of filteredList
                } else {
                    for (datos_padre padre : originalList) { // Use originalList instead of filteredList
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
                filteredList = (List<datos_padre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}