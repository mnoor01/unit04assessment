package com.example.c4q.unit04assessment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

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

    }
}
