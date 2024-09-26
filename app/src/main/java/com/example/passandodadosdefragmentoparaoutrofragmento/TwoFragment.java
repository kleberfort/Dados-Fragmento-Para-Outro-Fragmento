package com.example.passandodadosdefragmentoparaoutrofragmento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TwoFragment extends Fragment {

    TextView textView;

    public TwoFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_two, container, false);

        textView = v.findViewById(R.id.TV);
        Bundle bundle = this.getArguments();

        String data = bundle.getString("key");
        textView.setText(data);



        return v;
    }
}