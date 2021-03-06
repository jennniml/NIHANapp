package com.example.android.nihanapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class CaneWalkerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ConstraintLayout expandableView, expandableView2, expandableView3, expandableView4;
        final ImageView arrowBtn, arrowBtn2, arrowBtn3, arrowBtn4;
        final CardView cardView, cardView2, cardView3, cardView4;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cane_walker);

        // Initialize the views.
        TextView sportsTitle = findViewById(R.id.titleDetail);
        ImageView sportsImage = findViewById(R.id.tipsImageDetail);

        // Set the text from the Intent extra.
        sportsTitle.setText(getIntent().getStringExtra("title"));

        // Load the image using the Glide library and the Intent extra.
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);


        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    arrowBtn.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    arrowBtn.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });

        expandableView2 = findViewById(R.id.expandableView2);
        arrowBtn2 = findViewById(R.id.arrowBtn2);
        cardView2 = findViewById(R.id.cardView2);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableView2.setVisibility(View.VISIBLE);
                    arrowBtn2.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableView2.setVisibility(View.GONE);
                    arrowBtn2.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });


        expandableView3 = findViewById(R.id.expandableView3);
        arrowBtn3 = findViewById(R.id.arrowBtn3);
        cardView3 = findViewById(R.id.cardView3);

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.VISIBLE);
                    arrowBtn3.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.GONE);
                    arrowBtn3.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });

        expandableView4 = findViewById(R.id.expandableView4);
        arrowBtn4 = findViewById(R.id.arrowBtn4);
        cardView4 = findViewById(R.id.cardView4);

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView4.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandableView4.setVisibility(View.VISIBLE);
                    arrowBtn4.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    TransitionManager.beginDelayedTransition(cardView4, new AutoTransition());
                    expandableView4.setVisibility(View.GONE);
                    arrowBtn4.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
            }
        });
    }
}
