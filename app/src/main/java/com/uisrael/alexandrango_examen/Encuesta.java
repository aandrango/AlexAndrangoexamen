package com.uisrael.alexandrango_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    EditText edEducativo;
    TextView txtEducativo,txtDeporte,txtIdioma;
    RadioButton rd1,rd2;
    CheckBox ch1,ch2,ch3;
    Button enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        edEducativo=(EditText)findViewById(R.id.txtcentro);

        ch1= (CheckBox) findViewById(R.id.cb1);
        ch2= (CheckBox) findViewById(R.id.cb2);
        ch3= (CheckBox) findViewById(R.id.cb3);
        rd1= (RadioButton) findViewById(R.id.rb1);
        rd1= (RadioButton) findViewById(R.id.rb2);
        enviar=(Button)findViewById(R.id.btenviar);
    }

    public void enviaDato (View v) {


        Intent abrir = new Intent(Encuesta.this, Resumen.class);
        abrir.putExtra("Respuesta1", edEducativo.getText().toString());

        if (ch1.isChecked()){
            abrir.putExtra("valorEnviado",ch1.getText().toString());
        }
        if (ch2.isChecked()){
            abrir.putExtra("valorEnviado1",ch2.getText().toString());
        }
        if (ch3.isChecked()){
            abrir.putExtra("valorEnviado2",ch3.getText().toString());
        }
        if (rd1.isChecked()){
            abrir.putExtra("valorEnviado3",rd1.getText().toString());
        }
        if (rd2.isChecked()){
            abrir.putExtra("valorEnviado4",rd2.getText().toString());
        }else {
            if (abrir == null) {
            }
        }

        startActivity(abrir);



    }
}
