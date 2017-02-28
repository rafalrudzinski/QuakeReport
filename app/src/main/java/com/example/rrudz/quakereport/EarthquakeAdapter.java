package com.example.rrudz.quakereport;


import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.TextView;

import java.util.Date;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

    private String primaryLocation;
    private String locationOffset;

    /**
     * Custom constructor. Context is used to inflate the layout file and
     * list is the data to populate into the lists
     *
     * @param context
     * @param earthquakeList
     */
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakeList) {
        super(context, 0, earthquakeList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get the {@link Earthquake} object located at this position
        Earthquake currentEarthquake = getItem(position);

        // find TextView in list_item layout with ID magnitude_text_view
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);

        String formattedMagnitude = formatMagnitude(currentEarthquake.getMagnitude());

        // display the magnitude of the current earthquake
        magnitudeTextView.setText(formattedMagnitude);

        String originalLocation = currentEarthquake.getLocation();

        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        // find TextView in list_item layout with ID location_text_view
        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);

        // display the location of the current earthquake
        primaryLocationView.setText(primaryLocation);

        TextView locationOffsetView = (TextView) listItemView.findViewById((R.id.location_offset));

        locationOffsetView.setText(locationOffset);

        // create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        // find TextView in list_item layout with ID date_text_view
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);

        // format the date string ("Mar 2, 1982)
        String formattedDate = formatDate(dateObject);

        // display the date of the current earthquake
        dateTextView.setText(formattedDate);

        // find TextView in list_item layout with ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        // format the time string ("4:30 PM")
        String formattedTime = formatTime(dateObject);

        // display the time of the current earthquake
        timeView.setText(formattedTime);

        return listItemView;
    }

    /**
     * Format the magnitude string to two decimal places
     *
     * @param magnitude magnitude of the earthquake
     * @return formatted representation of magnitude as string
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

    /**
     * Format the date string from a date object
     *
     * @param dateObject date object to be formatted
     * @return formatted date object
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Format a string to represent time
     *
     * @param dateObject date object to be formatted
     * @return formatted string representing time
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
