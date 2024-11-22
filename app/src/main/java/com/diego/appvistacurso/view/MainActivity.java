package com.diego.appvistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.controller.PessoaController;
import com.diego.appvistacurso.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;

    public static final String NONE_PREFERENCES = "pref listvip";
    PessoaController controller;
    Pessoa pessoa;
    EditText edit_primeiro_nome;
    EditText edit_sobrenome;
    EditText edit_curso_desejado;
    EditText edit_telefone_contato;
    Button btn_limpar;
    Button btn_finalizar;
    Button btn_salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences(NONE_PREFERENCES, 0);
        SharedPreferences.Editor listaVip;

        pessoa = new Pessoa();
        controller = new PessoaController();
        listaVip = preferences.edit();
        controller.iniciarPessoas(preferences, pessoa);

        controller.toString();

        edit_primeiro_nome = findViewById(R.id.edit_primeiro_nome);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_curso_desejado = findViewById(R.id.edit_curso_desejado);
        edit_telefone_contato = findViewById(R.id.edit_telefone_contato);

        edit_primeiro_nome.setText(pessoa.getPrimeiroNome());
        edit_sobrenome.setText(pessoa.getSobreNome());
        edit_curso_desejado.setText(pessoa.getNomeCurso());
        edit_telefone_contato.setText(pessoa.getTelefoneContato());

        List<EditText> editTexts = new ArrayList<>();
        editTexts.add(edit_primeiro_nome);
        editTexts.add(edit_sobrenome);
        editTexts.add(edit_curso_desejado);
        editTexts.add(edit_telefone_contato);

        controller.botoes(this, editTexts, listaVip, pessoa);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_finalizar = findViewById(R.id.btn_finalizar);
        btn_salvar = findViewById(R.id.btn_salvar);

    }

}