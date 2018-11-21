package com.example.faisal.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView l1 =(ListView)findViewById(R.id.l1);
        final TextView text1=(TextView)findViewById(R.id.t2);
        String[] food =new String[]{
                "Momos",
                "Noodles",
                "Biryani",
                "Chilli Potatoes",
                "Burger"};
        List <String> food_list=new ArrayList<>(Arrays.asList(food));
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,food_list);
        l1.setAdapter(arrayAdapter);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String selectedItem=(String)adapterView.getItemAtPosition(i);
                text1.setText("Your selected:" + selectedItem);
            }
        });
        }
    }
