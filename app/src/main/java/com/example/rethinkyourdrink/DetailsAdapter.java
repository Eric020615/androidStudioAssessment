package com.example.rethinkyourdrink;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.MyViewHolder>{
    private Context context;
    private static List<Details> DetailsList;
    private TextView TVName, TVAge, TVGender, TVStatus;

    public DetailsAdapter(Context context,List<Details> DetailsList){
        this.context=context;
        this.DetailsList = DetailsList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder,int position) {
        Details temp=DetailsList.get(position);
    }

    @Override
    public int getItemCount() {
        return DetailsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
