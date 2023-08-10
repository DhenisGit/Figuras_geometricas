package com.dhenis.polomorfismo.hijos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class SonAdapter extends RecyclerView.Adapter<SonAdapter.ViewHolder> {
    private Activity activity;
    private List<Son> sonList;

    public SonAdapter(List<Son> sonList) {
        this.sonList = sonList;
    }

    public void setSonList(List<Son> sonList) {
        this.sonList = sonList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SonAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_son, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SonAdapter.ViewHolder holder, int position) {
        Son son = sonList.get(position);
        holder.txtFullName.setText(son.getName() + " " + son.getApellido_p() + " " + son.getApellido_m());
        holder.txtAge.setText(son.getEdad().toString() + " años");
        String url_profile = son.getImage_url();
        Picasso.get().load(url_profile).error(R.drawable.ic_launcher_background).into(holder.imgProfile);
    }

    @Override
    public int getItemCount() {
        return sonList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtFullName, txtAge;
        private ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFullName = itemView.findViewById(R.id.i_son_txtFullName);
            imgProfile = itemView.findViewById(R.id.i_son_imgProfile);
            txtAge = itemView.findViewById(R.id.i_son_txtAge);
        }
    }
}
