package com.example.pushkar.habitcreatingapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterHealth;
import com.example.pushkar.habitcreatingapp.Adapters.AdapterSpiritual;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class SpiritualActivity extends AppCompatActivity {

    RecyclerView rvSpiritual;
    AdapterHealth adapterSpiritual;
    ArrayList<HabitData> spiritualDataList = generateSpiritual();

    public static final String TAG = "Spiritual Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spiritual);

        Log.d(TAG, "onCreate: Activity start");

        rvSpiritual = (RecyclerView)findViewById(R.id.rvSpiritual);
        rvSpiritual.setLayoutManager(new LinearLayoutManager(this));
        adapterSpiritual = new AdapterHealth(spiritualDataList, this);
        rvSpiritual.setAdapter(adapterSpiritual);

        Log.d(TAG, "onCreate: AdapterSpiritual has been set");

        adapterSpiritual.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code here

            }
        });
    }

    static ArrayList<HabitData> generateSpiritual(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(201,"Greet To Your Parernts", "Morning", 00, 7,2));
        habitData.add(new HabitData(202,"Meditate", "Morning", 30, 7,2));
        habitData.add(new HabitData(203,"Grateful To 3 Things", "Evening", 00, 20,2));
        habitData.add(new HabitData(204,"Forgive", "Night", 00, 21,2));
        habitData.add(new HabitData(205,"Spend Time Alone", "Night", 00, 22,2));

        return habitData;
    }
}
