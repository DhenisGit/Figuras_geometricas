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

public class AdapterP extends ArrayAdapter<Padre> {
    private List<Padre> padreList;
    private List<Padre> filterPadreList;

    public AdapterP(Context context, List<Padre> padreList) {
        super(context,0, padreList);
        this.padreList = padreList;
        this.filterPadreList = new ArrayList<>(padreList);
    }

    @Override
    public int getCount() {
        return filterPadreList.size();
    }
    @Override
    public Padre getItem(int position) {
        return filterPadreList.get(position);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_elementos,parent,false);
        }
        Padre padre = getItem(position);

        TextView text_Nombre = convertView.findViewById(R.id.text_padre);
        String Text_Completo_Nombre = padre.getNombre() +" "+padre.getApellido_p()+" "+padre.getApliido_m();
        text_Nombre.setText(Text_Completo_Nombre);
        ImageView imageView = convertView.findViewById(R.id.imagenview1);
        String imageUrl = padre.getImageUrl();
        Picasso.get().load(imageUrl).into(imageView);
        return convertView;
    }
    @Override
    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String Bucador_text = charSequence.toString().toLowerCase();
                FilterResults resultado = new FilterResults();
                List<Padre> filterPadreList = new ArrayList<>();
                if (Bucador_text.isEmpty()) {
                    filterPadreList.addAll(padreList);
                } else {
                    for (Padre padre : padreList) {
                        if (padre.getNombre().toLowerCase().contains(Bucador_text) ||
                                padre.getApellido_p().toLowerCase().contains(Bucador_text) ||
                                padre.getApliido_m().toLowerCase().contains(Bucador_text)) {
                            filterPadreList.add(padre);
                        }
                    }
                }
                resultado.values = filterPadreList;
                resultado.count = filterPadreList.size();
                return resultado;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filterPadreList = (List<Padre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}
