package com.example.elbhwashy.earthquake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the family category
        TextView earthquake = (TextView) findViewById(R.id.Earthquake);

        // Set a click listener on that View
        earthquake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent ErathquakeIntent = new Intent(MainActivity.this, EarthquakeActivity.class);

                // Start the new activity
                startActivity(ErathquakeIntent);
            }
        });
    }
}
