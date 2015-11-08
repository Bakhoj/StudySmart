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
    public DBH() {

    }

    public void getHomework(){

    }

    public void update(){

    }

    SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(getFilesDir() + "/database.db", null);

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

    String database = "homework";   // FROM
    String[] kolonner = {"date", "id", "title", "description"};         // SELECT
    String valg = "";               // WHERE
    String sort = "date";           // ORDER BY
    Cursor cursor = db.query(database, kolonner, valg, null, null, null, sort);

    while(cursor.moveToNext()) {
        String date = cursor.getString(0);
        Long id = cursor.getLong(1);
        String title = cursor.getString(2);
        String description = cursor.getString(3);
        tv.append(id + " " + date + "\n" + title + " " + description +"\n\n");
        tv.append(id + " " + date + "\n" + title + " " + description +"\n\n");
        tv.append(id + " " + date + "\n" + title + " " + description +"\n\n");
    }
    cursor.close();
    db.close();

}
