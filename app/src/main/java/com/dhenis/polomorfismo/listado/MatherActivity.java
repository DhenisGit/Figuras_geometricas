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

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.modelos.ListAdapter;
import com.dhenis.polomorfismo.modelos.Element;
import com.dhenis.polomorfismo.modelos.Mather;

import java.util.ArrayList;
import java.util.List;

public class MatherActivity extends AppCompatActivity {
    List<Element> matherList;
    EditText etBusc;
    ListAdapter listAdapterMather;
    ConstraintLayout conslay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mather);

        conslay = findViewById(R.id.btn_return1);
        etBusc = findViewById(R.id.etBuscar1);
        init();

        etBusc.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                String searchText = s.toString().toLowerCase();
                List<Element> filteredList = new ArrayList<>();
                for (Element father1 : matherList) {
                    String fullName = father1.getName().toLowerCase() + " " + father1.getApellido_p().toLowerCase() + " " + father1.getApellido_m().toLowerCase();
                    if (fullName.contains(searchText)) {
                        filteredList.add(father1);
                    }
                }
                listAdapterMather.setListFilter(filteredList);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        conslay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MatherActivity.this, MainActivity.class));
            }
        });
    }

    private void init() {
        matherList = new ArrayList<>();
        matherList.add(new Element(0, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Luz", "Medina", "Quiroz", 34, "Secretaria", "C"));
        matherList.add(new Element(1, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Lucia", "Corzo", "Plata", 34, "Limpieza", "C"));
        matherList.add(new Element(2, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "JImena", "Diaz", "Chong", 34, "Abogada", "C"));
        matherList.add(new Element(3, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Lizbeth", "Fernandez", "Banega", 34, "Gerente", "C"));
        matherList.add(new Element(4, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Deysi", "Torres", "Milito", 34, "Doctora", "C"));
        matherList.add(new Element(5, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Manuela", "Ramiro", "Lopez", 34, "Veterinaria", "C"));
        matherList.add(new Element(6, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Alma", "Baltodano", "Vargas", 34, "Podologa", "C"));
        matherList.add(new Element(7, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Emely", "Malca", "Guerrero", 34, "Contabilidad", "C"));
        matherList.add(new Element(8, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Jessica", "Huella", "Hurtado", 34, "Ingeniera", "C"));
        matherList.add(new Element(9, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Nore", "Ballon", "Vivar", 34, "Operadora", "C"));
        matherList.add(new Element(10, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Sara", "Sicado", "Gallese", 34, "Mesera", "C"));
        matherList.add(new Element(11, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Maria", "Espinoza", "Ramos", 34, "Chef", "D"));
        matherList.add(new Element(12, "https://cdn3.iconfinder.com/data/icons/family-member-flat-happy-family-day/512/Mother-512.png", "Rosa", "Carbon", "Santimaria", 34, "Asesora", "S"));
        matherList.add(new Element(13, "https://cdn-icons-png.flaticon.com/512/4599/4599017.png", "Ana", "Teros", "Callens", 34, "RR.HH", "D"));


        listAdapterMather = new ListAdapter(matherList, this);
        RecyclerView recyclerView = findViewById(R.id.list_mather);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapterMather);
    }
}