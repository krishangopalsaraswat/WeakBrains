package com.example.abhi.weakbrain;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.abhi.weakbrain.Model.Friend;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhi on 28/3/18.
 */

public class Database extends SQLiteAssetHelper {

    private static final String DB_NAME="weakbrain.db";
    private static final int DB_VER=1;

    public Database(Context context) {
        super(context, DB_NAME, null,DB_VER);
    }


    public List<Friend> getFriends(){
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[] sqlSelect={"Id","Name","Address","Email","Phone"};
        String tableName="weakbrains";
        qb.setTables(tableName);
        Cursor cursor=qb.query(db,sqlSelect,null,null,null,null,null);
        List<Friend> result=new ArrayList<>();
        if(cursor.moveToFirst()){
            do {
                Friend friend=new Friend();
                friend.setId(cursor.getInt(cursor.getColumnIndex("Id")));
                friend.setName(cursor.getString(cursor.getColumnIndex("Name")));
                friend.setAddress(cursor.getString(cursor.getColumnIndex("Address")));
                friend.setEmail(cursor.getString(cursor.getColumnIndex("Email")));
                friend.setPhone(cursor.getString(cursor.getColumnIndex("Phone")));
                result.add(friend);
            }while (cursor.moveToNext());
        }
        return result;
    }

    public List<String> getNames(){
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[] sqlSelect={"Name"};
        String tableName="weakbrains";
        qb.setTables(tableName);
        Cursor cursor=qb.query(db,sqlSelect,null,null,null,null,null);
        List<String> result=new ArrayList<>();
        if(cursor.moveToFirst()){
            do {

                result.add(cursor.getString(cursor.getColumnIndex("Name")));
            }while (cursor.moveToNext());
        }
        return result;

    }
    public List<Friend> getFriendByName(String name){
        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb=new SQLiteQueryBuilder();

        String[] sqlSelect={"Id","Name","Address","Email","Phone"};
        String tableName="weakbrains";
        qb.setTables(tableName);

        Cursor cursor=qb.query(db,sqlSelect,"Name Like ?",new String[]{"%"+name+"%"},null,null,null);
        List<Friend> result=new ArrayList<>();
        if(cursor.moveToFirst()){
            do {
                Friend friend=new Friend();
                friend.setId(cursor.getInt(cursor.getColumnIndex("Id")));
                friend.setName(cursor.getString(cursor.getColumnIndex("Name")));
                friend.setAddress(cursor.getString(cursor.getColumnIndex("Address")));
                friend.setEmail(cursor.getString(cursor.getColumnIndex("Email")));
                friend.setPhone(cursor.getString(cursor.getColumnIndex("Phone")));
                result.add(friend);
            }while (cursor.moveToNext());
        }
        return result;
    }
}
