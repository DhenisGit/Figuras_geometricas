package com.dhenis.polomorfismo.modelos;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.listado.FatherActivity;
import com.dhenis.polomorfismo.listado.SonActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Element> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListAdapter(List<Element> itemList, Context context) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    public void setListFilter(List<Element> listFilter) {
        mData = listFilter;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return mData.size();
    }

    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.list_element_father, null);
        context = view.getContext();
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.bindData(mData.get(position));
        holder.lila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SonActivity.class);
                intent.putExtra("id", mData.get(position).getId());
                intent.putExtra("Nombre", mData.get(position).getName());
                intent.putExtra("apellido_p", mData.get(position).getApellido_p());
                intent.putExtra("apellido_m", mData.get(position).getApellido_m());
                context.startActivity(intent);
                Toast.makeText(context, "Hi Son", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setItems(List<Element> items) {
        mData = items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        LinearLayout lila;
        TextView name, apellido_p, apellido_m, anos, puesto_laboral, resulta;

        ViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.iconImgView);
            name = itemView.findViewById(R.id.nombre_completo);
            apellido_p = itemView.findViewById(R.id.nombre_completo);
            apellido_m = itemView.findViewById(R.id.nombre_completo);
            anos = itemView.findViewById(R.id.anos);
            puesto_laboral = itemView.findViewById(R.id.laboral);
            resulta = itemView.findViewById(R.id.resul);
            lila = itemView.findViewById(R.id.lilahijo);
        }

        void bindData(final Element item) {
            /*img.setColorFilter(Color.parseColor(item.getImg()), PorterDuff.Mode.SRC_IN);*/
            String url = item.getImg();
            Picasso.get().load(url).error(R.drawable.ic_launcher_background).into(img);
            name.setText(item.getName() + " " + item.getApellido_p() + " " + item.getApellido_m());
            /*apellido_p.setText(item.getApellido_p());*/
            /*apellido_m.setText(item.getApellido_m());*/
            anos.setText(String.valueOf(item.getAnos() + " años"));
            puesto_laboral.setText(item.getPuesto_laboral());
            resulta.setText(item.getResulta());
        }
    }
}
