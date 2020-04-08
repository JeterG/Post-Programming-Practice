package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> myarray= new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","1","1","1","2","1","3","1","4","1","5","1","6","1","7","1","8"));
    private GridView mylistview;
    private EditText myedittext;
    private Button mybutton;
    private Button myCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylistview=(GridView)findViewById(R.id.texts);
        final MyListAdapter adapter = new MyListAdapter(myarray);
        myedittext=(EditText)findViewById(R.id.editText);
        mybutton=(Button)findViewById(R.id.submit);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(myedittext.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        myCheck=(Button)findViewById(R.id.check);
        myCheck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                adapter.check(myarray);
                v.requestFocus();
                adapter.notifyDataSetChanged();

            }
        });

        mylistview.setAdapter(adapter);
//Items should be removed if they are equal, or add to 10, and there has to be a clear path between the items.
        // use the on click to update 2 global variables that will be place holders for the numbers to compare.
        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("memes"," "+position+" "+id);
//                adapter.getItem(position);
//                view.setBackgroundColor(Color.GREEN);
//                Log.d("color"," "+view.getBackground().toString());
//                    adapter.updateColor(view);
//                TextView view1= (TextView) adapter.getView(position,mylistview,null);
//                view1.setBackgroundColor(1);
                adapter.updateItem(position,"");
                adapter.compare(view,position,id);
                view.requestFocus();
//                view.
//                adapter.removeItem(position);

                adapter.notifyDataSetChanged();
//                view.setBackgroundColor(Color.GREEN);
//                adapter.

            }
        });
    }
}
