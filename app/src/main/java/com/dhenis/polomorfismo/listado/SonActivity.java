package com.dhenis.polomorfismo.listado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.dhenis.polomorfismo.MainActivity;
import com.dhenis.polomorfismo.R;
import com.dhenis.polomorfismo.modelos.Element;
import com.dhenis.polomorfismo.modelos.SonAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class SonActivity extends AppCompatActivity {
    private static final String TAG = SonActivity.class.getSimpleName();
    ImageView imgFsther, imgMather;
    List<Element> elementsSon;
    List<Element> elements;
    List<Element> matherList;
    private TextView textName, txtMother;
    Button btnhijo;
    String nombre;
    String apellido_p, apellido_m;
    Integer id, anos;
    Bundle recibeName;
    Bundle recibeNameMather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_son);

        btnhijo = findViewById(R.id.buttonregresar);
        textName = findViewById(R.id.nombre_completo_father);
        txtMother = findViewById(R.id.nombre_completo_mather);
        imgFsther = findViewById(R.id.iconImgViewFather);
        imgMather = findViewById(R.id.iconImgViewMather);


        btnhijo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SonActivity.this, MainActivity.class));
            }
        });


        init1();

        init2();

        init();

        listFather();

        listMather();
    }

    private void init1() {
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
    }


    private void init2() {
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

    }

    private void init() {
        elementsSon = new ArrayList<>();

        elementsSon.add(new Element(0, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Edson", elements.get(0).getApellido_p(), matherList.get(0).getApellido_p(), 21));
        elementsSon.add(new Element(1, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Fabricio", elements.get(1).getApellido_p(), matherList.get(1).getApellido_p(), 21));
        elementsSon.add(new Element(1, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Marcos", elements.get(1).getApellido_p(), matherList.get(1).getApellido_p(), 10));
        elementsSon.add(new Element(2, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Alex", elements.get(4).getApellido_p(), matherList.get(4).getApellido_p(), 2));
        elementsSon.add(new Element(2, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Daniela", elements.get(4).getApellido_p(), matherList.get(4).getApellido_p(), 2));
        elementsSon.add(new Element(3, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Eddie", elements.get(5).getApellido_p(), matherList.get(5).getApellido_p(), 5));
        elementsSon.add(new Element(4, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Erika", elements.get(6).getApellido_p(), matherList.get(6).getApellido_p(), 18));
        elementsSon.add(new Element(5, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Allison", elements.get(7).getApellido_p(), matherList.get(7).getApellido_p(), 9));
        elementsSon.add(new Element(6, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Martha", elements.get(8).getApellido_p(), matherList.get(8).getApellido_p(), 24));
        elementsSon.add(new Element(7, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Jade", elements.get(9).getApellido_p(), matherList.get(9).getApellido_p(), 7));
        elementsSon.add(new Element(8, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Oscar", elements.get(10).getApellido_p(), matherList.get(10).getApellido_p(), 12));
        elementsSon.add(new Element(9, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Alex", elements.get(11).getApellido_p(), matherList.get(11).getApellido_p(), 8));
        elementsSon.add(new Element(10, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Diego", elements.get(2).getApellido_p(), matherList.get(2).getApellido_p(), 1));
        elementsSon.add(new Element(11, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Victoria", elements.get(3).getApellido_p(), matherList.get(3).getApellido_p(), 17));
        elementsSon.add(new Element(12, "https://cdn-icons-png.flaticon.com/512/2829/2829768.png", "Josefina", elements.get(12).getApellido_p(), matherList.get(12).getApellido_p(), 17));
        elementsSon.add(new Element(13, "https://cdn-icons-png.flaticon.com/512/3884/3884891.png", "Paola", elements.get(13).getApellido_p(), matherList.get(13).getApellido_p(), 17));

    }

    private void listFather() {
        recibeName = getIntent().getExtras();
        id = recibeName.getInt("id");
        String url = elements.get(id).getImg();
        String nameFather = elements.get(id).getName();
        String apFather = elements.get(id).getApellido_p();
        String amFather = elements.get(id).getApellido_m();

        Picasso.get().load(url).error(R.drawable.ic_launcher_background).into(imgFsther);
        textName.setText(nameFather + " " + apFather + " " + amFather);

        System.out.println("===================================");
        System.out.println("id del Father: " + elements.get(id).getId());
        System.out.println("Nombre del Father: " + elements.get(id).getName());
        System.out.println("Apellido del Father: " + elements.get(id).getApellido_p());
        System.out.println("Apellido del Mather: " + elements.get(id).getApellido_m());
        System.out.println("==================================");

    }

    private void listMather() {

        recibeNameMather = getIntent().getExtras();
        id = recibeNameMather.getInt("id");
        String url1 = matherList.get(id).getImg();
        String nameMather = matherList.get(id).getName();
        String apMather = matherList.get(id).getApellido_p();
        String amMather = matherList.get(id).getApellido_m();

        Picasso.get().load(url1).error(R.drawable.ic_launcher_background).into(imgMather);
        txtMother.setText(nameMather + " " + apMather + " " + amMather);


        if (getIntent().getExtras() != null) {

            System.out.println("===================================");
            System.out.println("ID de la Mather: " + matherList.get(id).getId());
            System.out.println("Nombre del Mather: " + matherList.get(id).getName());
            System.out.println("Apellido del Father: " + matherList.get(id).getApellido_p());
            System.out.println("Apellido del Mather: " + matherList.get(id).getApellido_m());
            System.out.println("==================================");
        }

        List<Element> sonlistparent = new ArrayList<>();

        for (Element element : elementsSon) {
            if (element.getId() == id) {
                sonlistparent.add(element);
            }
        }

            /*System.out.println("==========================================");
            System.out.println("Nombre completo de Father: " + elements.get(id).getName() + " " + elements.get(id).getApellido_p() + " " + elements.get(id).getApellido_m());
            System.out.println("Nombre completo de Mather: " + matherList.get(id).getName() + " " + matherList.get(id).getApellido_p() + " " + matherList.get(id).getApellido_m());*/

        for (Element sonresit : sonlistparent) {
            System.out.println("=====================Cant. Son===============================");
            System.out.println("ID del Son: " + sonresit.getId());
            System.out.println("Nombre del Son: " + sonresit.getName());
            System.out.println("Apellido paterno: " + elements.get(id).getApellido_p());
            System.out.println("Apellido materno: " + matherList.get(id).getApellido_p());
            System.out.println("Edad del Son: " + sonresit.getAnos());
            System.out.println("==============================================================");


            SonAdapter listAdapterSon = new SonAdapter(sonlistparent, this);
            RecyclerView recyclerView = findViewById(R.id.rv_hijo);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(listAdapterSon);

        }

    }

}