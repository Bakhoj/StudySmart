package com.example.anders.studysmart.LogIn;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.anders.studysmart.HomeWorkCalendar.HWCAct;
import com.example.anders.studysmart.R;

public class LogInAct extends Activity implements View.OnClickListener{

    Button login, create;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_log_in);

        login = (Button) findViewById(R.id.login_ok_but);
        create = (Button) findViewById(R.id.login_create_but);

        login.setOnClickListener(this);
        create.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == login) {
            if(login()) {
                i = new Intent(this, HWCAct.class);
                this.startActivity(i);
                finish();
            } else {
                loginFail();
            }
        } else if(v == create) {

        }
    }

    private boolean login(){
        /*
            check if the user and password fit with the Database
         */
        return true;
    }

    private void loginFail(){
        /*
            Add popup window or something telling the user
            that the user and password combination wasn't found
         */
    }

}
