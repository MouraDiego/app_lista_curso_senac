package com.diego.appvistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String priPessoa;
    String segPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Diego");
        pessoa.setSobreNome("Augusto Araujo Moura");
        pessoa.setNomeCurso("Desenvolvimento de Sistemas");
        pessoa.setTelefoneContato("34-99157-9741");

        outraPessoa = new Pessoa();

        outraPessoa.setPrimeiroNome("Tiago");
        outraPessoa.setSobreNome("Henrique de Araujo Moura");
        outraPessoa.setNomeCurso("Educação Fisica");
        outraPessoa.setTelefoneContato("34-99157-9637");

/* Get usado para pegar as informações do set
        priPessoa = "Nome: " + pessoa.getPrimeiroNome() + "\nSobrenome: " +
                pessoa.getSobreNome() + "\nCurso: " +
                pessoa.getNomeCurso() + "\nTelefone: " +
                pessoa.getTelefoneContato();

        segPessoa = "Nome: " + outraPessoa.getPrimeiroNome() + "\nSobrenome: " +
                outraPessoa.getSobreNome() + "\nCurso: " +
                outraPessoa.getNomeCurso() + "\nTelefone: " +
                outraPessoa.getTelefoneContato();

*/
        //Criado log para capturar informações
        Log.i("Informações Pessoais", pessoa.toString());
        Log.i("Informa Pessoais", outraPessoa.toString());

        int parar = 0;

    }

}