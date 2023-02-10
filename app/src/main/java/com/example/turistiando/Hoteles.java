package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

        ArrayList<Hotel> lista = new  ArrayList<>();
        RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        crearListaHoteles();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.hotel1,"La Boira","$360000 COP"));
        lista.add(new Hotel(R.drawable.hotel2,"PassiFlora","$330000 COP"));
        lista.add(new Hotel(R.drawable.hotel3,"40 Amigos","$210000 COP"));
        lista.add(new Hotel(R.drawable.hotel4,"Hotel Plantacion","$76000 COP"));

    }

}