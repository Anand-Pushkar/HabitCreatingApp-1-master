package com.example.pushkar.habitcreatingapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterHealth;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class HealthActivity extends AppCompatActivity {

    RecyclerView rvHealth;
    AdapterHealth adapterHealth;
    ArrayList<HabitData> healthDataList = generateHealth();

    public static final String TAG = "Health Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        Log.d(TAG, "onCreate: Activity start");

        rvHealth = (RecyclerView)findViewById(R.id.rvHealth);
        rvHealth.setLayoutManager(new LinearLayoutManager(this));
        adapterHealth = new AdapterHealth(healthDataList, this);
        rvHealth.setAdapter(adapterHealth);

        Log.d(TAG, "onCreate: AdapterHealth has been set");

        adapterHealth.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code

            }
        });
    }

    static ArrayList<HabitData> generateHealth(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(101,"Drink Water", "Morning", 00, 7,1));
        habitData.add(new HabitData(102,"Eat Breakfast", "Morning", 30, 7,1));
        habitData.add(new HabitData(103,"Exercise", "Evening", 00, 19,1));
        habitData.add(new HabitData(104,"Count Your Step", "Night", 00, 21,1));
        habitData.add(new HabitData(105,"Sleep Well", "Night", 00, 22,1));

        return habitData;
    }
}
