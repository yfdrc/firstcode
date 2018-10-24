package com.drc.firstcode.s03;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.drc.firstcode.R;
import com.drc.tools.DB.DrcDB;

public class s31Activity extends AppCompatActivity {
    private Context mContext;
    private String mDBname;
    private String mTbname;
    private int mVer;
    private DrcDB mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s31);

        mContext = this;
        mDBname = "BookStore.db";
        mTbname = "Book";
        mVer = 1;
        mDb = null;
        Button b1 = (Button) findViewById(R.id.button311);
        Button b2 = (Button) findViewById(R.id.button312);
        Button b3 = (Button) findViewById(R.id.button313);
        Button b4 = (Button) findViewById(R.id.button314);
        Button b5 = (Button) findViewById(R.id.button315);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDb = new DrcDB(mDBname, mTbname, mContext, mVer);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDb.AddTable();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDb.UpdateTable();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDb.DeleteTable();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDb.ReadTable();
            }
        });
    }
}
