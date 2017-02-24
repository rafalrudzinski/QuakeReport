package com.example.rrudz.quakereport;

/**
 * Created by Rafal on 2/23/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Create new Earthquake object
     *
     * @param magnitude magnitude of earthquake
     * @param location location of earthquake
     * @param date date of earthquake
     */
    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Magnitude of earthquake
     *
     * @return magnitude of earthquake
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Location of earthquake
     *
     * @return location of earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Date of earthquake
     *
     * @return date of earthquake
     */
    public String getDate() {
        return mDate;
    }
}
