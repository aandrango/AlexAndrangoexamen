package com.uisrael.alexandrango_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity implements View.OnClickListener {

    TextView recibo;
    Bundle datos;

    Button guardar;
    EditText textoNombre,montoinicial,montomensual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        recibo=findViewById(R.id.txtrecibir);

        textoNombre=findViewById(R.id.txtnombre);
        montoinicial=findViewById(R.id.txtmontoi);
        montomensual=findViewById(R.id.txtmontom);

        guardar=findViewById(R.id.btnguardar);

        datos=getIntent().getExtras();
        String valorR=datos.getString("valorEnviado");
        recibo.setText(valorR);


        guardar.setOnClickListener(this);


    }

    public void onClick(View v){
        String nombre=textoNombre.getText().toString();
        String inicial=montoinicial.getText().toString();
        String mensual=montomensual.getText().toString();
        if (nombre.equals("")){
            Toast.makeText(this, "Existen campos vacios",
                    Toast.LENGTH_LONG).show();
        }
        else{
            Intent pasarnombre = new Intent(this, Resumen.class);
            pasarnombre.putExtra("valorEnviado2",textoNombre.getText().toString());
            Toast.makeText(this,"Elemento guardado con exito",Toast.LENGTH_LONG).show();
            startActivity(pasarnombre);
        }

    }



}
