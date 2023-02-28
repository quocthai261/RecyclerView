package com.example.bt3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;


public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {

    private Context context;
    private LinkedList<NewsView> NewsList = new LinkedList<NewsView>();

    public WordListAdapter(Context context, LinkedList<NewsView> newsList) {
        this.context = context;
        this.NewsList = newsList;
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);

        return new WordViewHolder(context, mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        int resource = NewsList.get(position).getImageViewSource();
        String title = NewsList.get(position).getTitle();
        String short_description = NewsList.get(position).getShort_description();
        String description = NewsList.get(position).getDescription();
        holder.SetData(resource, title, short_description, description);
    }

    @Override
    public int getItemCount() {
        return NewsList.size();
    }
}
