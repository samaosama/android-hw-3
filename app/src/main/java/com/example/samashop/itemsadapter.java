package com.example.samashop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class itemsadapter extends ArrayAdapter<Items> {
    List<Items> itemsadapter;
    public itemsadapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
        itemsadapter=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(getContext()).inflate(R.layout.itemslist,parent,false);
        Items currentitem= itemsadapter.get(position);

        ImageView img=view.findViewById(R.id.imageView);
        TextView name=view.findViewById(R.id.itemname);
        TextView price= view.findViewById(R.id.itemprice);

        img.setImageResource(currentitem.getItemImage());
        name.setText(currentitem.getItemName());
        price.setText(currentitem.getItemPrice() + "");
        return view;

    }
}
