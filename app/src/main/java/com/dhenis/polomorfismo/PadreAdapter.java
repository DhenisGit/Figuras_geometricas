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

public class PadreAdapter extends ArrayAdapter<datos_padre> implements Filterable {

    private List<datos_padre> originalList;
    private List<datos_padre> filteredList;
    private Filter filter;

    public PadreAdapter(Context context, List<datos_padre> padreList) {
        super(context, 0, padreList);
        originalList = new ArrayList<>(padreList);
        filteredList = new ArrayList<>(padreList);
        filter = new CustomFilter();
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
        return filter;

    }

    private class CustomFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();

            if (constraint != null && constraint.length() > 0) {
                List<datos_padre> filteredData = new ArrayList<>();

                for (datos_padre item : originalList) {
                    if (item.getNombre().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        filteredData.add(item);
                    }
                }

                results.count = filteredData.size();
                results.values = filteredData;
            } else {
                results.count = originalList.size();
                results.values = originalList;
            }

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredList = (List<datos_padre>) results.values;
            notifyDataSetChanged();
        }

    }

}
