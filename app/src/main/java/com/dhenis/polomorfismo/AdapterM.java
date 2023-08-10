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

public class AdapterM extends ArrayAdapter<Madre> {
    private List<Madre> madreList;
    private List<Madre> filterMadreList;

    public AdapterM(Context context, List<Madre> madreList) {
        super(context, 0,madreList);
        this.madreList = madreList;
        this.filterMadreList = new ArrayList<>(madreList);
    }
    @Override
    public int getCount() {
        return filterMadreList.size();
    }
    @Override
    public Madre getItem(int position) {
        return filterMadreList.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_elementos_madre,parent,false);
        }
        Madre madre = getItem(position);

        TextView text_Nombre = convertView.findViewById(R.id.text_madre);
        String Text_Completo_Nombre = madre.getNombre_madre() +" "+madre.getApellido_p_madre()+" "+madre.getApellido_m_madre();
        text_Nombre.setText(Text_Completo_Nombre);
        ImageView imageView = convertView.findViewById(R.id.imagenview1);
        String imageUrl = madre.getImageUrl_Madre();
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
                List<Madre> filterMadreList = new ArrayList<>();
                if (Bucador_text.isEmpty()) {
                    filterMadreList.addAll(madreList);
                } else {
                    for (Madre madre : madreList) {
                        if (madre.getNombre_madre().toLowerCase().contains(Bucador_text) ||
                                madre.getApellido_p_madre().toLowerCase().contains(Bucador_text) ||
                                madre.getApellido_p_madre().toLowerCase().contains(Bucador_text)) {
                            filterMadreList.add(madre);
                        }
                    }
                }
                resultado.values = filterMadreList;
                resultado.count = filterMadreList.size();
                return resultado;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                filterMadreList = (List<Madre>) filterResults.values;
                notifyDataSetChanged();
            }
        };
    }
}
