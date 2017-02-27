package com.octopocus.octopocus;

import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView objectText;
    private double mTimeGeste;
    public long tmpTimeMenu = 0;
    private long mTimeMenu = 0;
    private Button mBmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //objectText = (TextView) findViewById(R.id.object_name); // --> not used anymore
        objectText = (TextView) findViewById(R.id.object_name);
        mBmenu = (Button) findViewById(R.id.button);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mBmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmpTimeMenu = System.currentTimeMillis();
                objectText.setText("Temps: " + tmpTimeMenu);
            }
        });
    }

    public void writeDollar(Dollar dollar){   // --> not used anymore
        objectText.setText("Geste: " + dollar.result.Name + " Temps: " + mTimeGeste);
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

    public void startTimer(){
        Log.i("startTimer", "Test un deux un deux test !!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void executeCommand(double time) {
        mTimeGeste = time;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_athens) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Athens" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_berlin) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Berlin" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_brussels) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Brussels" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_dublin) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Dublin" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_london) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "London" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_miami) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Miami" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_moscou) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Moscou" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_oslo) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Oslo" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_paris) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Paris" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_rio) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Rio" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_rome) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Rome" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_sofia) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Sofia" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_sydney) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Sydney" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_tokyo) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Tokyo" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_toronto) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Toronto" + " Temps: " + mTimeMenu);
        } else if (id == R.id.nav_vienna) {
            mTimeMenu = System.currentTimeMillis() - tmpTimeMenu;
            objectText.setText("Geste: " + "Vienna" + " Temps: " + mTimeMenu);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
