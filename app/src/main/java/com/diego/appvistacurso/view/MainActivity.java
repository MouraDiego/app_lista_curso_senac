package com.diego.appvistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.diego.appvistacurso.R;
import com.diego.appvistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String priPessoa;
    String segPessoa;

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

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Diego");
        pessoa.setSobreNome("Augusto Araujo Moura");
        pessoa.setNomeCurso("Desenvolvimento de Sistemas");
        pessoa.setTelefoneContato("34-99157-9741");

        outraPessoa.setPrimeiroNome("Tiago");
        outraPessoa.setSobreNome("Henrique de Araujo Moura");
        outraPessoa.setNomeCurso("Educação Fisica");
        outraPessoa.setTelefoneContato("34-99157-9637");

        edit_primeiro_nome = findViewById(R.id.edit_primeiro_nome);
        edit_sobrenome = findViewById(R.id.edit_sobrenome);
        edit_curso_desejado = findViewById(R.id.edit_curso_desejado);
        edit_telefone_contato = findViewById(R.id.edit_telefone_contato);

        edit_primeiro_nome.setText(pessoa.getPrimeiroNome());
        edit_sobrenome.setText(pessoa.getSobreNome());
        edit_curso_desejado.setText(pessoa.getNomeCurso());
        edit_telefone_contato.setText(pessoa.getTelefoneContato());

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_finalizar = findViewById(R.id.btn_finalizar);
        btn_salvar = findViewById(R.id.btn_salvar);

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit_primeiro_nome.setText(" ");
                edit_sobrenome.setText(" ");
                edit_curso_desejado.setText(" ");
                edit_telefone_contato.setText(" ");
            }
        });

        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(edit_primeiro_nome.getText().toString());
                pessoa.setSobreNome(edit_sobrenome.getText().toString());
                pessoa.setNomeCurso(edit_curso_desejado.getText().toString());
                pessoa.setTelefoneContato(edit_telefone_contato.getText().toString());

                Toast.makeText(MainActivity.this, "Dados Salvos" + pessoa.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}