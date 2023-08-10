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
                intent.putExtra("nombrePadre", padreSeleccionado.getNombre());
                intent.putExtra("apellidoPaterno_padre", padreSeleccionado.getApellidoPaterno());
                intent.putExtra("apellidoMaterno_padre", padreSeleccionado.getApellidoMaterno());
                intent.putExtra("edad_padre", padreSeleccionado.getEdad());

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

        padreList.add(new datos_padre(0, "Pedro", "Pinillos", "Carrasco", 30));
        padreList.add(new datos_padre(1, "Luis", "Perez", "Lopez", 45));
        padreList.add(new datos_padre(2, "Juan", "Lopez", "Gomez", 28));
        padreList.add(new datos_padre(3, "Miguel", "Lopez", "Gomez", 28));
        padreList.add(new datos_padre(4, "Andrés", "Hernández", "Ramírez", 32));
        padreList.add(new datos_padre(5, "Carlos", "González", "Ríos", 39));
        padreList.add(new datos_padre(6, "Roberto", "Sánchez", "Mendoza", 51));
        padreList.add(new datos_padre(7, "Alejandro", "Martínez", "Vega", 29));
        padreList.add(new datos_padre(8, "Antonio", "Rodríguez", "Silva", 36));
        padreList.add(new datos_padre(9, "Javier", "Fernández", "Castillo", 42));
        padreList.add(new datos_padre(10, "Héctor", "Lara", "Chávez", 27));
        padreList.add(new datos_padre(11, "Daniel", "Morales", "Ortega", 33));
        padreList.add(new datos_padre(12, "Carlos", "Nava", "Soto", 40));
        padreList.add(new datos_padre(13, "José", "Jiménez", "Delgado", 47));
        padreList.add(new datos_padre(14, "Ricardo", "Pérez", "Mendoza", 28));
        padreList.add(new datos_padre(15, "Fernando", "Vargas", "Reyes", 31));
        padreList.add(new datos_padre(16, "David", "García", "Santos", 52));
        padreList.add(new datos_padre(17, "Eduardo", "Hernández", "Núñez", 38));
        padreList.add(new datos_padre(18, "Gabriel", "Ramos", "Ortega", 43));
        padreList.add(new datos_padre(19, "Miguel", "Castro", "López", 25));
        padreList.add(new datos_padre(20, "Mario", "Chávez", "Flores", 41));
        padreList.add(new datos_padre(21, "Luis", "Sánchez", "Hernández", 49));
        padreList.add(new datos_padre(22, "David", "Ramírez", "Guzmán", 30));
        padreList.add(new datos_padre(23, "Andrés", "Vega", "Cruz", 29));
        padreList.add(new datos_padre(24, "Alejandro", "Mendoza", "Pérez", 34));
        padreList.add(new datos_padre(25, "Jorge", "López", "González", 37));
        padreList.add(new datos_padre(26, "José", "Delgado", "Fernández", 46));
        padreList.add(new datos_padre(27, "Manuel", "Soto", "Hernández", 35));
        padreList.add(new datos_padre(28, "Daniel", "Nava", "Ríos", 32));
        padreList.add(new datos_padre(29, "Fernando", "Silva", "Martínez", 28));
        padreList.add(new datos_padre(30, "Francisco", "Castillo", "Hernández", 50));
        padreList.add(new datos_padre(31, "Juan", "Ortega", "Gómez", 27));
        padreList.add(new datos_padre(32, "Miguel", "Guzmán", "Sánchez", 31));
        padreList.add(new datos_padre(33, "Rafael", "Pérez", "Mendoza", 39));
        padreList.add(new datos_padre(34, "Luis", "Reyes", "García", 44));
        padreList.add(new datos_padre(35, "Juan", "Núñez", "Ramírez", 26));
        padreList.add(new datos_padre(36, "Fernando", "Cruz", "Fernández", 43));
        padreList.add(new datos_padre(37, "Felipe", "López", "Vega", 30));
        padreList.add(new datos_padre(38, "Rafael", "Mendoza", "Ortega", 29));
        padreList.add(new datos_padre(39, "Antonio", "Hernández", "Castro", 35));
        padreList.add(new datos_padre(40, "Hugo", "Soto", "Chávez", 52));
        padreList.add(new datos_padre(41, "Luis", "Gómez", "Pérez", 31));
        padreList.add(new datos_padre(42, "Javier", "Guzmán", "Ramírez", 30));
        padreList.add(new datos_padre(43, "José", "Mendoza", "López", 27));
        padreList.add(new datos_padre(44, "Francisco", "Pérez", "Castillo", 38));
        padreList.add(new datos_padre(45, "Miguel", "Fernández", "Ortega", 26));
        padreList.add(new datos_padre(46, "Mauricio", "Chávez", "Gómez", 34));
        padreList.add(new datos_padre(47, "Pablo", "López", "Ramírez", 48));
        padreList.add(new datos_padre(48, "Hugo", "Sánchez", "Mendoza", 29));
        padreList.add(new datos_padre(49, "Fernando", "Martínez", "Guzmán", 30));

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
        madreList.add(new datos_madre(11, "Mónica", "Ramos", "López", 27));
        madreList.add(new datos_madre(12, "Alejandra", "Soto", "Fernández", 37));
        madreList.add(new datos_madre(13, "Gloria", "Guzmán", "Martínez", 29));
        madreList.add(new datos_madre(14, "Beatriz", "Vargas", "Ramírez", 34));
        madreList.add(new datos_madre(15, "Verónica", "Díaz", "Silva", 40));
        madreList.add(new datos_madre(16, "Catalina", "Castro", "Mendoza", 31));
        madreList.add(new datos_madre(17, "Valeria", "Pérez", "Gómez", 26));
        madreList.add(new datos_madre(18, "Eva", "López", "Hernández", 41));
        madreList.add(new datos_madre(19, "Pamela", "García", "Vega", 36));
        madreList.add(new datos_madre(20, "Margarita", "Martínez", "Silva", 47));
        madreList.add(new datos_madre(21, "Lorena", "González", "Ramírez", 32));
        madreList.add(new datos_madre(22, "Juana", "Pérez", "López", 45));
        madreList.add(new datos_madre(23, "Raquel", "Rodríguez", "Silva", 28));
        madreList.add(new datos_madre(24, "Cecilia", "Lara", "Chávez", 33));
        madreList.add(new datos_madre(25, "Mireya", "Sánchez", "Hernández", 29));
        madreList.add(new datos_madre(26, "Fabiola", "Nava", "Soto", 36));
        madreList.add(new datos_madre(27, "Roxana", "Cruz", "Ortega", 42));
        madreList.add(new datos_madre(28, "Jimena", "Hernández", "Gómez", 27));
        madreList.add(new datos_madre(29, "Adriana", "Ramos", "López", 35));
        madreList.add(new datos_madre(30, "Claudia", "Soto", "Fernández", 46));
        madreList.add(new datos_madre(31, "Daniela", "Guzmán", "Martínez", 30));
        madreList.add(new datos_madre(32, "Jazmín", "Vargas", "Ramírez", 29));
        madreList.add(new datos_madre(33, "Fernanda", "Díaz", "Silva", 32));
        madreList.add(new datos_madre(34, "Miriam", "Castro", "Mendoza", 39));
        madreList.add(new datos_madre(35, "Karina", "Pérez", "Gómez", 27));
        madreList.add(new datos_madre(36, "Paulina", "López", "Hernández", 34));
        madreList.add(new datos_madre(37, "Ruth", "García", "Vega", 37));
        madreList.add(new datos_madre(38, "Abril", "Martínez", "Silva", 25));
        madreList.add(new datos_madre(39, "Gabriela", "González", "Ramírez", 30));
        madreList.add(new datos_madre(40, "Diana", "Pérez", "López", 28));
        madreList.add(new datos_madre(41, "Estela", "Rodríguez", "Silva", 31));
        madreList.add(new datos_madre(42, "Victoria", "Lara", "Chávez", 24));
        madreList.add(new datos_madre(43, "Lucía", "Sánchez", "Hernández", 26));
        madreList.add(new datos_madre(44, "Olga", "Nava", "Soto", 33));
        madreList.add(new datos_madre(45, "Natalia", "Cruz", "Ortega", 30));
        madreList.add(new datos_madre(46, "Camila", "Hernández", "Gómez", 29));
        madreList.add(new datos_madre(47, "Patricia", "Ramos", "López", 32));
        madreList.add(new datos_madre(48, "Cinthia", "Soto", "Fernández", 28));
        madreList.add(new datos_madre(49, "Alicia", "Guzmán", "Martínez", 31));

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
        hijoList.add(new datos_hijos(25, "Enrique", null, null, 10));
        hijoList.add(new datos_hijos(26, "Mariano", null, null, 9));
        hijoList.add(new datos_hijos(27, "Agustín", null, null, 11));
        hijoList.add(new datos_hijos(28, "Óscar", null, null, 7));
        hijoList.add(new datos_hijos(29, "Emilio", null, null, 8));
        hijoList.add(new datos_hijos(30, "Nicolás", null, null, 10));
        hijoList.add(new datos_hijos(31, "Matías", null, null, 11));
        hijoList.add(new datos_hijos(32, "Arturo", null, null, 9));
        hijoList.add(new datos_hijos(33, "Benjamín", null, null, 12));
        hijoList.add(new datos_hijos(34, "Adrián", null, null, 8));
        hijoList.add(new datos_hijos(35, "Óliver", null, null, 10));
        hijoList.add(new datos_hijos(36, "Leonardo", null, null, 9));
        hijoList.add(new datos_hijos(37, "Pablo", null, null, 7));
        hijoList.add(new datos_hijos(38, "Víctor", null, null, 8));
        hijoList.add(new datos_hijos(39, "Mario", null, null, 10));
        hijoList.add(new datos_hijos(40, "Rubén", null, null, 11));
        hijoList.add(new datos_hijos(41, "Héctor", null, null, 9));
        hijoList.add(new datos_hijos(42, "Samuel", null, null, 12));
        hijoList.add(new datos_hijos(43, "Xavier", null, null, 8));
        hijoList.add(new datos_hijos(44, "Julio", null, null, 10));
        hijoList.add(new datos_hijos(45, "Óscar", null, null, 11));
        hijoList.add(new datos_hijos(46, "Félix", null, null, 9));
        hijoList.add(new datos_hijos(47, "César", null, null, 7));
        hijoList.add(new datos_hijos(48, "Hugo", null, null, 8));
        hijoList.add(new datos_hijos(49, "Iván", null, null, 10));

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
        hijaList.add(new datos_hija(25, "Cecilia", null, null, 10));
        hijaList.add(new datos_hija(26, "Mariana", null, null, 9));
        hijaList.add(new datos_hija(27, "Catalina", null, null, 11));
        hijaList.add(new datos_hija(28, "Eugenia", null, null, 7));
        hijaList.add(new datos_hija(29, "Renata", null, null, 8));
        hijaList.add(new datos_hija(30, "Natalia", null, null, 10));
        hijaList.add(new datos_hija(31, "Beatriz", null, null, 11));
        hijaList.add(new datos_hija(32, "Marina", null, null, 9));
        hijaList.add(new datos_hija(33, "Angélica", null, null, 12));
        hijaList.add(new datos_hija(34, "Aurora", null, null, 8));
        hijaList.add(new datos_hija(35, "Olivia", null, null, 10));
        hijaList.add(new datos_hija(36, "Victoria", null, null, 9));
        hijaList.add(new datos_hija(37, "Paulina", null, null, 7));
        hijaList.add(new datos_hija(38, "Miranda", null, null, 8));
        hijaList.add(new datos_hija(39, "Alejandra", null, null, 10));
        hijaList.add(new datos_hija(40, "Gabriela", null, null, 11));
        hijaList.add(new datos_hija(41, "Elizabeth", null, null, 9));
        hijaList.add(new datos_hija(42, "Victoria", null, null, 12));
        hijaList.add(new datos_hija(43, "Ximena", null, null, 8));
        hijaList.add(new datos_hija(44, "Julia", null, null, 10));
        hijaList.add(new datos_hija(45, "Claudia", null, null, 11));
        hijaList.add(new datos_hija(46, "Diana", null, null, 9));
        hijaList.add(new datos_hija(47, "Patricia", null, null, 7));
        hijaList.add(new datos_hija(48, "Abril", null, null, 8));
        hijaList.add(new datos_hija(49, "Ariana", null, null, 10));

        return hijaList;
    }

}
