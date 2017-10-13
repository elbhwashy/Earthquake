package com.example.elbhwashy.earthquake;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by elbhwashy on 10/8/2017.
 */

public class EarthquakeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_list);


        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        earthquakeListView.setAdapter( adapter);
    }
}
