package com.example.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hritik on 06-05-2017.
 */

public class Markets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        final ArrayList<Place> markets = new ArrayList<Place>();
        markets.add(new Place(R.string.dillih, R.string.dillih_add, R.string.dillih_desc, R.drawable.dillihatt, 4.5));
        markets.add(new Place(R.string.janpathM, R.string.janpathM_add, R.string.janpath_desc, R.drawable.janapthmarket, 4));
        markets.add(new Place(R.string.palika, R.string.palika_add, R.string.palika_desc, R.drawable.palika, 4.2));
        markets.add(new Place(R.string.karol, R.string.karol_add, R.string.karol_desc, R.drawable.karolbagh, 4.8));
        markets.add(new Place(R.string.cp, R.string.cp_add, R.string.cp_desc, R.drawable.cp, 4.5));

        LocationAdapter adapter = new LocationAdapter(this, markets);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // location_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);
    }
}
