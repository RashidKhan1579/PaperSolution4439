package com.mids.papersolution4439.Q9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mids.papersolution4439.R;

import java.util.List;
public class HouseAdapter extends RecyclerView.Adapter<HouseAdapter.ViewHolder> {
    private Context context;
    private List<House> houses;
    private LayoutInflater layoutInflater;
    public HouseAdapter(Context context, List<House> houses) {
        this.context = context;
        this.houses = houses;
        this.layoutInflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public HouseAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.item_layout, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull HouseAdapter.ViewHolder holder, int position) {
        holder.txtPrice.setText(houses.get(position).getPrice());
        holder.txtPlace.setText(houses.get(position).getPlace());
        holder.txtCity.setText(houses.get(position).getCity());
        holder.txtCategory.setText(houses.get(position).getCategory());
        holder.txtArea.setText(houses.get(position).getArea());
    }
    @Override
    public int getItemCount() {
        return houses == null ? 0 : houses.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtPrice, txtPlace, txtCity, txtCategory, txtArea;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtPlace = itemView.findViewById(R.id.txtPlace);
            txtCity = itemView.findViewById(R.id.txtCity);
            txtCategory = itemView.findViewById(R.id.txtCategory);
            txtArea = itemView.findViewById(R.id.txtArea);
        }
    }
}