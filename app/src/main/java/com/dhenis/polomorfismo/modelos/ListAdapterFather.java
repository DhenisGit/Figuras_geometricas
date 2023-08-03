package com.dhenis.polomorfismo.modelos;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.R;

import java.util.List;

public class ListAdapterFather extends RecyclerView.Adapter<ListAdapterFather.ViewHolder> {

    private List<ListElementFather> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapterFather(List<ListElementFather> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    public int getItemCount() {
        return mData.size();
    }

    public  ListAdapterFather.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element_father, null);
        return new ListAdapterFather.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapterFather.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));
    }

    public void setItems(List<ListElementFather> items) {
        mData = items;
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, apellido_p, apellido_m,puesto_laboral, anos, resulta;

        ViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.iconImgView);
            name = itemView.findViewById(R.id.nombre_completo);
            apellido_p = itemView.findViewById(R.id.nombre_completo);
            apellido_m = itemView.findViewById(R.id.nombre_completo);
            puesto_laboral = itemView.findViewById(R.id.laboral);
            anos = itemView.findViewById(R.id.anos);
            resulta = itemView.findViewById(R.id.resul);
        }

        void bindData(final ListElementFather item) {
            img.setColorFilter(Color.parseColor(item.getImg()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            apellido_p.setText(item.getApellido_p());
            apellido_m.setText(item.getApellido_m());
            puesto_laboral.setText(item.getPuesto_laboral());
            anos.setText(item.getAnos());
            resulta.setText(item.getResulta());
        }
    }
}
