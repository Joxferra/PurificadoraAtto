package com.example.yatti;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yatti.Menu.menu_administracion;
import com.example.yatti.Menu.menu_cliente;
import com.example.yatti.Menu.menu_fabrica;
import com.example.yatti.Menu.menu_ventas;

public class MainActivity extends Activity {
    EditText mEtPwd;
    CheckBox mCbShowPwd;
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

                    Intent intent =new Intent(MainActivity.this, menu_cliente.class);
                    startActivity(intent);
                }

                else if (name.equals("fabrica") && pass.equals("fabrica")){

                    Intent intent =new Intent(MainActivity.this, menu_fabrica.class);
                    startActivity(intent);
                }

                else if (name.equals("administracion") && pass.equals("administracion")){

                    Intent intent =new Intent(MainActivity.this, menu_administracion.class);
                    startActivity(intent);
                }

                else if (name.equals("ventas") && pass.equals("ventas")){

                    Intent intent =new Intent(MainActivity.this, menu_ventas.class);
                    startActivity(intent);
                }

                else {
                    Toast.makeText(getApplicationContext(),"incorrecto",Toast.LENGTH_SHORT).show();
                }


            }
        });
        // get the password EditText
        mEtPwd = (EditText) findViewById(R.id.pass);
        // get the show/hide password Checkbox
        mCbShowPwd = (CheckBox) findViewById(R.id.cbShowPwd);

        // add onCheckedListener on checkbox
        // when user clicks on this checkbox, this is the handler.
        mCbShowPwd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    mEtPwd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    mEtPwd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

    }

}
