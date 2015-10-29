package com.example.anders.studysmart.HomeWorkCalendar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.anders.studysmart.R;

public class HWCAct extends Activity {

    ScrollView scrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_hwc);
        scrollview = (ScrollView) findViewById(R.id.hwc_scroll);

        TextView tv = new TextView(this);
        scrollview.addView(tv);
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
}
