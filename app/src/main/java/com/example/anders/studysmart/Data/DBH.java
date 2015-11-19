package com.example.anders.studysmart.Data;

import android.content.Context;
import android.database.Cursor;
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
public class DBH {
    String databasePath = "/database.db";
    private static DBH ourInstance = new DBH();
    public static DBH getInstance(){ return ourInstance;}
    private DBH() {
        createDatabase();
    }

    private void createDatabase(){
        createHomework();
        createUsers();
    }

    private void createHomework(){
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(databasePath, null); //should have getFilesDir() before "database...

        db.execSQL("DROP TABLE IF EXISTS homework;");
        db.execSQL("CREATE TABLE homework (id INTEGER PRIMARY KEY, title VARCHAR(200) NOT NULL, description TEXT, date TIMESTAMP NOT NULL);");

        db.execSQL("INSERT INTO homework(title, description, date) VALUES(" +
                "'NaS Session 3', " +
                "'Articles\nMcCraw, Thomas K.\n\tBelknap Harvard: 67-76.\n\tNumber of Pages 4'," +
                "'2015-09-03 08:00:00');");
        db.execSQL("INSERT INTO homework(title, description, date) VALUES(" +
                "'NaS Session 4'," +
                "'Articles\nEdith Penrose\n\tThe Business History Review 34(1): 1-23.\n\tNumber of Pages 22'," +
                "'2015-09-09 08:00:00');");
        db.close();
    }

    private void createUsers() { //skal laves - Bækhøj giver en hånd da han OWNER det der database shitz
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(databasePath, null); //should have getFilesDir() before "database...

        db.execSQL("DROP TABLE IF EXISTS user;");
        db.execSQL("CREATE TABLE user (id INTEGER PRIMARY KEY, title VARCHAR(200) NOT NULL, description TEXT, date TIMESTAMP NOT NULL);");

        db.execSQL("INSERT INTO user(title, description, date) VALUES(" +
                "'NaS Session 3', " +
                "'Articles\nMcCraw, Thomas K.\n\tBelknap Harvard: 67-76.\n\tNumber of Pages 4'," +
                "'2015-09-03 08:00:00');");
        db.execSQL("INSERT INTO user(title, description, date) VALUES(" +
                "'NaS Session 4'," +
                "'Articles\nEdith Penrose\n\tThe Business History Review 34(1): 1-23.\n\tNumber of Pages 22'," +
                "'2015-09-09 08:00:00');");
        db.close();
    }

    public void getHomework(){
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(databasePath, null); //should have getFilesDir() before "database...

        String database = "homework";   // FROM
        String[] kolonner = {"date", "id", "title", "description"};         // SELECT
        String valg = "";               // WHERE
        String sort = "date";           // ORDER BY
        Cursor cursor = db.query(database, kolonner, valg, null, null, null, sort);
        cursor.close();

        db.close();
    }

}
