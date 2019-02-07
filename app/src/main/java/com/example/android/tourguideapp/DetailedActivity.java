package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.detail_screen);

        int image = 0;
        String newString;
        String newString2;
        String newString3;
        String newString4;

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();

            if (extras == null) {
                newString = null;
                newString2 = null;
                newString3 = null;
                newString4 = null;
            } else {
                image = extras.getInt(getString(R.string.savedImage));
                newString = extras.getString(getString(R.string.savedName));
                newString2 = extras.getString(getString(R.string.savedAdress));
                newString3 = extras.getString(getString(R.string.savedTax));
                newString4 = extras.getString(getString(R.string.savedProgram));
            }
        } else {
            newString = (String) savedInstanceState.getSerializable(getString(R.string.string_i_need));
            newString2 = (String) savedInstanceState.getSerializable(getString(R.string.string_i_need));
            newString3 = (String) savedInstanceState.getSerializable(getString(R.string.string_i_need));
            newString4 = (String) savedInstanceState.getSerializable(getString(R.string.string_i_need));
        }

        ImageView image1 = (ImageView) findViewById(R.id.place_image);
        image1.setImageResource(image);

        TextView name1 = (TextView) findViewById(R.id.place_name);
        name1.setText(newString);

        TextView adress1 = (TextView) findViewById(R.id.place_adress);
        adress1.setText(newString2);

        TextView tax1 = (TextView) findViewById(R.id.place_tax);
        tax1.setText(newString3);

        TextView program1 = (TextView) findViewById(R.id.place_program);
        program1.setText(newString4);

    }
}
