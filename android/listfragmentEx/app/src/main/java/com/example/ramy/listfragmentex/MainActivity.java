package com.example.ramy.listfragmentex;

import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {
    static final String[] LIST_MENU = {"LIST1","LIST2","LIST3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,LIST_MENU);

        ListFragment menuListFrgmt = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.menulistfragment);
        menuListFrgmt.setListAdapter(adapter);
    }
}
