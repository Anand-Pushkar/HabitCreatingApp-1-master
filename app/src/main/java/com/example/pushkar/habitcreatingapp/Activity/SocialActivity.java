package com.example.pushkar.habitcreatingapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterSocial;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class SocialActivity extends AppCompatActivity {

    RecyclerView rvSocial;
    AdapterSocial adapterSocial;
    ArrayList<HabitData> socialDataList = generateSocial();

    public static final String TAG = "social Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);

        Log.d(TAG, "onCreate: Activity start");

        rvSocial = (RecyclerView)findViewById(R.id.rvSocial);
        rvSocial.setLayoutManager(new LinearLayoutManager(this));
        adapterSocial = new AdapterSocial(socialDataList, this);
        rvSocial.setAdapter(adapterSocial);

        Log.d(TAG, "onCreate: AdapterSocial has been set");

        adapterSocial.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code

            }
        });
    }

    static ArrayList<HabitData> generateSocial(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(301,"Greet 3 People", "Morning", 00, 9,3));
        habitData.add(new HabitData(302,"Ask For Help If Needed", "Evening", 30, 7,3));
        habitData.add(new HabitData(303,"Time Off Your Phone", "Evening", 00, 19,3));
        habitData.add(new HabitData(304,"Make Plans", "Night", 00, 21,3));
        habitData.add(new HabitData(305,"Time Off of Social Media", "Afternoon", 00, 14,3));

        return habitData;
    }
}
