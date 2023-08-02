package com.dhenis.polomorfismo.ejemplos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.dhenis.polomorfismo.R;

import kotlin.collections.ArrayDeque;

public class mainActivity extends AppCompatActivity {
    List<Persona> elements;
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xdatos);
        init();



    }


    public void init (){
        elements = new ArrayDeque<>();
    elements.add(new Persona ("abc","acvc","ttt"));
        elements.add(new Persona ("qqwe","hhh","fff"));
        elements.add(new Persona ("dc","ddd","kkk"));
        elements.add(new Persona ("daw","acvvvvc","yyy"));

        ListaAdaptadorPadre listaAdaptadorPadre =new ListaAdaptadorPadre( (elements, this));
        RecyclerView recyclerView = findViewById(R.id.cv);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(ListaAdaptadorPadre);







    }
}
