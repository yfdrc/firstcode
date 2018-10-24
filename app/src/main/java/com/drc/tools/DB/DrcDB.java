package com.drc.tools.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DrcDB {
    private static final String TAG = "drctest";
    private DrcDataBaseHelper dbhelper = null;
    private SQLiteDatabase db = null;
    private String tablename = null;

    public DrcDB(String DBname, String Tablename, Context context, int ver) {
        if(dbhelper==null || db==null) {
            Log.i(TAG, "DrcDB: init");
            dbhelper = new DrcDataBaseHelper(context, DBname, ver);
            db = dbhelper.getWritableDatabase();
            tablename = Tablename;
        }else{
            Log.i(TAG, "DrcDB: ok");
        }
    }

    public void AddTable() {
        ContentValues vals = new ContentValues();
        vals.put("name", "yfqx");
        vals.put("auth", "drc");
        vals.put("pages", "323");
        vals.put("price", "2.2");
        db.insert(tablename,null, vals);
        vals.clear();
    }

    public void UpdateTable() {
        ContentValues vals = new ContentValues();
        vals.put("price", "3.3");
        db.update(tablename, vals,"name=?", new String[]{"yfqx"});
    }

    public void DeleteTable() {
        ContentValues vals = new ContentValues();
        db.delete(tablename,"price>=?", new String[]{"3"});
    }

    public void ReadTable() {
        Cursor cursor = db.query(tablename,null,null,null,null,null,null);
        if(cursor.moveToFirst()){
            do{
                String name =cursor.getString(cursor.getColumnIndex("name"));
                Float price =cursor.getFloat(cursor.getColumnIndex("price"));
                Log.i(TAG, "ReadTable: name=" + name + " price=" + price.toString());
            }while (cursor.moveToNext());
        }
        cursor.close();
    }
}