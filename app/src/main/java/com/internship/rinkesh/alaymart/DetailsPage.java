package com.internship.rinkesh.alaymart;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DetailsPage extends AppCompatActivity {

    private LinearLayout view;
    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        view = findViewById(R.id.resheader);
        anim = (AnimationDrawable) view.getBackground();

        startanim();
    }


    private void startanim() {

        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);
        anim.start();

    }
}
