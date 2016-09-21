package com.example.chellin.cardviewprogrammatically;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context mContext;

    LinearLayout mRelativeLayout;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Request window feature action bar
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.BLUE));

        mRelativeLayout = (LinearLayout) findViewById(R.id.rl);
        mButton = (Button) findViewById(R.id.btn);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Initialize a new CardView
                CardView card = new CardView(mContext);

                // Set the CardView layoutParams
                ActionBar.LayoutParams params = new ActionBar.LayoutParams(
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT
                );
                card.setLayoutParams(params);
                card.setRadius(9);
                card.setContentPadding(15, 15, 15, 15);
                card.setCardBackgroundColor(Color.parseColor("#FFC6D6C3"));
                card.setMaxCardElevation(15);
                card.setCardElevation(9);
                TextView tv = new TextView(mContext);
                tv.setLayoutParams(params);
                tv.setText("CardView\nProgrammatically");
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 30);
                tv.setTextColor(Color.RED);
                card.addView(tv);

                mRelativeLayout.addView(card);
            }
        });
    }

}
