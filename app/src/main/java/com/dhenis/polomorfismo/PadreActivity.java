package com.dhenis.polomorfismo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.View;
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.TextView;


public class PadreActivity extends AppCompatActivity {

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_padre);

        ImageView btnRegresar = findViewById(R.id.btnRegresar2);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //TextView textViewIncluido = findViewById(R.id.include);
        ///textViewIncluido.setText("Texto cambiado desde el código");

        searchView = findViewById(R.id.miSearchView);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                filterList(newText);
                return true;
            }
        });
    }

    private void filterList(String query) {

    }
}
