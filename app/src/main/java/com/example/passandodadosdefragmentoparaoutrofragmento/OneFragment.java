package com.example.passandodadosdefragmentoparaoutrofragmento;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends Fragment {

    EditText editText;
    Button button;

    private OnNomesListener listener;
    private List<String> listaNomes;

    public OneFragment() {
        // Required empty public constructor
    }


    public interface OnNomesListener {
        void onEnviarNomes(List<String> listaNomes);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // Verifica se a Activity implementa a interface
        if (context instanceof OnNomesListener) {
            listener = (OnNomesListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " deve implementar OnNomesListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_one, container, false);

        button = view.findViewById(R.id.BTN);
        editText = view.findViewById(R.id.ET);


        listaNomes = new ArrayList<>();
        listaNomes.add("kleber");
        listaNomes.add("vilene");
        listaNomes.add("yanna");
        listaNomes.add("nayane");


        // Aqui você pode chamar o método da interface para passar a lista
        if (listener != null) {
            listener.onEnviarNomes(listaNomes);
        }




        return view;
    }
}