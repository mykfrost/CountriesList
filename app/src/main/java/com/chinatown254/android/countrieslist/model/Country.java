package com.chinatown254.android.countrieslist.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.Instant;
import java.util.Calendar;

public class Country {
    private String name;
    private String capital;
    private long currentTimeMillis;
    private int flag;

    public Country(String name, String capital, int flag) {
        this.name = name;
        this.capital = capital;
        this.currentTimeMillis = getCurrentTimeMillis();
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }


    public int getFlag() {
        return flag;
    }

    // Consider removing setters if immutability is desired
    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCurrentTimeMillis(long currentTimeMillis) {
        this.currentTimeMillis = currentTimeMillis;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public long getCurrentTimeMillis() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return getCurrentTimeMillisApi26();
        } else {
            return getCurrentTimeMillisLegacy();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public long getCurrentTimeMillisApi26() {
        return Instant.now().toEpochMilli();
    }

    public long getCurrentTimeMillisLegacy() {
        return Calendar.getInstance().getTimeInMillis();
    }
}