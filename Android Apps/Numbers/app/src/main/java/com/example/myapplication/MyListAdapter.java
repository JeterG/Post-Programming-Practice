package com.example.myapplication;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyListAdapter extends BaseAdapter {

    private ArrayList<String> myarray;
    private View comp1=null;
    private View comp2=null;
    private int position1;
    private int position2;


    public MyListAdapter(ArrayList<String> myarray) {
        this.myarray = myarray;
    }

    public void addItem(String entry){
        myarray.add(entry);

    }

    public void compare(View view,int position,long id){
        if (comp1==null){
            comp1=view;
            position1=position;
        }
        else if(comp2==null){
            comp2=view;
            position2=position;
        }
        else{
            Log.d("compare",""+(getItem(position1)==getItem(position2)));
        }
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
