package com.example.android.delhiguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Hritik on 06-05-2017.
 */

public class Historical extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        final ArrayList<Place> historical = new ArrayList<Place>();
        historical.add(new Place(R.string.humayuntomb, R.string.humayun_add, R.string.humayun_desc, R.drawable.humayantomb, 4));
        historical.add(new Place(R.string.indiagate, R.string.indiagate_add, R.string.indiagate_desc, R.drawable.indiagate, 4.2));
        historical.add(new Place(R.string.qutub, R.string.qutub_add, R.string.qutub_desc, R.drawable.qutab, 3.8));
        historical.add(new Place(R.string.redfort, R.string.redfort_add, R.string.redfort_desc, R.drawable.redfort, 4.3));
        historical.add(new Place(R.string.jmasjid, R.string.jmasjid_add, R.string.jmasjid_desc, R.drawable.jamamasjid, 4.5));

        LocationAdapter adapter = new LocationAdapter(this, historical);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
