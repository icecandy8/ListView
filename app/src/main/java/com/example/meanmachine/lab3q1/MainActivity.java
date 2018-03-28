package com.example.meanmachine.lab3q1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String city[] = {"Delhi", "Punjab", "Haryana", "Hyderabad", "Bangalore", "Manipal", "Udupi", "Arunachal Pradesh", "Assam", "Tripura"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.LV);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, city);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, city[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
