package com.dhenis.polomorfismo.listado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;

import com.dhenis.polomorfismo.modelos.Father;
import com.dhenis.polomorfismo.modelos.ListAdapter;
import com.dhenis.polomorfismo.modelos.Element;

import java.util.ArrayList;
import java.util.List;

public class FatherActivity extends AppCompatActivity {
    EditText etBus;
    ListAdapter listAdapterFather;
    public List<Element> elements;

    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father);

        cl = findViewById(R.id.btn_return);
        etBus = findViewById(R.id.etBuscar);
        etBus.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String searchText = s.toString().toLowerCase();
                List<Element> filteredList = new ArrayList<>();
                for (Element father1 : elements) {
                    String fullName = father1.getName().toLowerCase() + " " + father1.getApellido_p().toLowerCase() + " " + father1.getApellido_m().toLowerCase();
                    if (fullName.contains(searchText)) {
                        filteredList.add(father1);
                    }
                }
                listAdapterFather.setListFilter(filteredList);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

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
        elements.add(new Element(0, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Diego", "Mendoza", "Chavez", 41, "Limpieza", "C"));
        elements.add(new Element(1, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Eddie", "Elvon", "Carrion", 55, "Administrador", "C"));
        elements.add(new Element(2, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Luis", "Molina", "Lopez", 41, "Programador", "C"));
        elements.add(new Element(3, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Lazlo", "Escobar", "Perez", 41, "Asistente", "C"));
        elements.add(new Element(4, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Efrain", "Malca", "Mendez", 41, "Secretario", "C"));
        elements.add(new Element(5, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Edgar", "Periera", "LaLo", 41, "Futbolista", "C"));
        elements.add(new Element(6, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Cesar", "Messi", "Centuron", 41, "Psicólogo", "C"));
        elements.add(new Element(7, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Jorge", "Kovaks", "Horna", 41, "Doctor", "C"));
        elements.add(new Element(8, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Mario", "Gonsalez", "Culon", 41, "Maestro", "C"));
        elements.add(new Element(9, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Jhon", "Besso", "Ormeño", 41, "Arquitecto", "C"));
        elements.add(new Element(10, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Dhenis", "Burgos", "Aguado", 41, "Gerente", "C"));
        elements.add(new Element(11, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Jhonatan", "Huaman", "Ambrosio", 41, "Vendedor", "D"));
        elements.add(new Element(12, "https://cdn-icons-png.flaticon.com/512/3048/3048150.png", "Israel", "Salinas", "Titto", 41, "Pescador", "S"));
        elements.add(new Element(13, "https://cdn-icons-png.flaticon.com/512/7703/7703912.png", "Marcos", "Quiroz", "Catalan", 41, "Conductor", "D"));

        listAdapterFather = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRV);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapterFather);
    }
}