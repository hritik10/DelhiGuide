package com.example.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hritik on 06-05-2017.
 */

public class Attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        final ArrayList<Place> attractions = new ArrayList<Place>();
        attractions.add(new Place(R.string.rashtrapatiBhavan, R.string.rashtra_add, R.string.rashtrapati_desc, R.drawable.rahtrapatibhavan, 4.5));
        attractions.add(new Place(R.string.lotusTemple, R.string.lotus_add, R.string.lotus_desc, R.drawable.lotus, 4.1));
        attractions.add(new Place(R.string.akshardham, R.string.akshar_add, R.string.akshar_desc, R.drawable.akshardham, 4.6));
        attractions.add(new Place(R.string.banglasahib, R.string.bangla_add, R.string.bangla_desc, R.drawable.banglasahib, 4));
        LocationAdapter adapter = new LocationAdapter(this, attractions);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
