package com.callphone.test;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author xu.wang
 * @date 2020/3/26 12:57
 * @desc
 */
public class MainHolder extends RecyclerView.ViewHolder {

    public TextView tvMain;

    public MainHolder(@NonNull View itemView) {
        super(itemView);
        tvMain = itemView.findViewById(R.id.tv_main);
    }
}
