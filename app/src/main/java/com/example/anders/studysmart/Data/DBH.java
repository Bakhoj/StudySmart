package com.example.anders.studysmart.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * DataBaseHandler
 * Created by anders on 22-10-2015.
 *
 * This class creates and establishes connection to the external database when HWC or SGM needs
 * to access information/updates.
 *
 * TODO: make into Interface (maybe)
 * might need to be made into an Interface if we need to use AsyncTask for network connection
 * to the SQL-server.
 */
public class DBH extends SQLiteOpenHelper{
    public DBH(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
