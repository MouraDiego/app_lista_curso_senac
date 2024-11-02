package com.diego.appvistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Diego");
        pessoa.setSobreNome("Augusto Araujo Moura");
        pessoa.setNomeCurso("Desenvolvimento de Sistemas");
        pessoa.setTelefoneContato("34-99157-9741");

    }

}