package com.dhenis.polomorfismo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static DatabaseHelper instance;

    private DatabaseHelper(Context context) {
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
    }

    public static synchronized DatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL_CREATE_PADRES_TABLE = "CREATE TABLE " + DatabaseContract.PadreEntry.TABLE_NAME + " ("
                + DatabaseContract.PadreEntry.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DatabaseContract.PadreEntry.COLUMN_NOMBRE + " TEXT NOT NULL, "
                + DatabaseContract.PadreEntry.COLUMN_APELLIDO_PATERNO + " TEXT NOT NULL, "
                + DatabaseContract.PadreEntry.COLUMN_APELLIDO_MATERNO + " TEXT NOT NULL, "
                + DatabaseContract.PadreEntry.COLUMN_EDAD + " INTEGER NOT NULL);";

        db.execSQL(SQL_CREATE_PADRES_TABLE);

        // Insertar padres de ejemplo
        insertarPadre(db, "Isaì", "Pinillos", "Carrasco", 30);
        insertarPadre(db, "Elsa", "Perez", "Lopez", 45);
        insertarPadre(db, "Maria", "Lopez", "Gomez", 28);
        insertarPadre(db, "Jorge", "Lopez", "Gomez", 28);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Aquí se implementa la lógica para manejar actualizaciones de la base de datos si es necesario
    }

    // Insertar un padre en la base de datos
    private void insertarPadre(SQLiteDatabase db, String nombre, String apellidoPaterno, String apellidoMaterno, int edad) {
        ContentValues values = new ContentValues();
        values.put(DatabaseContract.PadreEntry.COLUMN_NOMBRE, nombre);
        values.put(DatabaseContract.PadreEntry.COLUMN_APELLIDO_PATERNO, apellidoPaterno);
        values.put(DatabaseContract.PadreEntry.COLUMN_APELLIDO_MATERNO, apellidoMaterno);
        values.put(DatabaseContract.PadreEntry.COLUMN_EDAD, edad);

        db.insert(DatabaseContract.PadreEntry.TABLE_NAME, null, values);
    }
}
