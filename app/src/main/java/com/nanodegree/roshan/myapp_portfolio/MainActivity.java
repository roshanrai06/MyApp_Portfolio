package com.nanodegree.roshan.myapp_portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v) {
        switch (v.getId()) {
            case R.id.buttonSpotify:
                Toast.makeText(this, R.string.string_spotify_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonScoreApp:
                Toast.makeText(this, R.string.string_score_app_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonLibraryApp:
                Toast.makeText(this, R.string.string_library_app_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonBuildItBigger:
                Toast.makeText(this, R.string.string_build_it_bigger_app_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonXYZReader:
                Toast.makeText(this, R.string.string_xyz_reader_app_message, Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonCapstoneOwnApp:
                Toast.makeText(this, R.string.string_capstone_app_message, Toast.LENGTH_SHORT).show();
                break;


        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
