package com.work.myandroidapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class adapter extends BaseAdapter {

    Context context;

    String[] car = {"Tesla","Audi","BMW","Tesla","Audi","BMW"};

    int[] pic= {R.drawable.neptune,
            R.drawable.uranus,
            R.drawable.venus,
            R.drawable.neptune,
            R.drawable.uranus,
            R.drawable.venus};

    String[] description ={"This is fastest car","It has Autopilot mode",
        "It can race up to 500 miles/hr",
        "This is luxurious car",
        "it has booster",
        "It can sense hurdles around pavements"};

    public adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return car.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View root = LayoutInflater.from(context).inflate(R.layout.listview_content,null);

        ImageView img = root.findViewById(R.id.img1);
        TextView tv = root.findViewById(R.id.textview1);
        Button btn = root.findViewById(R.id.btn);

        img.setImageResource(pic[position]);

        tv.setText(car[position]);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,displayonedata.class);
                intent.putExtra("img",pic[position]);
                intent.putExtra("title",car[position]);
                intent.putExtra("description",description[position]);
                context.startActivity(intent);
            }
        });
        return root;
    }
}
