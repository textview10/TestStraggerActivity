package com.callphone.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author xu.wang
 * @date 2020/3/26 13:36
 * @desc
 */
public class TestLineLayout extends LinearLayout {

    private RecyclerView rv1;
    private RecyclerView rv2;

    public TestLineLayout(Context context) {
        super(context);
    }

    public TestLineLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestLineLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        rv1 = findViewById(R.id.recycler_view_1);
        rv2 = findViewById(R.id.recycler_view_2);

        LooperLayoutManager looperLayoutManager1 = new LooperLayoutManager(getContext());
        LooperLayoutManager looperLayoutManager2 = new LooperLayoutManager(getContext());

        rv1.setLayoutManager(looperLayoutManager1);
        rv2.setLayoutManager(looperLayoutManager2);

        rv1.setAdapter(new MainAdapter());
        rv2.setAdapter(new MainAdapter());

        rv2.postDelayed(new Runnable() {
            @Override
            public void run() {
                // item width
                rv2.scrollBy(120, 0);
            }
        },50);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (rv1 != null){
            rv1.dispatchTouchEvent(ev);
        }
        if (rv2 != null){
            rv2.dispatchTouchEvent(ev);
        }
        return true;
    }
}
