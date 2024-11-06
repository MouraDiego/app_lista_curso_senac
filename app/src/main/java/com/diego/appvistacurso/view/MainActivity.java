package com.diego.appvistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String priPessoa;
    String segPessoa;

    EditText primeiroNome, sobroNome, curSo, teleContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Diego");
        pessoa.setSobreNome("Augusto Araujo Moura");
        pessoa.setNomeCurso("Desenvolvimento de Sistemas");
        pessoa.setTelefoneContato("34-99157-9741");

/*
        outraPessoa = new Pessoa();

        outraPessoa.setPrimeiroNome("Tiago");
        outraPessoa.setSobreNome("Henrique de Araujo Moura");
        outraPessoa.setNomeCurso("Educação Fisica");
        outraPessoa.setTelefoneContato("34-99157-9637");
*/

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

/*        //Criado log para capturar informações
        Log.i("Informações Pessoais", pessoa.toString());
        Log.i("Informa Pessoais", outraPessoa.toString());
*/
        primeiroNome = findViewById(R.id.edit_primeiro_nome);
        sobroNome = findViewById(R.id.edit_sobrenome);
        curSo = findViewById(R.id.edit_curso_desejado);
        teleContato = findViewById(R.id.edit_telefone_contato);

        primeiroNome.setText(pessoa.getPrimeiroNome());
        sobroNome.setText(pessoa.getSobreNome());
        curSo.setText(pessoa.getNomeCurso());
        teleContato.setText(pessoa.getTelefoneContato());

        Button limpar = findViewById(R.id.btn_limpar);
        limpar.setOnClickListener(view -> limparResultado());

        Button finalizar = findViewById(R.id.btn_finalizar);
        finalizar.setOnClickListener(view -> finish());

    }

    private void limparResultado() {
        primeiroNome.setText(" ");
        sobroNome.setText(" ");
        curSo.setText(" ");
        teleContato.setText(" ");
    }

}