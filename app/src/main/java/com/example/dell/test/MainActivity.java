package com.example.dell.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private List<Fruit> fruitList = new ArrayList<>();

    private void initFruit(){
        Fruit apple = new Fruit("Apple");
        fruitList.add(apple);
        Fruit banana = new Fruit("banana");
        fruitList.add(banana);
        Fruit orange = new Fruit("orange");
        fruitList.add(orange);
        Fruit watermalon = new Fruit("watermalon");
        fruitList.add(watermalon);
        Fruit pear = new Fruit("pear");
        fruitList.add(pear);
        Fruit grape = new Fruit("grape");
        fruitList.add(grape);
        Fruit pineapple = new Fruit("pineapple");
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("strawberry");
        fruitList.add(strawberry);
        Fruit cherry = new Fruit("cherry");
        fruitList.add(cherry);
        Fruit mango = new Fruit("mango");
        fruitList.add(mango);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,
                R.layout.fruit_item,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
