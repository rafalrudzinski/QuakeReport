package com.example.rrudz.quakereport;


import android.speech.tts.TextToSpeech;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.text.DecimalFormat;
import java.util.ArrayList;
import android.app.Activity;
import android.widget.TextView;
import java.util.ArrayList;
import org.w3c.dom.Text;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

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
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_text_view);

        // format magnitude to string with one decimal place
        String formattedMagnitude = formatMagnitude(currentEarthquake.getMagnitude());

        // display the magnitude of the current earthquake
        magnitudeTextView.setText(formattedMagnitude);

        // find TextView in list_item layout with ID location_text_view
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        // display the location of the current earthquake
        locationTextView.setText(currentEarthquake.getLocation());

        // find TextView in list_item layout with ID date_text_view
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);

        // display the date of the current earthquake
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;
    }

    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }
}
