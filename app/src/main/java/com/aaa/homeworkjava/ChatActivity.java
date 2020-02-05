package com.aaa.homeworkjava;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ChatActivity extends AppCompatActivity {

    ListView simpleList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_single);

        String userList[] = {"", "", "", "", "", ""};


        simpleList = (ListView) findViewById(R.id.simpleListView);
        ViewListAdapter viewListAdapter = new ViewListAdapter(getApplicationContext(), userList);
        simpleList.setAdapter(viewListAdapter);
    }


    }

