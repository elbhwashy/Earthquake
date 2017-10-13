package com.example.elbhwashy.earthquake;

import java.util.ArrayList;

import static com.example.elbhwashy.earthquake.R.id.date;
import static com.example.elbhwashy.earthquake.R.id.magnitude;

/**
 * Created by elbhwashy on 10/8/2017.
 */

public class Earthquake {

    private long timeInMilliseconds;
    private  String magnitude;
    private  String location;
    private  String date;

    public Earthquake(String mMagnitude, String mLocation,long mTimeInMilliseconds){
        magnitude =mMagnitude;
        location = mLocation;
       // date=mDate;
        timeInMilliseconds = mTimeInMilliseconds;

    }


    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getMagnitude() {
        return magnitude;
    }
}
