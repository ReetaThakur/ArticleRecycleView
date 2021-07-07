package com.example.articlerecycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class AuthorHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private ImageView image;
    private TextView book;
    private ImageView book1;
    private ImageView book2;
    private AuthorName authorName;
    private ConstraintLayout constraintLayout;



    public AuthorHolder( View itemView,AuthorName authorName) {
        super(itemView);
        this.authorName=authorName;
        initView(itemView,authorName);
    }

    private void initView(View itemView,AuthorName authorName) {
        name=itemView.findViewById(R.id.authorname);
        image=itemView.findViewById(R.id.authorimage);
        book=itemView.findViewById(R.id.authorbook);
        book1=itemView.findViewById(R.id.book1);
        book2=itemView.findViewById(R.id.book2);
        constraintLayout=itemView.findViewById(R.id.constraint);
    }

    public void setData(Author author){
        name.setText(author.getAuthor_name());
        image.setImageResource(author.getImage());
        book.setText(author.getBooks_name());
        book1.setImageResource(author.getBook1_image());
        book2.setImageResource(author.getBook2_image());
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authorName.onAuthorName(author);

            }
        });

    }
}
