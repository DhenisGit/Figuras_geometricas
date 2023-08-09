package com.dhenis.polomorfismo.padres;

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

public class DadActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CardView btnBack;
    private DadAdapter dadAdapter;
    private Activity activity;
    private List<Dad> dadList;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dad);
        activity = DadActivity.this;
        btnBack = findViewById(R.id.a_dad_cv_back);
        recyclerView = findViewById(R.id.a_dad_rv_listDads);
        editText = findViewById(R.id.a_dad_edt_search);
        actions();
    }

    private void actions() {
        onCLick();
        dadAdapter();
    }

    private void dadAdapter() {
        dadList = ListGenerator.generateDadList();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(new DadAdapter(activity));
        dadAdapter = (DadAdapter) recyclerView.getAdapter();
        dadAdapter.setDadList(dadList);
        dadAdapter.notifyDataSetChanged();
    }

    private void onCLick() {
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
                List<Dad> filteredList = new ArrayList<>();
                for (Dad dad : dadList) {
                    String fullName = dad.getName().toLowerCase() + " " + dad.getApellido_p().toLowerCase() + " " + dad.getApellido_m().toLowerCase();
                    if (fullName.contains(searchText)) {
                        filteredList.add(dad);
                    }
                }
                dadAdapter.setDadListFiltered(filteredList);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}