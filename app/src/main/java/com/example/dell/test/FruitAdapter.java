package com.example.dell.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL on 2016/11/3.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId,
                        List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    class ViewHolder{
        TextView fruitname;
    }

    public View getView(int position, View converView, ViewGroup parent){
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(converView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder = new ViewHolder();
            viewHolder.fruitname = (TextView) view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);
        }else{
            view = converView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.fruitname.setText(fruit.getName());
        return view;
    }
}
