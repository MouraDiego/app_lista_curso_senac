package com.diego.appvistacurso.controller;

import android.util.Log;

import com.diego.appvistacurso.model.Pessoa;

public class PessoaController {

    @Override
    public String toString() {

        Log.d("MVC_CONTROLLER", "CONTROLLER INICIADA");

        return "PessoaController{}";
    }


    public void salvar(Pessoa pessoa) {

        Log.d("MVC_CONTROLLER", "SALVAR DADOS: " + pessoa.toString());

    }
}
