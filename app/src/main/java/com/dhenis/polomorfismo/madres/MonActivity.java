package com.dhenis.polomorfismo.madres;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.utils.BrowseActivities;
import com.dhenis.polomorfismo.utils.ListGenerator;

import java.util.ArrayList;
import java.util.List;

public class MonActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardView btnBack;
    private MomAdapter momAdapter;
    private Activity activity;
    private List<Mom> momList;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon);
        activity = MonActivity.this;
        btnBack = findViewById(R.id.a_mom_cv_back);
        recyclerView = findViewById(R.id.a_dad_rv_listMoms);
        editText = findViewById(R.id.a_mom_edt_search);
        actions();
    }

    private void actions() {
        onClick();
        momAdapter();
    }

    private void momAdapter() {
        momList = ListGenerator.generateMomList();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new MomAdapter(activity));
        momAdapter = (MomAdapter) recyclerView.getAdapter();
        momAdapter.setMomList(momList);
        momAdapter.notifyDataSetChanged();
    }

    private void onClick() {
        btnBack.setOnClickListener(v -> {
            BrowseActivities.cambiarActividad(this, MainActivity.class);
            finish();
        });
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String searchText = charSequence.toString().toLowerCase();
                List<Mom> filteredList = new ArrayList<>();
                for (Mom mom : momList) {
                    String fullName = mom.getName().toLowerCase() + " " + mom.getApellido_p().toLowerCase() + " " + mom.getApellido_m().toLowerCase();
                    if (fullName.contains(searchText)) {
                        filteredList.add(mom);
                    }
                }
                momAdapter.setMomListFiltered(filteredList);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}