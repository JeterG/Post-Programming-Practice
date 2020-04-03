package com.example.myapplication;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyListAdapter extends BaseAdapter {

    private ArrayList<String> myarray;

    public MyListAdapter(ArrayList<String> myarray) {
        this.myarray = myarray;
    }

    public void addItem(String entry){
        myarray.add(entry);

    }

    public void updateItem(int position,String entry){
        myarray.set(position,entry);
    }

    public void removeItem(int position){
        myarray.remove(myarray.get(position));
    }
    public void updateColor(View view){
        view.setBackgroundColor(Color.GREEN);
    }
    @Override
    public int getCount() {
        return myarray.size();
    }


    @Override
    public Object getItem(int position) {
        return myarray.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView=View.inflate(parent.getContext(),R.layout.item_layout,null);
        }
        ((TextView)convertView.findViewById(R.id.entry)).setText(myarray.get(position));
//        convertView.setBackgroundColor(Color.RED);
        return convertView;


    }
    public void check(ArrayList<String> myarray){
        int capacity=myarray.size();
        ArrayList<String> myarray2;
        for(int i=0;i<capacity;i++){
            myarray.add(myarray.get(i));
        }
    }
}
