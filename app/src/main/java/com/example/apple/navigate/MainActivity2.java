package com.example.apple.navigate;
import android.app.DatePickerDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.MapFragment;


public class MainActivity2 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView = null;
    Toolbar toolbar = null;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the fragment initially
        MainFragment fragment = new MainFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);

        //How to change elements in the header programatically
        View headerView = navigationView.getHeaderView(0);
        TextView emailText = (TextView) headerView.findViewById(R.id.email);
        emailText.setText("newemail@email.com");

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.nav_settings) {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();


            Log.d("MAuth","Logout Clicked");
            try {
                Intent intents = new Intent(this, LogoutActivity.class);
                startActivity(intents);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }



        return super.onOptionsItemSelected(item);
    }

    public void showDatePickerDialog (View v){
        android.app.DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "DatePicker");
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_trip) {
            //Set the fragment initially

            //intent = new Intent(this, Diary.class);

            Toast.makeText(this, "Diary", Toast.LENGTH_SHORT).show();

            DiaryFragment fragment = new DiaryFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();


        } else if (id == R.id.nav_calendar) {
            //Set the fragment initially
            Toast.makeText(this, "Calendar", Toast.LENGTH_SHORT).show();

            CalendarFragment fragment = new CalendarFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_map) {
            Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();

            GMapFragment fragment = new GMapFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();





        } else if (id == R.id.nav_currency) {
            //Set the fragment initially
            Toast.makeText(this, "Currency", Toast.LENGTH_SHORT).show();
            try {
                Intent intents = new Intent(this, MainActivityCurrency.class);
                startActivity(intents);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        else if (id == R.id.nav_settings)  {
            Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

            if (id == R.id.nav_settings) {
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();

                //SettingsFragment fragment = new SettingsFragment();
                //         android.support.v4.app.FragmentTransaction fragmentTransaction =
                //                getSupportFragmentManager().beginTransaction();
                //      fragmentTransaction.replace(R.id.fragment_container, fragment);
                //    fragmentTransaction.commit();
                Log.d("MAuth","Logout Clicked");
                try {
                    Intent intents = new Intent(this, LogoutActivity.class);
                    startActivity(intents);
                    //setContentView(R.layout.activity_logout);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }


        }

        else if (id == R.id.nav_explore)  {
            Toast.makeText(this, "Explore", Toast.LENGTH_SHORT).show();

            CountryFragment fragment = new CountryFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}