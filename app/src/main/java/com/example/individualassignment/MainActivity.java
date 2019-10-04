package com.example.individualassignment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {

   static int i =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextClock Tclock1 = (TextClock) findViewById(R.id.textclock1);
        final TextClock Tclock2 = (TextClock) findViewById(R.id.textclock2);
        final TextClock Tclock3 = (TextClock) findViewById(R.id.textclock3);
        final TextClock Tclock4 = (TextClock) findViewById(R.id.textclock4);
        final TextClock Tclock5 = (TextClock) findViewById(R.id.textclock5);
        final LinearLayout linear1 = (LinearLayout) findViewById(R.id.sydneyblock);
        final LinearLayout linear2 = (LinearLayout) findViewById(R.id.beijingblock);
        final LinearLayout linear3 = (LinearLayout) findViewById(R.id.tokyoblock);
        final LinearLayout linear4 = (LinearLayout) findViewById(R.id.londonblock);
        final LinearLayout linear5 = (LinearLayout) findViewById(R.id.newyorkblock);
        final ImageView image1= (ImageView) findViewById(R.id.imageSydney);
        final ImageView image2= (ImageView) findViewById(R.id.imageBeijing);
        final ImageView image3= (ImageView) findViewById(R.id.imageTokyo);
        final ImageView image4= (ImageView) findViewById(R.id.imageLondon);
        final ImageView image5= (ImageView) findViewById(R.id.imageNewYork);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (i==1){
                    Snackbar.make(view, "this is 24hours fromat", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    Tclock1.setFormat12Hour("HH:mm");
                    Tclock2.setFormat12Hour("HH:mm");
                    Tclock3.setFormat12Hour("HH:mm");
                    Tclock4.setFormat12Hour("HH:mm");
                    Tclock5.setFormat12Hour("HH:mm");
                    i=0;

                }else {Snackbar.make(view, "this is 12hours fromat", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                    Tclock1.setFormat12Hour("hh:mm a");
                    Tclock2.setFormat12Hour("hh:mm a");
                    Tclock3.setFormat12Hour("hh:mm a");
                    Tclock4.setFormat12Hour("hh:mm a");
                    Tclock5.setFormat12Hour("hh:mm a");
                    i=1;
                }
            }
        });
        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (image1.getVisibility()==View.VISIBLE) {
                    image1.setVisibility(View.GONE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                }
            }
        });
        linear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image2.getVisibility()==View.VISIBLE) {
                    image2.setVisibility(View.GONE);
                } else {
                    image2.setVisibility(View.VISIBLE);
                }
            }
        });
        linear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image3.getVisibility()==View.VISIBLE) {
                    image3.setVisibility(View.GONE);
                } else {
                    image3.setVisibility(View.VISIBLE);
                }
            }
        });
        linear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image4.getVisibility()==View.VISIBLE) {
                    image4.setVisibility(View.GONE);
                } else {
                    image4.setVisibility(View.VISIBLE);
                }
            }
        });
        linear5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (image5.getVisibility()==View.VISIBLE) {
                    image5.setVisibility(View.GONE);
                } else {
                    image5.setVisibility(View.VISIBLE);
                }
            }
        });
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
