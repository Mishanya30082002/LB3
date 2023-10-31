package com.example.lb3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Tech> teches = new ArrayList<>();
        @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listTech);
        init();
        AdapterTech adapterTech = new AdapterTech(this,R.layout.list_item,teches );
        listView.setAdapter(adapterTech);
    }
    private void init()
    {
        teches.add(new Tech("телевизор", "Большой и дорогой",20000));
        teches.add(new Tech("Smartphone", "Future", 599.99));
        teches.add(new Tech("Laptop", "Powerful laptop", 999.99));

    }
}