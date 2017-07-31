package com.example.android.delhiguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hritik on 06-05-2017.
 */

/*
* {@link LocationAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Place} objects.
* */
public class LocationAdapter extends ArrayAdapter<Place> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param places  A List of Place objects to display in a list
     */
    public LocationAdapter(Activity context, ArrayList<Place> places) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Place currentPlace = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        // set this text on the name TextView
        nameTextView.setText(currentPlace.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView addressTextview = (TextView) listItemView.findViewById(R.id.Address);
        // set this text on the number TextView
        addressTextview.setText(currentPlace.getAddress());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView descTextview = (TextView) listItemView.findViewById(R.id.description);
        // set this text on the number TextView
        descTextview.setText(currentPlace.getDescription());

        RatingBar rating =(RatingBar) listItemView.findViewById(R.id.rating);
        rating.setRating(currentPlace.getReview());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_view);
        // set the image to iconView
        if (currentPlace.hasImage()) {
            iconView.setImageResource(currentPlace.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else
            iconView.setVisibility(View.GONE);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

       /* View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);
        */
        return listItemView;
    }
}

