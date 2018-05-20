package com.example.student.mentormatchingapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ClassListView extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] values = {"기계공학과", "산업공학과","화학공학과","신소재공학과","응용화학생명공학과",
                "환경안전공학과","건설시스템공학과","교통시스템공학과","건축학과","융합시스템공학과",
                "전자공학과","소프트웨어학과","사이버보안학과","미디어학과","국방디지털융합학과",
                "수학과","물리학과","화학과","생명과학과",
                "경영학과","e-비즈니스학과","금융공학과", "글로벌경영학과",
                "국어국문학과","영어영문학과","불어불문학과","사학과","문화콘텐츠학과",
                "경제학과","행정학과","심리학과","사회학과","정치외교학과","스포츠레저학과",
                "법학과","의학과","간호학과","약학과"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item +" Selected",Toast.LENGTH_LONG).show();
    }
}
