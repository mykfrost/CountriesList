package com.chinatown254.android.countrieslist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chinatown254.android.countrieslist.model.Country;
import com.chinatown254.android.countrieslist.myAdapter.CountryAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Country country;
    List<Country> countries;
    RecyclerView mRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AddCountries();
        mRecycler = findViewById(R.id.mRecycler);
        CountryAdapter adapter = new CountryAdapter(this, countries);

        mRecycler.setAdapter(adapter);
        mRecycler.setLayoutManager(new LinearLayoutManager(this));




    }

    private void AddCountries() {
        countries = new ArrayList<>();
        countries.add(new Country("Kenya", "Nairobi", R.drawable.country));
        countries.add(new Country("Tanzania", "Dar es Salaam", R.drawable.country));
        countries.add(new Country("Uganda", "Kampala", R.drawable.country));
        countries.add(new Country("Rwanda", "Kigali", R.drawable.country));
        countries.add(new Country("Burundi", "Bujumbura", R.drawable.country));
        countries.add(new Country("Somalia", "Mogadishu", R.drawable.country));
        countries.add(new Country("Ethiopia", "Addis Ababa", R.drawable.country));
        countries.add(new Country("Sudan", "Khartoum", R.drawable.country));
        countries.add(new Country("South Sudan", "Juba", R.drawable.country));
        countries.add(new Country("Djibouti", "Djibouti", R.drawable.country));
        countries.add(new Country("Egypt", "Cairo", R.drawable.country));
        countries.add(new Country("Eritrea", "Asmara", R.drawable.country));

    }
}