package com.example.rrudz.quakereport;


public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private String mDate;

    /**
     * Create a new Earthquake object
     *
     * @param magnitude the magnitude of an earthquake
     * @param location the location of an earthquake
     * @param date the date the earthquake was recorded
     */
    public Earthquake(double magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Magnitude of an earthquake
     *
     * @return the magnitude of this earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Location of an earthquake
     *
     * @return the location of this earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Date the earthquake happened
     *
     * @return the date of this earthquake
     */
    public String getDate() {
        return mDate;
    }
}
