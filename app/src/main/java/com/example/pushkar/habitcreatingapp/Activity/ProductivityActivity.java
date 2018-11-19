package com.example.pushkar.habitcreatingapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterProductivity;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class ProductivityActivity extends AppCompatActivity {

    RecyclerView rvProductivity;
    AdapterProductivity adapterProductivity;
    ArrayList<HabitData> productivityDataList = generateProductivity();

    public static final String TAG = "Productivity Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productivity);

        Log.d(TAG, "onCreate: Activity start");

        rvProductivity = (RecyclerView)findViewById(R.id.rvProductivity);
        rvProductivity.setLayoutManager(new LinearLayoutManager(this));
        adapterProductivity = new AdapterProductivity(productivityDataList, this);
        rvProductivity.setAdapter(adapterProductivity);

        Log.d(TAG, "onCreate: AdapterProductivity has been set");

        adapterProductivity.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code

            }
        });
    }

    static ArrayList<HabitData> generateProductivity(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(501,"Plan Efficiently", "Morning", 00, 7,5));
        habitData.add(new HabitData(502,"Take Breaks", "Afternoon", 30, 13,5));
        habitData.add(new HabitData(503,"Use A To-Do List", "Morning", 00, 8,5));
        habitData.add(new HabitData(504,"Eliminate Distractions", "Evening", 00, 17,5));
        habitData.add(new HabitData(505,"Make Goals", "Night", 30, 21,5));
        habitData.add(new HabitData(506,"Get Enough Sleep", "Night", 00, 22,5));

        return habitData;
    }
}
