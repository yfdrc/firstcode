package com.drc.firstcode.s02;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.drc.firstcode.R;

public class s21Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s21);

        Button button1 = (Button) findViewById(R.id.button211);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("android.intent.action.MAIN2");
                intent.addCategory("com.drc.test.MAIN2");
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.button212);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s21Activity.this, s22Activity.class);
                intent.putExtra("exstr", "hello drc");
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button213);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s21Activity.this, s23Activity.class);
                startActivityForResult(intent, 1);
            }
        });

        Button button4 = (Button) findViewById(R.id.button214);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.button215);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(s21Activity.this, s24Activity.class);
                startActivity(intent);
            }
        });

        Button button6 = (Button) findViewById(R.id.button216);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle drcbun = new Bundle();
                drcbun.putString("bunstr","drcbunstr");
                Intent intent = new Intent(s21Activity.this, s24Activity.class);
                intent.putExtras(drcbun);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 1:
                switch (resultCode) {
                    case RESULT_OK:
                        Log.d("drc", data.getStringExtra("extstr"));
                        break;
                    default:
                        break;

                }
                break;

            default:
                break;
        }
    }

}
