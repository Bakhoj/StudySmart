package com.example.anders.studysmart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.anders.studysmart.Data.LSH;
import com.example.anders.studysmart.HomeWorkCalendar.HWCAct;
import com.example.anders.studysmart.LogIn.LogInAct;

/**
 * MainAct
 * Runs on application startup
 *
 * onCreate:
 *      IF LocalStorage = Empty THEN
 *          GOTO LogInAct
 *      else
 *          GOTO HWCAct(activeUser)
 */
public class MainAct extends Activity {

    LSH lsh;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        lsh = LSH.getInstance();

        if(lsh.isEmpty()){
            i = new Intent(this, LogInAct.class);
            this.startActivity(i);
        } else {
            i = new Intent(this, HWCAct.class);
            this.startActivity(i);
        }
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
