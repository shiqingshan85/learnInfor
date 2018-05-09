package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ExpandableListView expandableListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView= (ExpandableListView) findViewById(R.id.expanded_lv);

        List<String> groups=new ArrayList<>();
        groups.add("教学信息");
        groups.add("学生信息");

        List<Course>  item1=new ArrayList<>();
        item1.add(new Course("Android课程",30));
        item1.add(new Course("JAVA课程",20));
        item1.add(new Course("C#课程",25));

        List<Students>  item2=new ArrayList<>();
        item2.add(new Students("张三",30));
        item2.add(new Students("李四",20));
        item2.add(new Students("王五",25));
    }


}
