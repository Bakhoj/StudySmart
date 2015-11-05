package com.example.anders.studysmart.StudyGroupManager;


import com.example.anders.studysmart.Data.LSH;

/**
 * Created by MortenDam on 05-11-2015.
 */

//TODO: NOT DONE

public class groupElement {
    String shortTitle;
    String ID;
    String title;

    public groupElement(String id, String t){
        ID = id;
        title = t;
        shortTitle = title.substring(0, 1).toUpperCase();
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public boolean setInMemory(String user){
        boolean res = false;
        LSH lsh = LSH.getInstance();
        return res;
    }

}
