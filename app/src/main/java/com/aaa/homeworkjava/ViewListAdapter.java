package com.aaa.homeworkjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ViewListAdapter extends BaseAdapter {

    Context context;
    String userList[];
    LayoutInflater inflter;

    public ViewListAdapter(Context applicationContext, String[] userList) {
        this.userList = userList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return userList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        view = inflter.inflate(R.layout.list_single, null);
        TextView roomName = view.findViewById(R.id.silgle_tv1);
        TextView userName = view.findViewById(R.id.silgle_tv2);
        TextView messageBody = view.findViewById(R.id.silgle_tv3);
        roomName.setText(userList[position]);
        userName.setText(userList[position]);
        messageBody.setText(userList[position]);

        return view;
    }
    }
