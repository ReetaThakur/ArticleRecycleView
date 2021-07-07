package com.example.articlerecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AuthorName {
    private ArrayList<Author> list=new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        builDataForAuthor();
        setDataForAdapter();
    }


    private void builDataForAuthor(){
        list.add(new Author("Author Dale Carnegi",R.drawable.dale2,"Books Written by Author",R.drawable.winfriends,R.drawable.publicspeaking));
        list.add(new Author("Author Napolen Hill",R.drawable.nepolian,"Books Written by Author",R.drawable.winfriends,R.drawable.think));
        list.add(new Author("Author Chales Duhhig",R.drawable.charlse,"Books Written by Author",R.drawable.power,R.drawable.minihabit));
        list.add(new Author("Author Dale Carnegi",R.drawable.dale2,"Books Written by Author",R.drawable.winfriends,R.drawable.publicspeaking));
        list.add(new Author("Author Napolen Hill",R.drawable.nepolian,"Books Written by Author",R.drawable.winfriends,R.drawable.think));
        list.add(new Author("Author Chales Duhhig",R.drawable.charlse,"Books Written by Author",R.drawable.power,R.drawable.minihabit));


    }
    private void setDataForAdapter(){
        AuthorAdapter adapter=new AuthorAdapter(list,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);



    }


    @Override
    public void onAuthorName(Author author) {
        Toast.makeText(MainActivity.this,author.getAuthor_name(),Toast.LENGTH_LONG).show();
    }
}