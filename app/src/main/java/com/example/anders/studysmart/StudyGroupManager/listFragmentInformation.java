package com.example.anders.studysmart.StudyGroupManager;

import android.text.format.Time;

import java.sql.Date;

/**
 * Created by MortenDam on 05-11-2015.
 */

// TODO: NOT DONE

public class listFragmentInformation {

    Date date;
    Time time;
    String ID;
    String description;
    String location;

    public listFragmentInformation(Date da, Time t, String id, String de, String l){
        date = da;
        time = t;
        ID = id;
        description = de;
        location = l;
    }

    public String getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public Time getTime() {
        return time;
    }
}
