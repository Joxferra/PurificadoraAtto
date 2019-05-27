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
        db.execSQL("CREATE TABLE alta_control_entrada_admon(identrada INTEGER PRIMARY KEY AUTOINCREMENT, fecha text, cargo text, nombre text, hora_entrada text, hora_ruta text )");

        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}