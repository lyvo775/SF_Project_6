package com.l2team.sf_project_6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dtbSF extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "SmartFashion.db";

    //table Category_table

    public static final String TABLE_CAT = "category_table";
    public static final String CAT_ID = "cat_id";
    public static final String CAT_NAME = "cat_name";

    //table Kind_table

    public static final String TABLE_KIND = "kind_table";
    public static final String KIND_ID = "kind_id";
    public static final String KIND_NAME = "kind_name";

    //table Items_table

    public static final String TABLE_ITEMS = "items_table";
    public static final String ITEM_ID = "item_id";
    public static final String ITEM_COLOR = "item_color";
    public static final String ITEM_BRAND = "item_brand";

    //create tables

    private static final String CREATE_TABLE_CATEGORY = "CREATE TABLE "
            + TABLE_CAT + "("
            + CAT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + CAT_NAME  + " VARCHAR" + ")";

    private static final String CREATE_TABLE_KIND = "CREATE TABLE "
            + TABLE_KIND + "("
            + KIND_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + KIND_NAME + " VARCHAR,"
            + CAT_ID + " INTERGER,"
            + " FOREIGN KEY (" + CAT_ID + ") REFERENCES " + TABLE_CAT + "(" + CAT_ID + "))";

    private static final String CREATE_TABLE_ITEMS = "CREATE TABLE "
            + TABLE_ITEMS + "("
            + ITEM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ITEM_COLOR + " TEXT,"
            + ITEM_BRAND + " TEXT,"
            + CAT_ID + " INTERGER,"
            + KIND_ID + " INTERGER,"
            + " FOREIGN KEY (" + KIND_ID + ") REFERENCES " + TABLE_KIND + "(" + KIND_ID + "),"
            + " FOREIGN KEY (" + CAT_ID + ") REFERENCES " + TABLE_CAT + "(" + CAT_ID + "))";


    public dtbSF(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_CATEGORY);

        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Tops') ");
        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Bottoms') ");
        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Shoes') ");
        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Dresses') ");
        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Outerwear') ");
        db.execSQL("INSERT INTO " + TABLE_CAT + "(" + CAT_NAME + ") VALUES ('Accessories') ");

        db.execSQL(CREATE_TABLE_KIND);
        db.execSQL(CREATE_TABLE_ITEMS);





    }

    //insert data

    private void insertData_CAT(int CAT_ID, String CAT_NAME, SQLiteDatabase dtb){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("CAT_NAME", CAT_NAME);
        dtb.insert("TABLE_CAT", null, values);

    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_CAT);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KIND);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ITEMS);

        onCreate(db);

    }


}
