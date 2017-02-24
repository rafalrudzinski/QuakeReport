package com.example.rrudz.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Rafal on 2/23/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter {

    /**
     * Custom constructor. Context is used to inflate the layout file and
     * list is the data we want to populate into the lists.
     *
     * @param context the current context
     * @param earthquakeList a list of Earthquake objects to display in a list
     */
    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakeList) {
        super(context, 0, earthquakeList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext().inflate(R.layout.))
        }
    }
}
