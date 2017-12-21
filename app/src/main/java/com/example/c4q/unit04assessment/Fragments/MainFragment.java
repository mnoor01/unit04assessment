package com.example.c4q.unit04assessment.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.c4q.unit04assessment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    private Button mainButton;
    private View rootView;
    private EditText emain;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_main, container, false);
        mainButton=(Button) rootView.findViewById(R.id.mainButton);
        emain=(EditText) rootView.findViewById(R.id.emain);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayFragment displayFragment= new DisplayFragment();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                String editTextInfo= emain.getText().toString();
                Bundle bundle= new Bundle();
                bundle.putString("displayActivity",editTextInfo);
                fragmentTransaction.replace(R.id.main_container,displayFragment).addToBackStack("displayActivity");
            }
        });
        // Inflate the layout for this fragment
        return rootView ;
    }

}
