package com.example.yatti.Menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.yatti.Fabricacion.control_botellones_fabrica;
import com.example.yatti.Fabricacion.control_entrada_salida_fabrica;
import com.example.yatti.Fabricacion.control_fabricacion_fabrica;
import com.example.yatti.Fabricacion.control_medicion_fabrica;
import com.example.yatti.Fabricacion.retrolavado_regeneracion_fabrica;
import com.example.yatti.Fabricacion.venta_cliente_fabrica;
import com.example.yatti.R;

public class menu_fabrica extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fabrica);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fabrica, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Entrada_fabrica) {
            Intent Inicio = new Intent(this, control_entrada_salida_fabrica.class);
            startActivity(Inicio);

        } else if (id == R.id.nav_Mediciones_fabrica) {
            Intent Inicio = new Intent(this, control_medicion_fabrica.class);
            startActivity(Inicio);

        } else if (id == R.id.nav_Retrolavado_fabrica) {
            Intent Inicio = new Intent(this, retrolavado_regeneracion_fabrica.class);
            startActivity(Inicio);

        } else if (id == R.id.nav_Control_fabrica) {
            Intent Inicio = new Intent(this, control_fabricacion_fabrica.class);
            startActivity(Inicio);
        }else if (id == R.id.nav_botellones_fabrica) {
            Intent Inicio = new Intent(this, control_botellones_fabrica.class);
            startActivity(Inicio);

        }else if (id == R.id.nav_ventas_fabrica) {
            Intent Inicio = new Intent(this, venta_cliente_fabrica.class);
             startActivity(Inicio);
        }else if (id == R.id.nav_censo_fabrica) {

        }else if (id == R.id.nav_segunda_parte_fabrica) {

        }else if (id == R.id.nav_tercera_parte_fabrica) {

        }else if (id == R.id.nav_cuarta_parte_fabrica) {

        }
        else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
