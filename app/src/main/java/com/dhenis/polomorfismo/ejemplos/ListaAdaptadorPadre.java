package com.dhenis.polomorfismo.ejemplos;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;

import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhenis.polomorfismo.R;

import java.util.List;

public class ListaAdaptadorPadre  extends RecyclerView.Adapter<ListaAdaptadorPadre.ViewHolder> {

    private List<Persona> mData;
    private LayoutInflater mInflater;
    private Context context;

    public ListaAdaptadorPadre(List<Persona> itemList, Context context ) {
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }
        @Override

public int getItemCount (){return mData.size(); }

    @Override
    public  ListaAdaptadorPadre.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view= mInflater.inflate(R.layout.listapadres, null);
        return new ListaAdaptadorPadre.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(final ListaAdaptadorPadre.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));


    }
    public void setItems(List<Persona> items){ mData = items; }
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView nombre,puesto,edad,estadocivil;

        ViewHolder(View ItemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.IconImagen);
            nombre  = itemView.findViewById(R.id.nombre);
            puesto = itemView.findViewById(R.id.puesto);





        }
void bindData(final Persona item){
           iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN );
           nombre.setText(item.getNombre());
           puesto.setText(item.getPuesto());




}


    }



}
