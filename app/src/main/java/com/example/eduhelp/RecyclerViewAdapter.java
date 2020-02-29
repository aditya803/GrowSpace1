package com.example.eduhelp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    String Title[], Content[];
    int Image[];
    Context context;

    public RecyclerViewAdapter(Context ctx,String title[], String content[], int image[]){
        Title=title;
        Content=content;
        Image=image;
        context=ctx;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.custom_list_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(Title[position]);
        holder.content.setText(Content[position]);
        holder.image.setImageResource(Image[position]);

    }

    @Override
    public int getItemCount() {
        return Title.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        MultiAutoCompleteTextView content;
        ImageView image;
        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            title=itemView.findViewById(R.id.title);
            content=itemView.findViewById(R.id.content);
            image=itemView.findViewById(R.id.image);
        }
   }

}
