package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View
        TextView category1 = (TextView) findViewById(R.id.atractions);
        // Set a click listener on that View
        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent atractionsIntent = new Intent(MainActivity.this, FragmentActivity.class);
                // Start the new activity
                startActivity(atractionsIntent);
            }
        });

        TextView category2 = (TextView) findViewById(R.id.museums);
        // Set a click listener on that View
        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent museumsIntent = new Intent(MainActivity.this, FragmentActivity.class);
                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        TextView category3 = (TextView) findViewById(R.id.restaurants);
        // Set a click listener on that View
        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent restaurantsIntent = new Intent(MainActivity.this, FragmentActivity.class);
                // Start the new activity
                startActivity(restaurantsIntent);
            }
        });

        TextView category4 = (TextView) findViewById(R.id.hotels);
        // Set a click listener on that View
        category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent
                Intent hotelsIntent = new Intent(MainActivity.this, FragmentActivity.class);
                // Start the new activity
                startActivity(hotelsIntent);
            }
        });
    }
}
