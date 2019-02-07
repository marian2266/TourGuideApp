package com.example.android.tourguideapp;


import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class AtractionsFragment extends Fragment {

    public AtractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.atraction1, getString(R.string.atraction11),
                getString(R.string.atraction12), getString(R.string.atraction13),
                getString(R.string.atraction14)));
        places.add(new Place(R.drawable.atraction2, getString(R.string.atraction21),
                getString(R.string.atraction22), getString(R.string.atraction23),
                getString(R.string.atraction24)));
        places.add(new Place(R.drawable.atraction3, getString(R.string.atraction31),
                getString(R.string.atraction32), getString(R.string.atraction33),
                getString(R.string.atraction34)));
        places.add(new Place(R.drawable.atraction4, getString(R.string.atraction41),
                getString(R.string.atraction42), getString(R.string.atraction43),
                getString(R.string.atraction44)));
        places.add(new Place(R.drawable.atraction5, getString(R.string.atraction51),
                getString(R.string.atraction52), getString(R.string.atraction53),
                getString(R.string.atraction54)));
        places.add(new Place(R.drawable.atraction6, getString(R.string.atraction61),
                getString(R.string.atraction62), getString(R.string.atraction63),
                getString(R.string.atraction64)));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //Creating a Class variable to hold the destination activity depending on Switch below
                Class myActivityToIntent = DetailedActivity.class;

                // Create a new intent to open the {@link applicable activity}
                Intent myIntent = new Intent(getActivity().getApplicationContext(), myActivityToIntent);

                //Assign values based on position in ListView, hardcoded based on ArrayList addition order
                myIntent.putExtra(getString(R.string.savedImage), places.get(i).getImageResourceId());
                myIntent.putExtra(getString(R.string.savedName), places.get(i).getNameId());
                myIntent.putExtra(getString(R.string.savedAdress), places.get(i).getAdressId());
                myIntent.putExtra(getString(R.string.savedTax), places.get(i).getTaxId());
                myIntent.putExtra(getString(R.string.savedProgram), places.get(i).getProgramId());

                // Start the new activity
                startActivity(myIntent);

            }
        }); // END setOnItemClickListener

        // Inflate the layout for this fragment
        return rootView;
    } // End OnCreateView

} // END class

