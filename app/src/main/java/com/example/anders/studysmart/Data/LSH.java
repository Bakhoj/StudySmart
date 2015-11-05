package com.example.anders.studysmart.Data;

import android.app.Activity;
import android.preference.PreferenceManager;

/**
 * LocalStoreHandler
 * Created by anders on 22-10-2015.
 *
 * This class is a singleton which handles the PreferenceManager aka. all the data stored
 * locally on the device for offline use and the active user information.
 *
 * All other classes should use this class when accessing or storing data for local storage.
 */
public class LSH {

    final private String USER = "user";
    final private String EMPTY = "NULL";

    PreferenceManager prefs;
    private static Activity a;
    boolean isEmpty;

    private static LSH ourInstance = new LSH();

    // TODO: gør til rigtig singleton m. hjælp fra AndroidElementer
    public static LSH getInstance() {
        LSH.a = a;
        return ourInstance;
    }

    private LSH() {
    }
    public Boolean isEmpty() {
        if(prefs.getDefaultSharedPreferences(a).getString(USER, EMPTY) == EMPTY){
            isEmpty = true;
        } else {
            isEmpty = false;
        }
        return isEmpty;
    }

    public boolean loggedUser(String user){
        prefs.getDefaultSharedPreferences(a).edit().putString(USER, user).commit();
        return true;
    }
}
