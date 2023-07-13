package com.example.proyecto_imagenes;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;


import com.squareup.picasso.Picasso;

public class segundoactivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundoactivity);

        imageView = findViewById(R.id.glide1);

        String url = "https://e-ad.americatv.com.pe/futbol-mundial-fuerte-golpe-alianza-lima-perdio-3-0-amistoso-contra-atletico-nacional-n433397-696x418-1001370.jpg";
        Glide.with(segundoactivity.this)
                .load(url)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);

        imageView = findViewById(R.id.glide2);

        String url2 = "https://dfstudio-d420.kxcdn.com/wordpress/wp-content/uploads/2019/06/digital_camera_photo-1080x675.jpg";
        Glide.with(segundoactivity.this)
                .load(url2)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


        imageView = findViewById(R.id.glide3);

        String url3 = "https://st.depositphotos.com/1000423/60623/i/600/depositphotos_606236826-stock-photo-nanotechnology-molecule-and-atom-model.jpg";
        Glide.with(segundoactivity.this)
                .load(url3)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


        imageView = findViewById(R.id.glide4);

        String url4 = "https://media.istockphoto.com/id/1370772148/photo/track-and-mountains-in-valle-del-lago-somiedo-nature-park-asturias-spain.jpg?s=612x612&w=0&k=20&c=QJn62amhOddkJSbihcjWKHXShMAfcKM0hPN65aCloco=";
        Glide.with(segundoactivity.this)
                .load(url4)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);



        imageView = findViewById(R.id.glide5);

        String url5 = "https://cdn5.vectorstock.com/i/1000x1000/78/59/happy-grin-emoji-instant-messaging-icon-imag-vector-17067859.jpg";
        Glide.with(segundoactivity.this)
                .load(url5)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


        imageView = findViewById(R.id.glide6);

        String url6 = "https://static8.depositphotos.com/1020341/896/i/950/depositphotos_8969502-stock-photo-human-face-with-cracked-texture.jpg";
        Glide.with(segundoactivity.this)
                .load(url6)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


        imageView = findViewById(R.id.glide7);

        String url7 = "https://raulperez.tieneblog.net/wp-content/uploads/2015/09/tux.jpg";
        Glide.with(segundoactivity.this)
                .load(url7)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


        imageView = findViewById(R.id.glide8);

        String url8 = "https://cdn.futbolperuano.com/sdi/2023/01/15/atletico-nacional-vs-alianza-lima-en-vivo-por-amistoso-internacional-1108568-0.jpg";
        Glide.with(segundoactivity.this)
                .load(url8)
                .placeholder(R.drawable.ic_launcher_foreground)
                .error(R.color.black)
                .into(imageView);


    }

    public void anterior (View view) {
        Intent anterior = new Intent(this, MainActivity.class);
        startActivity(anterior);
    }

}