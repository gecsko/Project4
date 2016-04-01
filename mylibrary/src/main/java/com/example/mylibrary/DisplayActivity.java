package com.example.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by Kathy on 14/3/2016.
 */
public class DisplayActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String joke = getIntent().getStringExtra("Joke");

        setContentView(R.layout.activity_display);


        Bundle args = new Bundle();
        args.putString("joke", joke);

        DisplayFragment displayFragment = new DisplayFragment();
        displayFragment.setArguments(args);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.myframelayout, displayFragment);
        ft.commit();

    }

    public void launchLibraryActivity(View view){
        Intent myIntent = new Intent(this, DisplayActivity.class);
        startActivity(myIntent);
    }
}
