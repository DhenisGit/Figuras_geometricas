package com.dhenis.polomorfismo.listado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;

import com.dhenis.polomorfismo.modelos.ListAdapter;
import com.dhenis.polomorfismo.modelos.ListElement;

import java.util.ArrayList;
import java.util.List;

public class FatherActivity extends AppCompatActivity {
    private List<ListElement> elements;

    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father);

        cl =  findViewById(R.id.btn_return);

        cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FatherActivity.this, MainActivity.class));
            }
        });

        init();
    }

    private void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "H", "L", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElement("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));

        ListAdapter listAdapterFather = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapterFather);
    }
}