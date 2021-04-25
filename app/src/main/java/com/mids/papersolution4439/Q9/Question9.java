package com.mids.papersolution4439.Q9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.mids.papersolution4439.R;

import java.util.ArrayList;
import java.util.List;

public class Question9 extends AppCompatActivity {
    private RecyclerView recyclerHouses;
    private List<House> houseList;
    private HouseAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        recyclerHouses = findViewById(R.id.recyclerHouses);
        loadHouses();

    }

    private void loadHouses() {
        houseList = new ArrayList<>();
        houseList.add(new House("PKR 17 Lac - 8.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Islamabad",
                "Houses", "1211.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 12 Lac - 2.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Islamabad",
                "Houses", "3281.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 52 Lac - 1.6 Crore", "River Courtyard", "Bahria Town Rawalpindi, Multan", "Houses",
                "1201.00 - 317.00 Sq.Ft"));
        houseList.add(new House("PKR 89 Lac - 5.1 Crore", "River Courtyard", "Bahria Town Rawalpindi, Karachi", "Houses",
                "2231.00 - 317.00 Sq.Ft"));
        adapter = new HouseAdapter(Question9.this, houseList);
        recyclerHouses.setAdapter(adapter);
    }
}