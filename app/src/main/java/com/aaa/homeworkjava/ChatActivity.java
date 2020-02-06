package com.aaa.homeworkjava;


import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class ChatActivity extends AppCompatActivity {
    public  static FirebaseDatabase dataBase;
    public  static DatabaseReference ref;

    ListView simpleList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBase = FirebaseDatabase.getInstance();
        ref = dataBase.getReference();
        setContentView(R.layout.chat);



        String userList[] = {"", "", "", "", "", ""};


        simpleList = (ListView) findViewById(R.id.simpleListView);
        ViewListAdapter viewListAdapter = new ViewListAdapter(getApplicationContext(), userList);
        simpleList.setAdapter(viewListAdapter);
    }


    }

