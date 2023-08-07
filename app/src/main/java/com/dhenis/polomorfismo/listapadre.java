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

public class listapadre extends AppCompatActivity {

    private PadreAdapter adapter;
    private SearchView searchView;
    private List<datos_padre> padreList;
    private List<datos_madre> madreList;
    private List<datos_hijos> hijoList;
    private List<datos_hija> hijaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listapadre);

        ListView listView = findViewById(R.id.ListaP);
        searchView = findViewById(R.id.miSearchView);

        padreList = obtenerListaPadresDirectamente();
        madreList = obtenerListaMadreDirectamente();
        hijoList = obtenerListaHijosDirectamente();
        hijaList = obtenerListaHijasDirectamente();
        adapter = new PadreAdapter(this, padreList);
        listView.setAdapter(adapter);
        listView.setDivider(null);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                datos_padre padreSeleccionado = padreList.get(position);
                datos_madre madreCorrespondiente = madreList.get(position);
                datos_hijos hijoSeleccionado = hijoList.get(position);
                datos_hija hijaCorrespondiente = hijaList.get(position);

                Intent intent = new Intent(listapadre.this, hijos.class);
                intent.putExtra("nombre", padreSeleccionado.getNombre());
                intent.putExtra("apellidoPaterno", padreSeleccionado.getApellidoPaterno());
                intent.putExtra("apellidoMaterno", padreSeleccionado.getApellidoMaterno());
                intent.putExtra("edad", padreSeleccionado.getEdad());

                // Pasar datos de la madre correspondiente
                intent.putExtra("nombreMadre", madreCorrespondiente.getNombreMadre());
                intent.putExtra("apellidoPaternoMadre", madreCorrespondiente.getApellidoPaterno_Madre());
                intent.putExtra("apellidoMaternoMadre", madreCorrespondiente.getApellidoMaterno_Madre());
                intent.putExtra("edadMadre", madreCorrespondiente.getEdad_Madre());

                // Pasar datos del hijo correspondiente
                intent.putExtra("nombreHijo", hijoSeleccionado.getNombre());
                intent.putExtra("nombreHija", hijaCorrespondiente.getNombre_Hija());
                intent.putExtra("edadHijo", hijoSeleccionado.getEdad());
                intent.putExtra("edadHija", hijaCorrespondiente.getEdadHija());

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

                startActivity(intent);
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

    private List<datos_padre> obtenerListaPadresDirectamente() {
        List<datos_padre> padreList = new ArrayList<>();
        padreList.add(new datos_padre(0, "Isaì", "Pinillos", "Carrasco", 30));
        padreList.add(new datos_padre(1, "Elsa", "Perez", "Lopez", 45));
        padreList.add(new datos_padre(2, "Maria", "Lopez", "Gomez", 28));
        padreList.add(new datos_padre(3, "Jorge", "Lopez", "Gomez", 28));
        padreList.add(new datos_padre(4, "Andrés", "Hernández", "Ramírez", 32));
        padreList.add(new datos_padre(5, "Carla", "González", "Ríos", 39));
        padreList.add(new datos_padre(6, "Roberto", "Sánchez", "Mendoza", 51));
        padreList.add(new datos_padre(7, "Luisa", "Martínez", "Vega", 29));
        padreList.add(new datos_padre(8, "Antonio", "Rodríguez", "Silva", 36));
        padreList.add(new datos_padre(9, "Laura", "Fernández", "Castillo", 42));
        padreList.add(new datos_padre(10, "Héctor", "Lara", "Chávez", 27));
        padreList.add(new datos_padre(11, "Sofía", "Morales", "Ortega", 33));
        padreList.add(new datos_padre(12, "Carlos", "Nava", "Soto", 40));
        padreList.add(new datos_padre(13, "Ana", "Jiménez", "Delgado", 47));
        padreList.add(new datos_padre(14, "Ricardo", "Pérez", "Mendoza", 28));
        padreList.add(new datos_padre(15, "Fernanda", "Vargas", "Reyes", 31));
        padreList.add(new datos_padre(16, "Juan", "García", "Santos", 52));
        padreList.add(new datos_padre(17, "Mónica", "Hernández", "Núñez", 38));
        padreList.add(new datos_padre(18, "Eduardo", "Ramos", "Ortega", 43));
        padreList.add(new datos_padre(19, "Paula", "Castro", "López", 25));
        padreList.add(new datos_padre(20, "Mario", "Chávez", "Flores", 41));
        padreList.add(new datos_padre(21, "Verónica", "Sánchez", "Hernández", 49));
        padreList.add(new datos_padre(22, "David", "Ramírez", "Guzmán", 30));
        padreList.add(new datos_padre(23, "Valentina", "Vega", "Cruz", 29));
        padreList.add(new datos_padre(24, "Alejandro", "Mendoza", "Pérez", 34));
        padreList.add(new datos_padre(25, "Camila", "López", "González", 37));
        padreList.add(new datos_padre(26, "José", "Delgado", "Fernández", 46));
        padreList.add(new datos_padre(27, "María", "Soto", "Hernández", 35));
        padreList.add(new datos_padre(28, "Daniel", "Nava", "Ríos", 32));
        padreList.add(new datos_padre(29, "Isabel", "Silva", "Martínez", 28));
        padreList.add(new datos_padre(30, "Francisco", "Castillo", "Hernández", 50));
        padreList.add(new datos_padre(31, "Julia", "Ortega", "Gómez", 27));
        padreList.add(new datos_padre(32, "Miguel", "Guzmán", "Sánchez", 31));
        padreList.add(new datos_padre(33, "Renata", "Pérez", "Mendoza", 39));
        padreList.add(new datos_padre(34, "Pedro", "Reyes", "García", 44));
        padreList.add(new datos_padre(35, "Lucía", "Núñez", "Ramírez", 26));
        padreList.add(new datos_padre(36, "Gonzalo", "Cruz", "Fernández", 43));
        padreList.add(new datos_padre(37, "Catalina", "López", "Vega", 30));
        padreList.add(new datos_padre(38, "Felipe", "Mendoza", "Ortega", 29));
        padreList.add(new datos_padre(39, "Antonia", "Hernández", "Castro", 35));
        padreList.add(new datos_padre(40, "Rafael", "Soto", "Chávez", 52));
        padreList.add(new datos_padre(41, "Valeria", "Gómez", "Pérez", 31));
        padreList.add(new datos_padre(42, "Javier", "Guzmán", "Ramírez", 30));
        padreList.add(new datos_padre(43, "Diana", "Mendoza", "López", 27));
        padreList.add(new datos_padre(44, "Ignacio", "Pérez", "Castillo", 38));
        padreList.add(new datos_padre(45, "Renata", "Fernández", "Ortega", 26));
        padreList.add(new datos_padre(46, "Mauricio", "Chávez", "Gómez", 34));
        padreList.add(new datos_padre(47, "Amanda", "López", "Ramírez", 48));
        padreList.add(new datos_padre(48, "Hugo", "Sánchez", "Mendoza", 29));
        padreList.add(new datos_padre(49, "Sofía", "Martínez", "Guzmán", 30));

        return padreList;
    }

    private List<datos_madre> obtenerListaMadreDirectamente() {
        List<datos_madre> madreList = new ArrayList<>();

        madreList.add(new datos_madre(0, "María", "Gómez", "López", 29));
        madreList.add(new datos_madre(1, "Ana", "Fernández", "Ramírez", 44));
        madreList.add(new datos_madre(2, "Laura", "Martínez", "Vega", 31));
        madreList.add(new datos_madre(3, "Sofía", "Rodríguez", "Silva", 38));
        madreList.add(new datos_madre(4, "Elena", "Pérez", "Mendoza", 33));
        madreList.add(new datos_madre(5, "Carolina", "Lara", "Chávez", 35));
        madreList.add(new datos_madre(6, "Isabel", "González", "Ríos", 50));
        madreList.add(new datos_madre(7, "Rosa", "Sánchez", "Hernández", 28));
        madreList.add(new datos_madre(8, "Patricia", "Nava", "Soto", 46));
        madreList.add(new datos_madre(9, "Luisa", "Cruz", "Ortega", 42));
        madreList.add(new datos_madre(10, "Carmen", "Hernández", "Gómez", 39));

        return madreList;
    }

    private List<datos_hijos> obtenerListaHijosDirectamente() {
        List<datos_hijos> hijoList = new ArrayList<>();

        hijoList.add(new datos_hijos(0, "Isaì", null, null, 10));
        hijoList.add(new datos_hijos(1, "Jorge", null, null, 8));
        hijoList.add(new datos_hijos(2, "Luis", null, null, 9));
        hijoList.add(new datos_hijos(3, "Carlos", null, null, 11));
        hijoList.add(new datos_hijos(4, "Andrés", null, null, 7));
        hijoList.add(new datos_hijos(5, "Miguel", null, null, 10));
        hijoList.add(new datos_hijos(6, "Juan", null, null, 9));
        hijoList.add(new datos_hijos(7, "Alejandro", null, null, 8));
        hijoList.add(new datos_hijos(8, "José", null, null, 12));
        hijoList.add(new datos_hijos(9, "David", null, null, 11));
        hijoList.add(new datos_hijos(10, "Francisco", null, null, 10));
        hijoList.add(new datos_hijos(11, "Diego", null, null, 9));
        hijoList.add(new datos_hijos(12, "Daniel", null, null, 7));
        hijoList.add(new datos_hijos(13, "Antonio", null, null, 8));
        hijoList.add(new datos_hijos(14, "Ricardo", null, null, 10));
        hijoList.add(new datos_hijos(15, "Roberto", null, null, 11));
        hijoList.add(new datos_hijos(16, "Eduardo", null, null, 9));
        hijoList.add(new datos_hijos(17, "Manuel", null, null, 12));
        hijoList.add(new datos_hijos(18, "Hugo", null, null, 8));
        hijoList.add(new datos_hijos(19, "Fernando", null, null, 10));
        hijoList.add(new datos_hijos(20, "Pedro", null, null, 11));
        hijoList.add(new datos_hijos(21, "Gustavo", null, null, 7));
        hijoList.add(new datos_hijos(22, "Sergio", null, null, 9));
        hijoList.add(new datos_hijos(23, "Lorenzo", null, null, 10));
        hijoList.add(new datos_hijos(24, "Rafael", null, null, 8));

        return hijoList;
    }


    private List<datos_hija> obtenerListaHijasDirectamente() {
        List<datos_hija> hijaList = new ArrayList<>();

        hijaList.add(new datos_hija(0, "María", null, null, 10));
        hijaList.add(new datos_hija(1, "Ana", null, null, 8));
        hijaList.add(new datos_hija(2, "Sofía", null, null, 9));
        hijaList.add(new datos_hija(3, "Carla", null, null, 11));
        hijaList.add(new datos_hija(4, "Elena", null, null, 7));
        hijaList.add(new datos_hija(5, "Luisa", null, null, 10));
        hijaList.add(new datos_hija(6, "Valeria", null, null, 9));
        hijaList.add(new datos_hija(7, "Camila", null, null, 8));
        hijaList.add(new datos_hija(8, "Isabel", null, null, 12));
        hijaList.add(new datos_hija(9, "Daniela", null, null, 11));
        hijaList.add(new datos_hija(10, "Fernanda", null, null, 10));
        hijaList.add(new datos_hija(11, "Laura", null, null, 9));
        hijaList.add(new datos_hija(12, "Alicia", null, null, 7));
        hijaList.add(new datos_hija(13, "Giselle", null, null, 8));
        hijaList.add(new datos_hija(14, "Valentina", null, null, 10));
        hijaList.add(new datos_hija(15, "Roberta", null, null, 11));
        hijaList.add(new datos_hija(16, "Lucía", null, null, 9));
        hijaList.add(new datos_hija(17, "Carmen", null, null, 12));
        hijaList.add(new datos_hija(18, "Fabiola", null, null, 8));
        hijaList.add(new datos_hija(19, "Andrea", null, null, 10));
        hijaList.add(new datos_hija(20, "Patricia", null, null, 11));
        hijaList.add(new datos_hija(21, "Gloria", null, null, 7));
        hijaList.add(new datos_hija(22, "Lorena", null, null, 9));
        hijaList.add(new datos_hija(23, "Martha", null, null, 10));
        hijaList.add(new datos_hija(24, "Rosa", null, null, 8));

        return hijaList;
    }

}
