package com.example.anders.studysmart.LogIn;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.anders.studysmart.Data.LSH;
import com.example.anders.studysmart.HomeWorkCalendar.HWCAct;
import com.example.anders.studysmart.R;
import com.example.anders.studysmart.StudyGroupManager.SGMAct;

public class LogInAct extends Activity implements View.OnClickListener{

    Button login, create;
    EditText user, password;
    Intent i;
    LSH lsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_log_in);

        login = (Button) findViewById(R.id.login_ok_but);
        create = (Button) findViewById(R.id.login_create_but);
        user = (EditText) findViewById(R.id.login_user_et);
        password = (EditText) findViewById(R.id.login_password_et);

        login.setOnClickListener(this);
        create.setOnClickListener(this);
        lsh = LSH.getInstance();
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
            i = new Intent(this, SGMAct.class);
            this.startActivity(i);
            finish();
        }
    }

    private boolean login(){
        /*
            check if the user and password fit with the Database
         */
        lsh.loggedUser(user.getText().toString(), this);
        return true;
    }

    private void loginFail(){
        /*
            Add popup window or something telling the user
            that the user and password combination wasn't found
         */
    }
}
