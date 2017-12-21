package com.example.c4q.unit04assessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.unit04assessment.BookAdapter;
import com.example.c4q.unit04assessment.Constants;
import com.example.c4q.unit04assessment.POJO;
import com.example.c4q.unit04assessment.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class BottomFragment extends Fragment {
    private View rootView;
    private List<POJO> pojoList;


    public BottomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_bottom, container, false);

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = new JSONObject(Constants.Values);
            JSONArray books = jsonObject.getJSONArray("books");
            String abook;
            POJO pojo= new POJO();
            List<String> listOfBooks = new ArrayList<>();
            for (int i = 0; i < books.length(); i++) {
                abook = books.get(i).toString();
                listOfBooks.add(abook);
                pojo.setTitle((String) books.getJSONObject(i).getString("title"));
                pojo.setAuthor((String) books.getJSONObject(i).getString("author"));
                pojo.setYear((int) books.getJSONObject(i).getInt("year"));
                pojoList.add(pojo);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        RecyclerView bookRecyclerView= rootView.findViewById(R.id.bookrecyclerview);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        BookAdapter bookAdapter= new BookAdapter(pojoList);
        bookRecyclerView.setLayoutManager(linearLayoutManager);
        bookRecyclerView.setAdapter(bookAdapter);
        // Inflate the layout for this fragment
        return rootView;
    }

}
