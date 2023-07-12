package dhenis.example.controledittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SegundoAtvity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_atvity);

        tv1=(TextView)findViewById(R.id.tvSaludo);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola "+dato);


    }

    //Metodo para regresar al primer activity
    public void Regresar(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}