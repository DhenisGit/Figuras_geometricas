package com.dhenis.polomorfismo.padres;

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

public class DadAdapter extends RecyclerView.Adapter<DadAdapter.ViewHolder> {
    private Activity activity;
    private List<Dad> dadList;

    public DadAdapter(Activity activity) {
        this.activity = activity;
        this.dadList = new ArrayList<>();
    }

    public void setDadList(List<Dad> dadList) {
        this.dadList.clear();
        this.dadList = new ArrayList<>(dadList);
    }

    public void setDadListFiltered(List<Dad> filteredList) {
        dadList = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public DadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_parents, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DadAdapter.ViewHolder holder, int position) {
        Dad dad = dadList.get(position);
        holder.txtFullName.setText(dad.getName() + " " + dad.getApellido_p() + " " + dad.getApellido_m());
        holder.txtJob.setText(dad.getPuesto_laboral());
        holder.txtAge.setText(dad.getEdad().toString() + " años");
        holder.txtCivilStatus.setText(dad.getEstado_civil());
        String url_profile = dad.getImage_url();
        Picasso.get().load(url_profile).error(R.drawable.ic_launcher_background).into(holder.imgProfile);
    }

    @Override
    public int getItemCount() {
        return dadList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtFullName, txtJob, txtAge, txtCivilStatus;
        private ImageView imgProfile;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtFullName = itemView.findViewById(R.id.i_prts_txtFullName);
            imgProfile = itemView.findViewById(R.id.i_prts_imgProfile);
            txtJob = itemView.findViewById(R.id.i_prts_txtJob);
            txtAge = itemView.findViewById(R.id.i_prts_txtAge);
            txtCivilStatus = itemView.findViewById(R.id.i_prts_txtCivilStatus);

        }
    }
}
