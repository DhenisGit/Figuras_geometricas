package com.dhenis.polomorfismo.hijos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.madres.Mom;
import com.dhenis.polomorfismo.madres.MomAdapter;
import com.dhenis.polomorfismo.padres.Dad;
import com.dhenis.polomorfismo.padres.DadAdapter;
import com.dhenis.polomorfismo.utils.BrowseActivities;
import com.dhenis.polomorfismo.utils.ListGenerator;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SonActivity extends AppCompatActivity {
    private static final String TAG = SonActivity.class.getSimpleName();
    private TextView txtFullNameDad, txtFullNameMom;
    private RecyclerView recyclerView;
    private CardView btnBack;
    private Activity activity;
    private List<Son> sonList;
    private SonAdapter sonAdapter;
    private ImageView imgDad, imgMom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_son);
        activity = SonActivity.this;
        recyclerView = findViewById(R.id.a_son_rv_listSons);
        imgDad = findViewById(R.id.a_son_img_Dad);
        imgMom = findViewById(R.id.a_son_img_Mom);
        txtFullNameDad = findViewById(R.id.a_son_txt_fullNameDad);
        txtFullNameMom = findViewById(R.id.a_son_txt_fullNameMon);
        btnBack = findViewById(R.id.a_son_cv_back);
        actions();
    }

    private void actions() {
        onClick();
        sonAdapter();
        int selectedPositionDad = getIntent().getIntExtra("selectedPosition", -1);
        if (selectedPositionDad != -1) saveDataDad(selectedPositionDad);

        int selectedPositionMom = getIntent().getIntExtra("selectedPosition", -1);
        if (selectedPositionMom != -1) saveDataMom(selectedPositionMom);
//        int selectedPosition = getIntent().getIntExtra("selectedPosition", -1);
       /* if (selectedPosition != -1) {
            Son selectedSon = sonList.get(selectedPosition);
            Dad selectedDad = selectedSon.getDad();
            Mom selectedMom = selectedSon.getMom();

            if (selectedDad != null) {
                saveDataDad(selectedDad);
            }

            if (selectedMom != null) {
                saveDataMom(selectedMom);
            }
        }*/
    }

    private void onClick() {
        btnBack.setOnClickListener(v -> {
            BrowseActivities.cambiarActividad(activity, MainActivity.class);
            finish();
        });
    }

    private void saveDataDad(int position) {
        /*==========================DAD=================================*/
        Dad selectedDad = ListGenerator.generateDadList().get(position);
        String fullNameDad = selectedDad.getName() + " " + selectedDad.getApellido_p() + " " + selectedDad.getApellido_m();
        String imgUrlDad = selectedDad.getImage_url().toString();
        Picasso.get().load(imgUrlDad).error(R.drawable.ic_launcher_background).into(imgDad);
        txtFullNameDad.setText(fullNameDad);
    }

    private void saveDataMom(int position) {
        /*==========================MOM=================================*/
        Mom selectedMom = ListGenerator.generateMomList().get(position);
        String fullNameMom = selectedMom.getName() + " " + selectedMom.getApellido_p() + " " + selectedMom.getApellido_m();
        String imgUrlMom = selectedMom.getImage_url().toString();
        Picasso.get().load(imgUrlMom).error(R.drawable.ic_launcher_background).into(imgMom);
        txtFullNameMom.setText(fullNameMom);
    }
    private void sonAdapter() {
        sonList = ListGenerator.generateSonList();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new SonAdapter(activity));
        sonAdapter = (SonAdapter) recyclerView.getAdapter();
        sonAdapter.setSonList(sonList);
        sonAdapter.notifyDataSetChanged();
    }
}