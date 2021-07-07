package com.example.articlerecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorHolder> {
    ArrayList<Author>authorArrayList;
    private AuthorName authorName;

    public AuthorAdapter(ArrayList<Author>authors,AuthorName authorName){
        authorArrayList=authors;
        this.authorName=authorName;

    }
    @NonNull

    @Override
    public AuthorHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.author_layout,parent,false);
        return new AuthorHolder(view,authorName);
    }

    @Override
    public void onBindViewHolder( AuthorHolder holder, int position) {
    Author author=authorArrayList.get(position);
    holder.setData(author);

    }

    @Override
    public int getItemCount() {
        return authorArrayList.size();
    }
}
