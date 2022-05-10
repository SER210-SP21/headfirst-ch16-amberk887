package edu.quinnipiac.ser210.starbuzzch16;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemOnCLick(AdapterView<?> listView, View itemView, int position, long id){
                if (position ==0){
                    Intent intent = new Intent (TopLevelActivity.this,DrinkCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}