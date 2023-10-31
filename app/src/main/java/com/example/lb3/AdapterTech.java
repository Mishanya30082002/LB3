package com.example.lb3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterTech extends ArrayAdapter<Tech> {
    private Context context;
    private int resource;
    private List<Tech> teches;
    private LayoutInflater inflater;
    public AdapterTech (Context context,int resource, List<Tech> teches)
    {
        super(context,resource,teches);
        this.context = context;
        this.resource = resource;
        this.teches = teches;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.resource, parent, false);


        TextView nameView = view.findViewById(R.id.name);
        TextView discriptiomView = view.findViewById(R.id.discriptiom);;
        TextView priceView = view.findViewById(R.id.price);


        Tech tech = teches.get(position);

        nameView.setText(tech.getName());
        discriptiomView.setText(tech.getDescription());
        priceView.setText(tech.getPrice()+" рублей");

        return view;
    }
}
