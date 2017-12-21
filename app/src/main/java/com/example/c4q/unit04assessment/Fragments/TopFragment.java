package com.example.c4q.unit04assessment.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.unit04assessment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {
    private View rootView;
    private TextView title;
    private TextView author;
    private TextView year;


    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_top, container, false);
        Bundle bundle=getArguments();
        title=(TextView) rootView.findViewById(R.id.title1);
        author=(TextView) rootView.findViewById(R.id.author1);
        year=(TextView) rootView.findViewById(R.id.year1);
        title.setText(bundle.getString("title"));
        author.setText(bundle.getString("author"));
        year.setText(bundle.getString("year"));
        // Inflate the layout for this fragment
        return rootView;
    }

}
