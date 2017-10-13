package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.myapplication.entities.ResultApus;

public class DetailsActivity extends AppCompatActivity {

    private static final String FLIGHT_KEY = "FLIGHT_KEY_BUNDLE";
    private static final String FLIGHT_DETAILS_KEY = "FLIGHT_DETAILS_BUNDLE";

    private TextView textViewKey;
    private TextView textViewDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textViewKey = (TextView) findViewById(R.id.a_details_key);
        textViewDetails = (TextView) findViewById(R.id.a_details_details);

        String key = getIntent().getIntExtra(FLIGHT_KEY, 0) + "";
        String details = getIntent().getStringExtra(FLIGHT_DETAILS_KEY);

        textViewKey.setText(key);
        textViewDetails.setText(details);
    }

    public static void newIntent(Context context, ResultApus resultApus) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(FLIGHT_KEY, resultApus.getFlightNumber());
        intent.putExtra(FLIGHT_DETAILS_KEY, resultApus.getDetails());
        context.startActivity(intent);
    }
}
