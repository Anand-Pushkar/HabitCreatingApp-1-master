package com.example.pushkar.habitcreatingapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterRelationships;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class RelationshipsActivity extends AppCompatActivity {

    RecyclerView rvRelationships;
    AdapterRelationships adapterRelationships;
    ArrayList<HabitData> relationshipsDataList = generateRelationships();

    public static final String TAG = "Relationships Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relationships);

        Log.d(TAG, "onCreate: Activity start");

        rvRelationships = (RecyclerView)findViewById(R.id.rvRelationships);
        rvRelationships.setLayoutManager(new LinearLayoutManager(this));
        adapterRelationships = new AdapterRelationships(relationshipsDataList, this);
        rvRelationships.setAdapter(adapterRelationships);

        Log.d(TAG, "onCreate: AdapterHealth has been set");

        adapterRelationships.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code

            }
        });
    }

    static ArrayList<HabitData> generateRelationships(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(401,"Spend Quality Time Together", "Evening", 00, 18,4));
        habitData.add(new HabitData(402,"Share A Meal", "Afternoon", 30, 13,4));
        habitData.add(new HabitData(403,"Talk Out The Differences", "Evening", 00, 19,4));
        habitData.add(new HabitData(404,"Express Your Gratitude", "Night", 00, 21,4));
        habitData.add(new HabitData(405,"Cook Together", "Night", 00, 20,4));
        habitData.add(new HabitData(406,"Exercise Together", "Morning", 00, 6,4));


        return habitData;
    }
}
