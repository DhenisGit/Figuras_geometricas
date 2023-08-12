package com.dhenis.polomorfismo.databases;

public class DatabaseContract {
    public static final String DATABASE_NAME = "padres.db";
    public static final int DATABASE_VERSION = 1;

    public static class PadreEntry {
        public static final String TABLE_NAME = "padres";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_NOMBRE = "nombre";
        public static final String COLUMN_APELLIDO_PATERNO = "apellido_paterno";
        public static final String COLUMN_APELLIDO_MATERNO = "apellido_materno";
        public static final String COLUMN_EDAD = "edad";
    }
}