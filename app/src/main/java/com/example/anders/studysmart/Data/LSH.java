package com.example.anders.studysmart.Data;

/**
 * LocalStoreHandler
 * Created by anders on 22-10-2015.
 *
 * This class is a singleton which handles the PrefferenceManager aka. all the data stored
 * locally on the device for offline use and the active user information.
 *
 * All other classes should use this class when accessing or storing data for local storage.
 */
public class LSH {

    boolean isEmpty;

    public Boolean isEmpty(){
        return isEmpty;
    }
    private static LSH ourInstance = new LSH();

    public static LSH getInstance() {
        return ourInstance;
    }

    private LSH() {
        isEmpty = true;
    }
}
