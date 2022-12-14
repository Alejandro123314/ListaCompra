package com.example.listacompra;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvCantProductos;
    Button btnVerCarro;
    RecyclerView rvListaProductos;
    AdaptadorProductos adaptador;

    List<Producto> listaProductos = new ArrayList<>();
    List<Producto> carroCompras = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tvCantProductos = findViewById(R.id.tvCantProductos);
        btnVerCarro = findViewById(R.id.btnVerCarro);
        rvListaProductos = findViewById(R.id.rvListaProductos);
        rvListaProductos.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));

        listaProductos.add(new Producto("1", "papas", "nutritivo", 9.0));
        listaProductos.add(new Producto("2", "manzana", "nutritivo", 37.0));
        listaProductos.add(new Producto("3", "aguacate", "nutritivo", 25.0));
        listaProductos.add(new Producto("4", "lechuga", "nutritivo", 10.0));
        listaProductos.add(new Producto("5", "pepinillo", "nutritivo", 46.0));

        adaptador = new AdaptadorProductos(MainActivity.this, tvCantProductos, btnVerCarro, listaProductos, carroCompras);
        rvListaProductos.setAdapter(adaptador);
    }
}
