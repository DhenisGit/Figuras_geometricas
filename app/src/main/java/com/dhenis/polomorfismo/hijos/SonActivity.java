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
import com.dhenis.polomorfismo.padres.Dad;
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
        /*==============================DAD==============================
        int selectedIdDad2 = getIntent().getIntExtra("id", -1);
        if (selectedIdDad2 != -1) saveDataDad(selectedIdDad2 - 1);
        ==============================MOM==============================
        int selectedIdMom2 = getIntent().getIntExtra("id", -1);
        if (selectedIdMom2 != -1) saveDataMom(selectedIdMom2 - 1);*/
        int selectedId = getIntent().getIntExtra("id", -1);
        if (selectedId != -1) {
            saveDataDad(selectedId - 1);
            saveDataMom(selectedId - 1);
        }
    }

    private void onClick() {
        btnBack.setOnClickListener(v -> {
            BrowseActivities.cambiarActividad(activity, MainActivity.class);
            finish();
        });
    }

    private void saveDataDad(int id) {
        /*==========================DAD=================================*/
        Dad selectedDad = ListGenerator.generateDadList().get(id);
        String fullNameDad = selectedDad.getName() + " " + selectedDad.getApellido_p() + " " + selectedDad.getApellido_m();
        String imgUrlDad = selectedDad.getImage_url().toString();
        Picasso.get().load(imgUrlDad).error(R.drawable.ic_launcher_background).into(imgDad);
        txtFullNameDad.setText(fullNameDad);
    }

    private void saveDataMom(int id) {
        /*==========================MOM=================================*/
        Mom selectedMom = ListGenerator.generateMomList().get(id);
        String fullNameMom = selectedMom.getName() + " " + selectedMom.getApellido_p() + " " + selectedMom.getApellido_m();
        String imgUrlMom = selectedMom.getImage_url().toString();
        Picasso.get().load(imgUrlMom).error(R.drawable.ic_launcher_background).into(imgMom);
        txtFullNameMom.setText(fullNameMom);
    }

    private void sonAdapter() {
        /*int selectedId = getIntent().getIntExtra("id", -1);
        ListGenerator.assignSonNamesAndSurnames(selectedId);
        List<Son> matchingSons = ListGenerator.findSonsByDadId(selectedId);
        // Inicializa el adaptador con la lista de hijos correspondientes
        sonAdapter = new SonAdapter(matchingSons);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sonAdapter);

        // Llama al método setSonList para actualizar la lista en el adaptador
        sonAdapter.setSonList(matchingSons);*/
        int selectedId = getIntent().getIntExtra("id", -1);
        List<Son> matchingSons = ListGenerator.findSonsByDadId(selectedId);

        // Inicializa el adaptador con la lista de hijos correspondientes
        sonAdapter = new SonAdapter(matchingSons);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sonAdapter);

        // Llama al método setSonList para actualizar la lista en el adaptador
        sonAdapter.setSonList(matchingSons);
    }

}