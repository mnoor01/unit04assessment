package com.example.c4q.unit04assessment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c4q.unit04assessment.Fragments.TopFragment;

/**
 * Created by c4q on 12/20/17.
 */

public class BookViewHolder extends RecyclerView.ViewHolder{
    private TextView title;
    private TextView author;
    private TextView year;

    public BookViewHolder(View itemView) {
        super(itemView);
         title= itemView.findViewById(R.id.booktitle);
         author= itemView.findViewById(R.id.author);
         year= itemView.findViewById(R.id.year);
    }
    public void onBind(POJO pojo){
        title.setText(pojo.getTitle());
        author.setText(pojo.getAuthor());
        year.setText(pojo.getYear());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopFragment topFragment= new TopFragment();
                FragmentManager fragmentManager=topFragment.getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Bundle bundle= new Bundle();
                bundle.putString("title",title.getText().toString());
                bundle.putString("author",author.getText().toString());
                bundle.putString("year",year.getText().toString());
                topFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container,topFragment);
                fragmentTransaction.commit();
            }
        });

    }
}
