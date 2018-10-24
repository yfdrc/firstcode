package com.drc.firstcode.s02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.drc.firstcode.R;

public class s23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s23);

        Button button1 = (Button) findViewById(R.id.button231);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("extstr", "hello drc from main2");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
