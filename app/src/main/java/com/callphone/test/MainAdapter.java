package com.callphone.test;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author xu.wang
 * @date 2020/3/26 12:56
 * @desc
 */
public class MainAdapter extends RecyclerView.Adapter<MainHolder> {
    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new MainHolder(LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
             holder.tvMain.setText(String.valueOf(position));

        if (position == 1) {
            holder.itemView.setBackgroundColor(Color.BLUE);


        } else if (position % 2 == 0){
            holder.itemView.setBackgroundColor(Color.RED);
        } else {
            holder.itemView.setBackgroundColor(Color.GREEN);

        }
    }

    @Override
    public int getItemCount() {
        return 12;
    }

}
