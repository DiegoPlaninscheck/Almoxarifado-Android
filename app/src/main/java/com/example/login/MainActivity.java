package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView esqueciMinhaSenha;
    private TextView cadastro;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        esqueciMinhaSenha = findViewById(R.id.esqueciMinhaSenhaText);
        cadastro = findViewById(R.id.cadastroText);
    }

    public void redefinicaoSenha(View view) {
        esqueciMinhaSenha.setOnClickListener(v -> irRedefinicaoSenha());
    }

    private void irRedefinicaoSenha() {
        Intent intent = new Intent(this, RedefinicaoSenha.class);
        startActivity(intent);
        finish();
    }


    public void cadastro(View view) {
        cadastro.setOnClickListener(v -> irCadastro());
    }

    private void irCadastro() {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
        finish();
    }
}