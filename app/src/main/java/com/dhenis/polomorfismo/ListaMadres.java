package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListaMadres extends AppCompatActivity {
    ConstraintLayout botonatrasmadres;
    EditText editTextSearchMadres;

    List<Madres> madresList = new ArrayList<>();
    LinearLayout parentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_madres);

        botonatrasmadres = findViewById(R.id.btnatrasmadres);
        editTextSearchMadres = findViewById(R.id.editTextSearchMadres);
        parentContainer = findViewById(R.id.parentContainer);

        botonatrasmadres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaMadres.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Inicializar lista de madres
        madresList.add(new Madres(1,"Maria","Gomez","Fernandez",29));
        madresList.add(new Madres(2,"Meri","Castro","Fidel",39));
        madresList.add(new Madres(3, "Luisa", "Ramirez", "Vargas", 35));
        // Añadir más elementos...

        // Mostrar lista completa de madres al inicio
        updateMadresViews(madresList);

        // Agregar funcionalidad de búsqueda en tiempo real
        editTextSearchMadres.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                filterMadres(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });
    }

    private void filterMadres(String searchText) {
        List<Madres> filteredList = new ArrayList<>();
        for (Madres madre : madresList) {
            if (madre.getNombre().toLowerCase().contains(searchText.toLowerCase())
                    || madre.getApellido_p().toLowerCase().contains(searchText.toLowerCase())
                    || madre.getApellido_m().toLowerCase().contains(searchText.toLowerCase())) {
                filteredList.add(madre);
            }
        }
        updateMadresViews(filteredList);
    }

    private void updateMadresViews(List<Madres> listaMadres) {
        parentContainer.removeAllViews();
        for (Madres madre : listaMadres) {
            // Inflar el layout de tu CardView personalizado
            View cardView = getLayoutInflater().inflate(R.layout.definicion_elementos, null);

            // Obtener las referencias a los elementos dentro del CardView
            TextView nombreTextView = cardView.findViewById(R.id.textnombre);
            TextView apellidosTextView = cardView.findViewById(R.id.textapellidos);
            TextView edadTextView = cardView.findViewById(R.id.textedad);

            // Establecer los datos en los elementos del CardView
            nombreTextView.setText(madre.getNombre());
            apellidosTextView.setText(madre.getApellido_p() + " " + madre.getApellido_m());
            edadTextView.setText(madre.getEdad() + " años");

            // Agregar el CardView al contenedor
            parentContainer.addView(cardView);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //obtener el id del padre
                    Bundle enviadatos = new Bundle();
                    String apellidomaterno = madre.getApellido_p();
                    int parentId = madre.getId();

                    enviadatos.getParcelableArrayList(madresList.toString());
                    Intent intent = new Intent(ListaMadres.this, PaginaHijos.class);
                    intent.putExtra("parent_id", parentId);
                    intent.putExtra("apellido_materno",apellidomaterno);
                    startActivity(intent);
                }
            });

        }
    }
}