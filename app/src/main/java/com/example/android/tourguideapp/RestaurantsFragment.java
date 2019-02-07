package com.example.android.tourguideapp;


import android.content.Intent;
import android.os.Bundle;
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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.restaurant1, getString(R.string.restaurant11),
                getString(R.string.restaurant12), getString(R.string.restaurant13)));
        places.add(new Place(R.drawable.restaurant2, getString(R.string.restaurant21),
                getString(R.string.restaurant22), getString(R.string.restaurant23)));
        places.add(new Place(R.drawable.restaurant3, getString(R.string.restaurant31),
                getString(R.string.restaurant32), getString(R.string.restaurant33)));
        places.add(new Place(R.drawable.restaurant4, getString(R.string.restaurant41),
                getString(R.string.restaurant42), getString(R.string.restaurant43)));
        places.add(new Place(R.drawable.restaurant5, getString(R.string.restaurant51),
                getString(R.string.restaurant52), getString(R.string.restaurant53)));
        places.add(new Place(R.drawable.restaurant6, getString(R.string.restaurant61),
                getString(R.string.restaurant62), getString(R.string.restaurant63)));

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
                myIntent.putExtra(getString(R.string.savedProgram), places.get(i).getProgramId());

                // Start the new activity
                startActivity(myIntent);

            }
        }); // END setOnItemClickListener

        // Inflate the layout for this fragment
        return rootView;
    } // End OnCreateView

} // END class

