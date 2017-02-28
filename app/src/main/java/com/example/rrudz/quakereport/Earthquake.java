package com.example.rrudz.quakereport;


public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Create a new Earthquake object
     *
     * @param magnitude the magnitude of an earthquake
     * @param location the location of an earthquake
     * @param timeInMilliseconds the date the earthquake was recorded
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Url to find more information about this earthquake
     *
     * @return the website URL of this earthquake
     */
    public String getUrl() {
        return mUrl;
    }
}
