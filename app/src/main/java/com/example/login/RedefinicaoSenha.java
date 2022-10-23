package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
        confimarBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
            }
        });
    }

    public void voltar(View view) {
        voltarIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);
            }
        });
    }
}