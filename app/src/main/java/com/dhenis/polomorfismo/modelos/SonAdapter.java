package com.dhenis.polomorfismo.modelos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SonAdapter extends RecyclerView.Adapter<SonAdapter.ViewHolder> {
    private List<Element> mData;
    private LayoutInflater mInflater;
    private Context context;

    public SonAdapter(List<Element> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    public int getItemCount() {
        return mData.size();
    }

    public  SonAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element_son, null);
        /*context = view.getContext();*/
        return new SonAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SonAdapter.ViewHolder holder, final int position) {
        holder.bindData(mData.get(position));

    }

    public void setItems(List<Element> items) {
        mData = items;
    }

    public  class  ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name, apellido_p, apellido_m, anos;

        ViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.iconImgViewSon);
            name = itemView.findViewById(R.id.nombre_completo_hijo);
           /* apellido_p = itemView.findViewById(R.id.nombre_completo_hijo);
            apellido_m = itemView.findViewById(R.id.nombre_completo_hijo);*/
            anos = itemView.findViewById(R.id.años_hijo);
        }

        void bindData(final Element item) {
            /*img.setColorFilter(Color.parseColor(item.getImg()), PorterDuff.Mode.SRC_IN);*/
            String url = item.getImg();
            Picasso.get().load(url).error(R.drawable.ic_launcher_background).into(img);
            name.setText(item.getName() + " " +item.getApellido_p() + " " + item.getApellido_m());
            /*apellido_p.setText(item.getApellido_p());*/
            /*apellido_m.setText(item.getApellido_m());*/
            anos.setText(String.valueOf(item.getAnos() + " años"));
        }
    }
}
