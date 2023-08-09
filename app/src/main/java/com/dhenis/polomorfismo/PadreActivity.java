package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;


public class PadreActivity extends AppCompatActivity {

    private SearchView searchView;
    private AdapterP adapterP;
    private List<Padre> Listas_padre;
    private List<Madre> Listas_madre;
    private List<Hija> Listas_hija;
    private List<Hijo> Listas_hijo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_padre);
        ListView listView = findViewById(R.id.Padre_lista);
        searchView = findViewById(R.id.buscador_padre);
        Listas_padre = Vista_Lista_Padre();
        adapterP = new AdapterP(this, Listas_padre);
        Listas_madre = Vista_Lista_Madre();
        Listas_hijo = Vista_Lista_Hijo();
        Listas_hija = Vista_Lista_Hija();

        listView.setAdapter(adapterP);
        listView.setDivider(null);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Padre padre_designado = Listas_padre.get(position);
                Madre madre_designado= Listas_madre.get(position);
                Hijo hijo_designado = Listas_hijo.get(position);
                Hija hija_designado = Listas_hija.get(position);
                Intent intent = new Intent(PadreActivity.this, HijoActivity.class);
                intent.putExtra("nombrePadre", padre_designado.getNombre());
                intent.putExtra("apellidoPaterno_padre", padre_designado.getApellido_p());
                intent.putExtra("apellidoMaterno_padre", padre_designado.getApliido_m());
                intent.putExtra("edad_padre", padre_designado.getEdad());

                // Pasar datos de la madre correspondiente
                intent.putExtra("nombreMadre", madre_designado.getNombre_madre());
                intent.putExtra("apellidoPaternoMadre", madre_designado.getApellido_p_madre());
                intent.putExtra("apellidoMaternoMadre", madre_designado.getApellido_m_madre());
                intent.putExtra("edadMadre", madre_designado.getEdad_madre());

                // Pasar datos del hijo correspondiente
                intent.putExtra("nombreHijo", hijo_designado.getNombre_hijo());
                intent.putExtra("nombreHija", hija_designado.getNombre_hija());
                intent.putExtra("edadHijo", hijo_designado.getEdad_hijo());
                intent.putExtra("edadHija", hija_designado.getEdad_hija());
                startActivity(intent);
            }
        });
        ImageView regresar = findViewById(R.id.btnRegresar2);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private List<Padre> Vista_Lista_Padre(){
        List<Padre> Padre_lista = new ArrayList<>();
        Padre_lista.add(new Padre(0, "Isai", "Pinillos", "Montalban", 30));
        Padre_lista.add(new Padre(1, "John", "Doe", "Smith", 40));
        Padre_lista.add(new Padre(2, "Kevin", "Doe", "Johnson", 35));
        Padre_lista.add(new Padre(3, "Michael", "Smith", "Brown", 28));
        Padre_lista.add(new Padre(4, "Samuel", "Johnson", "Davis", 45));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nuevo_Texto) {
                adapterP.getFilter().filter(nuevo_Texto);
                return true;
            }
        });
        return Padre_lista;
    }
    private List<Madre> Vista_Lista_Madre(){
        List<Madre> Madre_lista = new ArrayList<>();
        Madre_lista.add(new Madre(0,"Maria","Mendoza","Gomez",25));
        Madre_lista.add(new Madre(1,"Luisa","Rodriguez","Martinez",32));
        Madre_lista.add(new Madre(2,"Ana","Perez","Lopez",28));
        Madre_lista.add(new Madre(3,"Elena","Garcia","Fernandez",36));
        Madre_lista.add(new Madre(4,"Carmen","Sanchez","Alvarez",30));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String nuevo_Texto) {
                adapterP.getFilter().filter(nuevo_Texto);
                return false;
            }
        });
        return Madre_lista;
    }
    private List<Hijo> Vista_Lista_Hijo(){
        List<Hijo> Hijo_lista = new ArrayList<>();
        Hijo_lista.add(new Hijo(0,"Martin",null,null,12));
        Hijo_lista.add(new Hijo(1,"Juan",null,null,10));
        Hijo_lista.add(new Hijo(2,"Luis",null,null,14));
        Hijo_lista.add(new Hijo(3,"Diego",null,null,8));
        Hijo_lista.add(new Hijo(4,"Carlos",null,null,9));
        return Hijo_lista;
    }
    private List<Hija> Vista_Lista_Hija(){
        List<Hija> Hija_lista = new ArrayList<>();
        Hija_lista.add(new Hija(0,"Yasuri",null,null,13));
        Hija_lista.add(new Hija(1,"Laura",null,null,15));
        Hija_lista.add(new Hija(2,"Sofia",null,null,11));
        Hija_lista.add(new Hija(3,"Isabella",null,null,9));
        Hija_lista.add(new Hija(4,"Valentina",null,null,7));
        return Hija_lista;
    }
}
