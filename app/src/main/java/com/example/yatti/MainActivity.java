package com.example.yatti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button seccion =(Button) findViewById(R.id.seccion);

        seccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=((EditText)findViewById(R.id.name)).getText().toString();
                String pass=((EditText)findViewById(R.id.pass)).getText().toString();

                if (name.equals("cliente") && pass.equals("cliente")){

                    Intent intent =new Intent(MainActivity.this,menu_cliente.class);
                    startActivity(intent);
                }

                else if (name.equals("fabrica") && pass.equals("fabrica")){

                    Intent intent =new Intent(MainActivity.this,menu_fabrica.class);
                    startActivity(intent);
                }

                else if (name.equals("administracion") && pass.equals("administracion")){

                    Intent intent =new Intent(MainActivity.this,menu_administracion.class);
                    startActivity(intent);
                }

                else if (name.equals("ventas") && pass.equals("ventas")){

                    Intent intent =new Intent(MainActivity.this,menu_ventas.class);
                    startActivity(intent);
                }

                else {
                    Toast.makeText(getApplicationContext(),"incorrecto",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
