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

    static boolean isEmpty;

    public LSH(){
        isEmpty = true;
    }

    public Boolean isEmpty(){
        return isEmpty;
    }
}
