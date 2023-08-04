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

public class MatherActivity extends AppCompatActivity {
    List<ListElement> matherList;

    ConstraintLayout conslay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mather);

        conslay = findViewById(R.id.btn_return1);
        init();

        conslay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatherActivity.this, MainActivity.class));
            }
        });
    }

    private void init() {
        matherList = new ArrayList<>();
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));
        matherList.add(new ListElement("#123456", "Luz", "Mendoza", "Chavez", "Limpieza", 31, "S"));


        ListAdapter listAdapterMather = new ListAdapter(matherList, this);
        RecyclerView recyclerView = findViewById(R.id.list_mather);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapterMather);
    }
}