package com.example.proyectobasegitsj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Insumos;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Insumos insumos = new Insumos();
    private TextView resultado;
    private RatingBar calif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spn);
        resultado = findViewById(R.id.tvRes);
        calif = findViewById(R.id.rb);

        ArrayAdapter insumosAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, insumos.getInsumos());
        spinner.setAdapter(insumosAdapter);
    }

    public void Calcular(View view){
        String opcion = spinner.getSelectedItem().toString();
        int res = 0;
        /*for(int i=0; i<opcion.length(); i++){
            if(opcion.equals(insumos.getInsumos()[i])){
                res = insumos.getPrecios()[i];
                break;
            }
        }
        resultado.setText("La opcion es: " + opcion + ", su precio es: $" + res);*/
        for(int i=0; i<spinner.getAdapter().getCount(); i++){
            if(opcion.equals(insumos.getInsumos()[i])){
                res = insumos.anadirAdicional(insumos.getPrecios()[i], 350);
                calif.setRating(i);
            }
        }
        resultado.setText("La opcion es: " + opcion + ", su precio es: $" + res);
    }
}