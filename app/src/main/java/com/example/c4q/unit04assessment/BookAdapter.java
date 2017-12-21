package com.example.c4q.unit04assessment;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by c4q on 12/20/17.
 */

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private List<POJO> pojoList;

    public BookAdapter(List<POJO> pojoList) {
        this.pojoList = pojoList;
    }

    @Override
    public BookViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView= LayoutInflater.from(parent.getContext()).inflate(R.layout.books_itemview,parent,false);
        return new BookViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        holder.onBind(pojoList.get(position));

    }

    @Override
    public int getItemCount() {
        return pojoList.size();
    }
}
