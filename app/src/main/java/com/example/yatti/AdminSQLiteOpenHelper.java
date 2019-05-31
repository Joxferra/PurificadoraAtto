package com.example.yatti;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper {


    public AdminSQLiteOpenHelper(Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //TABLAS DE ADMINISTRACION

        db.execSQL("CREATE TABLE alta_cliente_admon(idcliente INTEGER PRIMARY KEY AUTOINCREMENT,nombre text,fecha text,ciudad text,colonia text,calle text,Nmcasa int,telefono int,ubicacion text )");
        db.execSQL("CREATE TABLE alta_personal_admon(idpersonal INTEGET PRIMARY KEY AUTOINCREMENT, nombre text, fecha text,curp text, direccion text,telefono int,perfil text,observaciones text)");
        db.execSQL("CREATE TABLE control_entrada_admon(identrada INTEGER PRIMARY KEY AUTOINCREMENT, fecha text, cargo text, nombre text, hora_entrada text, hora_ruta text )");
        db.execSQL("CREATE TABLE control_fabricacion_admon(idfabricacion INTEGER PRIMARY KEY AUTOINCREMENT, fecha text, hora text, nombre text,lavados int, llenados int, entregados int,recibidos int, observaciones text) ");
        db.execSQL("CREATE TABLE control_material_admon(idmaterial INTEGER PRIMARY KEY AUTOINCREMENT )");
        db.execSQL("CREATE TABLE control_personal_clientes_admon(idPeCl INTEGER PRIMARY KEY AUTOINCREMENT)");
        db.execSQL("CREATE TABLE cotrol_vendedor_geoposicion (idgeoposicion INTEGER PRIMARY KEY AUTOINCREMENT, nombre text, geoposicion text, kilometraje text, gasolina text )");
        db.execSQL("CREATE TABLE corte_dia_admon(idcorte INTEGER PRIMARY KEY AUTOINCREMENT, nombre text, fecha text, vendida text,  venta text, credito text, sobrante  text)");
        db.execSQL("CREATE TABLE inventario_admon (idinventario INTEGER PRIMARY KEY AUTOINCREMENT, nombre text, cantidad int, descripcion text, fecha text )");
        db.execSQL("CREATE TABLE mantenimiento_admon(idmantenimiento INTEGER PRIMARY KEY AUTOINCREMENT, nombre text, descripcion text, fecha text)");
        db.execSQL("CREATE TABLE promociones_admon(idpromociones INTEGER PRIMARY KEY AUTOINCREMENT, nombre text, fechaf text, fechai text, obsetvaciones text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}