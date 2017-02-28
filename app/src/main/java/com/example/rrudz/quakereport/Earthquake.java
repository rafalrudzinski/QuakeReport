package com.example.rrudz.quakereport;


public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    /**
     * Create a new Earthquake object
     *
     * @param magnitude the magnitude of an earthquake
     * @param location the location of an earthquake
     * @param timeInMilliseconds the date the earthquake was recorded
     */
    public Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    /**
     * Magnitude of an earthquake
     *
     * @return the magnitude of this earthquake
     */
    public String getMagnitude() {
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
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
