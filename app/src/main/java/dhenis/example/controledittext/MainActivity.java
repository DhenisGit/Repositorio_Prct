package dhenis.example.controledittext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txtName);
        et2=(EditText)findViewById(R.id.txtPass);

    }

    public void Ingresar(View view){

        String nombre= et1.getText().toString();
        String pass= et2.getText().toString();

        if(nombre.equals("dhenis") && pass.equals("12345")){

            Intent iniciar = new Intent(this, SegundoAtvity.class);
            iniciar.putExtra("dato", et1.getText().toString());
            startActivity(iniciar);
        }else{
            Toast.makeText(this, "El usuario ingresado y/o constraseña incorrecto", Toast.LENGTH_SHORT).show();
        }
    }

    public void Registrar(View view){

        String nombre= et1.getText().toString();
        String pass= et2.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("dato", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString(nombre, pass);
        obj_editor.commit();

        Toast.makeText(this, "Su cuenta ha sido guardada", Toast.LENGTH_SHORT).show();

        if(nombre.length()==0){
            Toast.makeText(this, "Debes de ingresar un nombre", Toast.LENGTH_SHORT).show();
        }
        if(pass.length()==0){
            Toast.makeText(this, "Debes de ingresar la contraseña", Toast.LENGTH_SHORT).show();
        }
        /*if(nombre.length()!=0 && pass.length()!=0){
            Toast.makeText(this, "Sesion iniciada", Toast.LENGTH_SHORT).show();
        }*/


    }
    //Método para el botón buscar
    public void Buscar(View view){
        String nombre = et1.getText().toString();

        SharedPreferences preferencias = getSharedPreferences("dato", Context.MODE_PRIVATE);
        String datos = preferencias.getString(nombre, "");

        if(datos.length() == 0){
            Toast.makeText(this, "No se encontro ningún registro", Toast.LENGTH_SHORT).show();
        } else {
            et2.setText(datos);
        }
    }
}