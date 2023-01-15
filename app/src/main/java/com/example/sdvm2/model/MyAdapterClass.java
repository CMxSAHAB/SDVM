package com.example.sdvm2.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sdvm2.R;


public class MyAdapterClass extends RecyclerView.Adapter<MyAdapterClass.MyViewHolder> {

    private Context context;
    private String[] s1,s2;
    private int[] images;


    public MyAdapterClass(Context context, String[] s1, String[] s2, int[] img) {
        this.context = context;
        this.s1 = s1;
        this.s2 = s2;
        this.images = img;


    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.stotram_layout, parent, false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.t1.setText(s1[position]);
        holder.t2.setText(s2[position]);
        holder.img.setImageResource(images[position]);

    }

    @Override
    public int getItemCount() {
        return s1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.stotraName);
            t2 = itemView.findViewById(R.id.stotraText);
            img = itemView.findViewById(R.id.stotraImage);
        }
    }
}
