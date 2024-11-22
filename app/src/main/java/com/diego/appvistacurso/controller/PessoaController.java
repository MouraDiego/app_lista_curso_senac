package com.diego.appvistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.model.Pessoa;
import com.diego.appvistacurso.view.MainActivity;

import java.util.List;


public class PessoaController {

    public void iniciarPessoas(SharedPreferences preferences, Pessoa pessoa) {
        pessoa.setPrimeiroNome(preferences.getString("Primeiro Nome: ", ""));
        pessoa.setSobreNome(preferences.getString("Sobrenome: ", ""));
        pessoa.setNomeCurso(preferences.getString("Curso: ", ""));
        pessoa.setTelefoneContato(preferences.getString("Telefone: ", ""));
    }

    public void salvarPessoas(SharedPreferences.Editor listaVip, Pessoa pessoa) {
        listaVip.putString("Primeiro Nome: ", pessoa.getPrimeiroNome());
        listaVip.putString("Sobrenome: ", pessoa.getSobreNome());
        listaVip.putString("Curso: ", pessoa.getNomeCurso());
        listaVip.putString("Telefone: ", pessoa.getTelefoneContato());
        listaVip.apply();
    }

    public void limPar(SharedPreferences.Editor listavip, List<EditText> editTexts) {
        for (EditText editText : editTexts) {
            editText.setText("");
        }
        listavip.clear();
        listavip.apply();
    }

    public void botoes(MainActivity mainActivity, List<EditText> editTexts,
                       SharedPreferences.Editor listaVip,
                       Pessoa pessoa) {

        Button btn_salvar = mainActivity.findViewById(R.id.btn_salvar);
        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editTexts.get(0).getText().toString());
                pessoa.setSobreNome(editTexts.get(1).getText().toString());
                pessoa.setNomeCurso(editTexts.get(2).getText().toString());
                pessoa.setTelefoneContato(editTexts.get(3).getText().toString());

                salvarPessoas(listaVip, pessoa);
            }
        });

        Button btn_limpar = mainActivity.findViewById(R.id.btn_limpar);
        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                limPar(listaVip, editTexts);
            }
        });

        Button btn_finalizar = mainActivity.findViewById(R.id.btn_finalizar);
        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.finish();
            }
        });
    }

    @Override
    public String toString() {

        Log.d("MVC_CONTROLLER", "CONTROLLER INICIADA");

        return "PessoaController{}";
    }


    public void salvar(Pessoa pessoa) {

        Log.d("MVC_CONTROLLER", "SALVAR DADOS: " + pessoa.toString());

    }

}


