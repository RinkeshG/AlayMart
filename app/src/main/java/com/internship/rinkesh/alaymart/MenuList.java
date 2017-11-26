package com.internship.rinkesh.alaymart;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MenuList extends AppCompatActivity {

    private RelativeLayout view;
    private AnimationDrawable anim;

    private String restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);


        view = findViewById(R.id.view);
        anim = (AnimationDrawable) view.getBackground();

        startanim();
    }

    public void detailsclick(View view) {

        Intent intent =  new Intent(this, RestaurantPage.class);
        startActivity(intent);
    }

    private void startanim() {

        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);
        anim.start();

    }
}
