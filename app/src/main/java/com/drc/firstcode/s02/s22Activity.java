package com.drc.firstcode.s02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.drc.firstcode.R;

public class s22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s22);

        Intent intent = getIntent();
        if (intent.hasExtra("exstr")) {
            String data = intent.getStringExtra("exstr");
            Log.d("drc", data);
        }
    }
}
