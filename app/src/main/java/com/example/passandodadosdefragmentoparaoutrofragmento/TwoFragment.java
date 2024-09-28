package com.example.passandodadosdefragmentoparaoutrofragmento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class TwoFragment extends Fragment implements OneFragment.OnNomesListener {

    TextView textView;

    private List<String> listaNomes;

    public TwoFragment() {
        // Required empty public constructor
    }


    public void atualizarListaNomes(List<String> nomes) {
        this.listaNomes = nomes;
        // Aqui você pode atualizar a UI ou fazer o que for necessário com a lista recebida
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_two, container, false);



//        textView = v.findViewById(R.id.TV);
//        Bundle bundle = this.getArguments();
//
//        String data = bundle.getString("key");
//        textView.setText(data);



        return v;
    }

    @Override
    public void onEnviarNomes(List<String> listaNomes) {

        // Recebe a lista e faz algo com ela
        for (String nome : listaNomes) {
            Log.d("MainActivity", "Nome recebido: " + nome);
        }

    }
}