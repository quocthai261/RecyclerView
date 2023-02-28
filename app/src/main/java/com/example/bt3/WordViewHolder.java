package com.example.bt3;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private Context context;
    private ImageView imageView;
    private TextView newsTitle;
    private TextView newsDescription;
    private final WordListAdapter mAdapter;
    String titleTxt = "";
    int resourceImg = 0;
    String short_descriptionNews = "";
    String descriptionNews = "";


    public WordViewHolder(Context context, View itemView, WordListAdapter adapter){
        super(itemView);
        newsTitle = itemView.findViewById(R.id.word);
        imageView = itemView.findViewById(R.id.imageViewSrc);
        newsDescription = itemView.findViewById(R.id.short_description);
        this.mAdapter = adapter;
        this.context = context;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(context, ViewDetailActivity1.class);
        intent.putExtra("imageSource", resourceImg);
        intent.putExtra("title", titleTxt);
        intent.putExtra("description", descriptionNews);
        context.startActivity(intent);
    }

    public void SetData(int resource, String title, String short_description, String description){
        imageView.setImageResource(resource);
        newsTitle.setText(title);
        newsDescription.setText(short_description);
        titleTxt = title;
        resourceImg = resource;
        short_descriptionNews = short_description;
        descriptionNews = description;
    }
}
