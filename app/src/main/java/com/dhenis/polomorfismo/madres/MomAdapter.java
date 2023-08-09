package com.dhenis.polomorfismo.madres;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.hijos.SonActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MomAdapter extends RecyclerView.Adapter<MomAdapter.ViewHolder> {
    private Activity activity;
    private List<Mom> momList;

    public MomAdapter(Activity activity) {
        this.activity = activity;
        this.momList = new ArrayList<>();
    }

    public void setMomList(List<Mom> momList) {
        this.momList.clear();
        this.momList = new ArrayList<>(momList);
    }
    public void setMomListFiltered(List<Mom> filteredList) {
        momList = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MomAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_parents, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MomAdapter.ViewHolder holder, int position) {
        Mom mom = momList.get(position);
        holder.txtFullName.setText(mom.getName() + " " + mom.getApellido_p() + " " + mom.getApellido_m());
        holder.txtJob.setText(mom.getPuesto_laboral());
        holder.txtAge.setText(mom.getEdad().toString() + " años");
        holder.txtCivilStatus.setText(mom.getEstado_civil());
        String url_profile = mom.getImage_url();
        Picasso.get().load(url_profile).error(R.drawable.ic_launcher_background).into(holder.imgProfile);

        String fullName = mom.getName() + " " + mom.getApellido_p() + " " + mom.getApellido_m();
        holder.cv_item.setOnClickListener(v -> {
            Intent intent = new Intent(activity, SonActivity.class);
            intent.putExtra("nameMom", fullName);
            activity.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return momList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtFullName, txtJob, txtAge, txtCivilStatus;
        private ImageView imgProfile;
        private CardView cv_item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFullName = itemView.findViewById(R.id.i_prts_txtFullName);
            imgProfile = itemView.findViewById(R.id.i_prts_imgProfile);
            txtJob = itemView.findViewById(R.id.i_prts_txtJob);
            txtAge = itemView.findViewById(R.id.i_prts_txtAge);
            txtCivilStatus = itemView.findViewById(R.id.i_prts_txtCivilStatus);
            cv_item = itemView.findViewById(R.id.i_prts_cv);
        }
    }
}
