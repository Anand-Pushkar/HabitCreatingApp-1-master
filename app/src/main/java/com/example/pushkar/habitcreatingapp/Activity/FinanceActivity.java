package com.example.pushkar.habitcreatingapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.pushkar.habitcreatingapp.Adapters.AdapterFinance;
import com.example.pushkar.habitcreatingapp.Adapters.AdapterHealth;
import com.example.pushkar.habitcreatingapp.Interfaces.OnItemClickListener;
import com.example.pushkar.habitcreatingapp.Models.HabitData;
import com.example.pushkar.habitcreatingapp.R;

import java.util.ArrayList;

public class FinanceActivity extends AppCompatActivity {

    RecyclerView rvFinance;
    AdapterFinance adapterFinance;
    ArrayList<HabitData> financeDataList = generateFinance();

    public static final String TAG = "Finance Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);

        Log.d(TAG, "onCreate: Activity start");

        rvFinance = (RecyclerView)findViewById(R.id.rvFinance);
        rvFinance.setLayoutManager(new LinearLayoutManager(this));
        adapterFinance = new AdapterFinance(financeDataList, this);
        rvFinance.setAdapter(adapterFinance);

        Log.d(TAG, "onCreate: AdapterFinance has been set");

        adapterFinance.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int itemId, View clickedView) {

                // add the firebase code

            }
        });
    }

    static ArrayList<HabitData> generateFinance(){

        ArrayList<HabitData> habitData = new ArrayList<>();

        habitData.add(new HabitData(601,"Don't Carry Too Much Cash", "Morning", 00, 8,6));
        habitData.add(new HabitData(602,"Make A Budget", "Morning", 30, 7,6));
        habitData.add(new HabitData(603,"Track Daily Expenses", "Evening", 00, 20,6));
        habitData.add(new HabitData(604,"Save and Invest", "Night", 00, 21,6));
        habitData.add(new HabitData(605,"Have Multiple Sources Of Income", "Night", 00, 22,6));
        habitData.add(new HabitData(606,"Reward Yourself Once A Week", "Night", 00, 22,6));

        return habitData;
    }
}
