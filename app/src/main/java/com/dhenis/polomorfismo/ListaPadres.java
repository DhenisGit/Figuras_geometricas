package com.dhenis.polomorfismo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListaPadres extends AppCompatActivity {

    ConstraintLayout botonregresarpadre;
    EditText editTextSearch;
    List<Padres> padresList = new ArrayList<>();
    LinearLayout parentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_padres);

        botonregresarpadre = findViewById(R.id.btnatraspadres);
        editTextSearch = findViewById(R.id.editTextSearch);
        parentContainer = findViewById(R.id.parentContainer);

        botonregresarpadre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListaPadres.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // Agregar los padres a la lista
        padresList.add(new Padres(1, "Juan", "López", "García", 42));
        padresList.add(new Padres(2, "Pablo", "Martínez", "Hernández", 35));
        padresList.add(new Padres(3, "Perco", "González", "Rodríguez", 38));
        // Agregar los demás padres

        // Mostrar todos los padres al inicio
        updatePadresViews(padresList);

        // Agregar un TextWatcher al EditText para filtrar los padres en tiempo real
        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                filterPadres(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });
    }


    //busqueda
    private void filterPadres(String searchText) {
        List<Padres> filteredList = new ArrayList<>();
        for (Padres padre : padresList) {
            if (padre.getNombre().toLowerCase().contains(searchText.toLowerCase())
                    || padre.getApellido_p().toLowerCase().contains(searchText.toLowerCase())
                    || padre.getApellido_m().toLowerCase().contains(searchText.toLowerCase())) {
                filteredList.add(padre);
            }
        }
        updatePadresViews(filteredList);
    }

    private void updatePadresViews(List<Padres> filteredPadresList) {
        parentContainer.removeAllViews();
        for (Padres padre : filteredPadresList) {
            // Inflar el layout de tu CardView personalizado
            View cardView = getLayoutInflater().inflate(R.layout.definicion_elementos, null);

            // Obtener las referencias a los elementos dentro del CardView
            TextView nombreTextView = cardView.findViewById(R.id.textnombre);
            TextView apellidosTextView = cardView.findViewById(R.id.textapellidos);
            TextView edadTextView = cardView.findViewById(R.id.textedad);

            // Establecer los datos en los elementos del CardView
            nombreTextView.setText(padre.getNombre());
            apellidosTextView.setText(padre.getApellido_p() + " " + padre.getApellido_m());
            edadTextView.setText(padre.getEdad() + " años");

            // Agregar el CardView al contenedor
            parentContainer.addView(cardView);

            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //obtener el id del padre
                    Bundle enviadatos = new Bundle();
                    String apellidopaterno = padre.getApellido_p();
                    int parentId = padre.getId();

                    enviadatos.getParcelableArrayList(padresList.toString());
                    Intent intent = new Intent(ListaPadres.this, PaginaHijos.class);
                    intent.putExtra("parent_id", parentId);
                    intent.putExtra("apellido_paterno",apellidopaterno);
                    startActivity(intent);
                }
            });

        }
    }
}