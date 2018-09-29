package com.example.ramy.listviewinfragment;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListFragment customListFrgmt = (CustomListFragment) getSupportFragmentManager().findFragmentById(R.id.customlistfragment);
        customListFrgmt.addItem(ContextCompat.getDrawable(this, R.drawable.web_hi_res_512),
                "New Box", "New Account Box Black 36dp") ;
    }
}
