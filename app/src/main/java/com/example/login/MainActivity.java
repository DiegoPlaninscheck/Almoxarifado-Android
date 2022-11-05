package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView esqueciMinhaSenha;
    private TextView cadastro;
    private Button botaoEntrar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        esqueciMinhaSenha = findViewById(R.id.esqueciMinhaSenhaText);
        cadastro = findViewById(R.id.cadastroText);
        botaoEntrar = findViewById(R.id.botaoEntrar);

        esqueciMinhaSenha.setOnClickListener(v -> irRedefinicaoSenha());
        cadastro.setOnClickListener(v -> irCadastro());
        botaoEntrar.setOnClickListener(v -> irParaInicio());
    }

    private void irParaInicio() {
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
        finish();
    }

    private void irRedefinicaoSenha() {
        Intent intent = new Intent(this, RedefinicaoSenha.class);
        startActivity(intent);
        finish();
    }

    private void irCadastro() {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
        finish();
    }
}