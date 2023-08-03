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

import com.dhenis.polomorfismo.modelos.ListAdapterFather;
import com.dhenis.polomorfismo.modelos.ListElementFather;

import java.util.ArrayList;
import java.util.List;

public class FatherActivity extends AppCompatActivity {
    List<ListElementFather> elements;

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

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));
        elements.add(new ListElementFather("#123456", "Diego", "Mendoza", "Chavez", "Limpieza", 31, "C"));

        ListAdapterFather listAdapterFather = new ListAdapterFather(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapterFather);
    }
}