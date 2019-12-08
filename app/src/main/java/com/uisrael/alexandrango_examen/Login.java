package com.uisrael.alexandrango_examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edUsuario,edPass;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    edUsuario=(EditText)findViewById(R.id.edUsuario);
    edPass=(EditText)findViewById(R.id.edPass);
    ingresar=(Button) findViewById(R.id.btnIngresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String vUsuario=edUsuario.getText().toString();
            String vPass=edPass.getText().toString();
            if(vUsuario.equals("estudiante2019") && vPass.equals("uisrael2019")){
                Intent bienvenido=new Intent(Login. this, Registro.class);
                bienvenido.putExtra("valorEnviado",edUsuario.getText().toString());
                startActivity(bienvenido);


            }
            else{
                Toast.makeText(getApplicationContext(),"Datos Incorrectos", Toast.LENGTH_SHORT). show();

            }
        }
    });

}
}
