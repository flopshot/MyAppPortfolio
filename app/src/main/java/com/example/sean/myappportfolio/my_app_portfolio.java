package com.example.sean.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class my_app_portfolio extends AppCompatActivity {
/*    private Button button1, button2, button3,
                    button4, button5, button6;
                    button1 = (Button) findViewById(R.id.button1);
                    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_app_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void onButtonClick1(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Popular Movies app!",
                Toast.LENGTH_LONG).show();
    }

    public void onButtonClick2(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Stock Hawk app!",
                Toast.LENGTH_LONG).show();
    }

    public void onButtonClick3(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Build It Bigger app!",
                Toast.LENGTH_LONG).show();
    }

    public void onButtonClick4(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Make Your App Material app!",
                Toast.LENGTH_LONG).show();
    }

    public void onButtonClick5(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Go Ubiquitous app!",
                Toast.LENGTH_LONG).show();
    }

    public void onButtonClick6(View v) {
        Toast.makeText(getApplicationContext(),
                "This button will launch my Capstone app!",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_app_portfolio, menu);
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
