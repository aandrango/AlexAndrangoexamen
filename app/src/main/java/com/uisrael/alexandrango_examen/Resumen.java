package com.uisrael.alexandrango_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView edConectado,edSolicitado,txtConectado,txtSolicitado,txtEducacion,edEducacion,txtDep,chR1,chR2,chR3,rd1,rd2;
    Bundle dato;

    TextView recibo2;
    Bundle datos2;
    Button encuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        encuesta=(Button) findViewById(R.id.btnencuesta);

        encuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resumen.this,Encuesta.class));
            }
        });


        recibo2=findViewById(R.id.txtrecibirNombre);


        datos2=getIntent().getExtras();
        String valorR2=datos2.getString("valorEnviado2");
        recibo2.setText(valorR2);


    }
}
