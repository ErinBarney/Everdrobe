package com.erin.Everdrobe.ui;

import android.content.Context;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.erin.Everdrobe.R;

import java.util.ArrayList;

public class ItemListAdapter extends ArrayAdapter<Item> {

    private Context mContext;

  /*  public ItemListAdapter(Context context, int resource, ArrayList<Item> objects){
        super(context, resource, objects);
        mContext context;
        mResource resource;

    }*/
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        String name = getItem(position).getName();
        String condition = getItem(position).getCondition();

        Item item = new Item(name, condition);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        /*convertView = inflator.inflate(mResource, parent, false);*/
        TextView tvName = (TextView) convertView.findViewById(R.id.text_name);
        TextView tvCondition = (TextView) convertView.findViewById(R.id.text_condition);
        tvName.setText(name);
        tvCondition.setText(condition);
        return convertView;


    }


}
