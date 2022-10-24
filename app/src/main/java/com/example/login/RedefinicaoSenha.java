package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RedefinicaoSenha extends AppCompatActivity {

    private Button confimarBotao;
    private ImageView voltarIcon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redefinicao_senha);
        confimarBotao = findViewById(R.id.confimarBotao);
        voltarIcon = findViewById(R.id.voltarIconRedefinicaoSenha);
    }

    public void confimarRedefinicaoSenha(View view) {
        confimarBotao.setOnClickListener(v -> irMainPage());
    }

    private void irMainPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void voltar(View view) {
        voltarIcon.setOnClickListener(v -> irMainPage());
    }
}