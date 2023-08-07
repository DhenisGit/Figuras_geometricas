package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listamadre extends AppCompatActivity {

    private MadreAdapter adapter;
    private SearchView searchView;
    private List<datos_madre> madreList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listamadre);

        ListView listView = findViewById(R.id.ListaM);
        searchView = findViewById(R.id.miSearchView);

        madreList = obtenerListaMadreDirectamente();

        adapter = new MadreAdapter(this, madreList);
        listView.setAdapter(adapter);
        listView.setDivider(null);

        View includeMadre = findViewById(R.id.includeMadre); // Mueve esta línea aquí

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(listamadre.this, hijos.class);
                startActivity(intent);
            }
        });


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return true;
            }
        });

        ImageView btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private List<datos_madre> obtenerListaMadreDirectamente() {
        List<datos_madre> madreList = new ArrayList<>();

        madreList.add(new datos_madre(1, "Isaì", "Pinillos", "Carrasco", 30));
        madreList.add(new datos_madre(2, "Elsa", "Perez", "Lopez", 45));
        madreList.add(new datos_madre(3, "Maria", "Lopez", "Gomez", 28));
        madreList.add(new datos_madre(4, "Jorge", "Lopez", "Gomez", 28));
        madreList.add(new datos_madre(5, "Andrés", "Hernández", "Ramírez", 32));
        madreList.add(new datos_madre(6, "Carla", "González", "Ríos", 39));
        madreList.add(new datos_madre(7, "Roberto", "Sánchez", "Mendoza", 51));
        madreList.add(new datos_madre(8, "Luisa", "Martínez", "Vega", 29));
        madreList.add(new datos_madre(9, "Antonio", "Rodríguez", "Silva", 36));
        madreList.add(new datos_madre(10, "Laura", "Fernández", "Castillo", 42));
        madreList.add(new datos_madre(11, "Héctor", "Lara", "Chávez", 27));

        return madreList;
    }
}
