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

        ImageView imageView = convertView.findViewById(R.id.imagenview);
        String imageUrl = "https://i.pinimg.com/564x/3f/67/f6/3f67f65f19a79a657ec9bd798e03aa1c.jpg";
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
                    List<datos_padre> filteredResults = new ArrayList<>();
                    for (datos_padre item : originalList) {
                        if (item.getNombre().toLowerCase().contains(constraint.toString().toLowerCase())) {
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
                filteredList = (List<datos_padre>) results.values;
                notifyDataSetChanged();
            }
        };
    }
}

