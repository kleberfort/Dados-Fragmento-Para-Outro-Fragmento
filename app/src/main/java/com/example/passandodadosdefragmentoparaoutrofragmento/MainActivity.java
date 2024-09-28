package com.example.passandodadosdefragmentoparaoutrofragmento;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OneFragment.OnNomesListener {

    private OneFragment oneFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //getSupportFragmentManager().beginTransaction().add(R.id.mail_container, new OneFragment()).commit();

        // Carregar o Fragment A inicialmente
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.mail_container, new OneFragment())
                    .commit();
        }



    }

    // Implementação da interface que recebe a lista de nomes
    @Override
    public void onEnviarNomes(List<String> listaNomes) {
        // Criar uma instância do Fragment B
        TwoFragment twoFragment = new TwoFragment();

        // Trocar o Fragment A pelo Fragment B
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mail_container, twoFragment)
                .addToBackStack(null) // Permite voltar ao Fragment A com o botão de voltar
                .commit();

        // Passar a lista para o Fragment B
        twoFragment.atualizarListaNomes(listaNomes);
    }
}