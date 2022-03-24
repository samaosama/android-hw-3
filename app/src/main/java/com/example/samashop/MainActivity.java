package com.example.samashop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Items> Items=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Items tea= new Items("Tea", R.drawable.herbaltea,1);
        Items bubble_tea= new Items("Bubble Tea", R.drawable.bubbletea,2.5);
        Items coffee= new Items("Coffee", R.drawable.coffee,1.5);
        Items juice= new Items("Fresh Juice", R.drawable.juices,1.5);
        Items cookie= new Items("Cookie", R.drawable.cookie,0.5);
        Items croissant= new Items("Croissant", R.drawable.croissant,1);
        Items cupcakes= new Items("Cupcake", R.drawable.cupcakes,1);
        Items chocolate= new Items("Chocolate Bar", R.drawable.chocolate,0.5);
        Items icecream= new Items("Ice Cream", R.drawable.icecream,1);

        Items.add(tea);
        Items.add(bubble_tea);
        Items.add(coffee);
        Items.add(juice);
        Items.add(cookie);
        Items.add(croissant);
        Items.add(cupcakes);
        Items.add(chocolate);
        Items.add(icecream);

        itemsadapter itemAdapter=new itemsadapter(this,0,Items);
        ListView Listview= findViewById(R.id.listView);
        Listview.setAdapter(itemAdapter);
    }
}