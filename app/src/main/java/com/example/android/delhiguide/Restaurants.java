package com.example.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hritik on 06-05-2017.
 */


public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Place> restaurents = new ArrayList<Place>();
        restaurents.add(new Place(R.string.tjanpath, R.string.tjanpath_add, R.string.tjanpath_desc, R.drawable.janpath, 4.2));
        restaurents.add(new Place(R.string.tamra, R.string.tamra_add, R.string.tamra_desc, R.drawable.tamra, 4.6));
        restaurents.add(new Place(R.string.tadka, R.string.tadka_add, R.string.tadka_desc, R.drawable.tadka, 4.5));
        restaurents.add(new Place(R.string.iaccent, R.string.iaccent_add, R.string.iaccent_desc, R.drawable.indianaccent, 4.1));

        LocationAdapter adapter = new LocationAdapter(this, restaurents);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
