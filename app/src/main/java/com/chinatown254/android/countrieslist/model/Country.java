package com.chinatown254.android.countrieslist.model;
import java.util.Calendar;
public class Country {
    private String name;
    private String capital;
    private long currentTimeMillis;
    private int flag;
    public Country(String name, String capital, long currentTimeMillis, int flag) {
        this.name = name;
        this.capital = capital;
        this.currentTimeMillis = Calendar.getInstance().getTimeInMillis();
        this.flag = flag;
    }
}
