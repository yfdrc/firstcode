package com.drc.firstcode.s02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.drc.firstcode.R;

public class s24Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s24);

        Intent intent = getIntent();
        Bundle drcbun = intent.getExtras();
        if (drcbun == null) {
            Log.d("drc", "null");
        } else {
            String str = drcbun.getString("bunstr");
            Log.d("drc", "not null:" + str);
        }
    }
}
