package com.chinatown254.android.countrieslist.myAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.chinatown254.android.countrieslist.R;
import com.chinatown254.android.countrieslist.model.Country;
import java.util.*;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    Context context;
    List<Country> countries;

    public CountryAdapter(Context context, List<Country> countries) {
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryAdapter.CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_view, parent, false);

        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.CountryViewHolder holder, int position) {
        holder.imageViewCountryFlag.setImageResource(countries.get(position).getFlag());
        holder.tvCountryName.setText(countries.get(position).getName());
        holder.tvCapitalCity.setText(countries.get(position).getCapital());
        holder.tvTime.setText(String.valueOf(countries.get(position).getCurrentTimeMillis()));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class CountryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewCountryFlag;
        TextView tvCountryName;
        TextView tvCapitalCity;
        TextView tvTime;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewCountryFlag = itemView.findViewById(R.id.imageViewCountryFlag);
            tvCountryName = itemView.findViewById(R.id.tvCountryName);
            tvCapitalCity = itemView.findViewById(R.id.tvCapitalCity);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }
}
