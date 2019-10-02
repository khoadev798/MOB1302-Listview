package com.example.lab33_ps10814;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    static final String[] Subjects = new String[]{
            "Android cơ bản",
            "Android nâng cao",
            "Thiết kế giao diện Android Android",
            "Test và triển khai ứng dụng Android",
            "NodeJS",
            "Game2D"
    };


    private ListView lv = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapComp();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Subjects);
        lv.setAdapter(adapter);
    }

    private void mapComp(){
        if(lv==null)
            lv = findViewById(R.id.subjectsList);
    }
}
