package com.example.proyecto_imagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        String url = "https://www.bbva.com/wp-content/uploads/2018/03/datos-BBVA-e1521471248593.jpg";
        Picasso.get().load(url).into(imageView);

        imageView = findViewById(R.id.imageView1);
        // Cargar otra imagen con URL diferente
        String url1 = "https://www.tecnoseguro.com/media/xt-adaptive-images/480/media/k2/items/cache/a27a3b73d355048c6bab885897085f62_XL.webp";
        Picasso.get().load(url1).into(imageView);

        imageView = findViewById(R.id.imageView2);
        // Cargar otra imagen con URL diferente
        String url2 = "https://www.seguritecnia.es/wp-content/uploads/2021/07/seguridad-integral-900x600.jpg";
        Picasso.get().load(url2).into(imageView);

        imageView = findViewById(R.id.imageView3);
        // Cargar otra imagen con URL diferente
        String url3 = "https://www.hostingplus.pe/wp-content/uploads/2023/04/c794b9ff825b2e551c5ee45279950964.png";
        Picasso.get().load(url3).into(imageView);

        imageView = findViewById(R.id.imageView4);
        // Cargar otra imagen con URL diferente
        String url4 = "https://pulsosalud.com/wp-content/uploads/2023/05/sistema-seguridad-salud.jpg";
        Picasso.get().load(url4).into(imageView);

        imageView = findViewById(R.id.imageView5);
        // Cargar otra imagen con URL diferente
        String url5 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQEM9nV3Li33lWnf9Eh_0uUK6OzgRji2kahhg&usqp=CAU";
        Picasso.get().load(url5).into(imageView);

        imageView = findViewById(R.id.imageView6);
        // Cargar otra imagen con URL diferente
        String url6 = "https://i.pinimg.com/550x/02/a5/16/02a516cf564d7dd797cd6f31589cd55a.jpg";
        Picasso.get().load(url6).into(imageView);

        imageView = findViewById(R.id.imageView7);
        // Cargar otra imagen con URL diferente
        String url7 = "https://i.pinimg.com/originals/6b/46/19/6b461948a87c841549cdbf82d8bfd49c.jpg";
        Picasso.get().load(url7).into(imageView);


    }

    public void siguiente (View view) {
        Intent siguiente = new Intent(this, segundoactivity.class);
        startActivity(siguiente);
    }
}