package com.diego.appvistacurso.controller;

import android.util.Log;

import com.diego.appvistacurso.model.Pessoa;

public class PessoaController {

    private String edit_primeiro_nome;
    private String edit_sobrenome;
    private String curso;
    private Integer telefone;



    @Override
    public String toString() {

        Log.d("MVC_CONTROLLER", "CONTROLLER INICIADA");

        return "PessoaController{}";
    }


    public void salvar(Pessoa pessoa) {

        Log.d("MVC_CONTROLLER", "SALVAR DADOS: " + pessoa.toString());

    }
}
