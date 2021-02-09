package com.example.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner choose_dhikr = findViewById(R.id.choose_dhikr);

        List<Map<String, String>> items =  (new Items().getitems());

        SimpleAdapter adapter = new SimpleAdapter(this, items,
                android.R.layout.simple_spinner_item,
                new String[] {"text", "subText"},
                new int[] {android.R.id.text1, android.R.id.text2});

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_2);
        choose_dhikr.setAdapter(adapter);




    }
}