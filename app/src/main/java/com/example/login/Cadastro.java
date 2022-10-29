package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Cadastro extends AppCompatActivity {

    private ImageView voltarIcon;
    private Button confirmarBotao;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        voltarIcon = findViewById(R.id.voltarIconCadastro);
        confirmarBotao = findViewById(R.id.confimarBotao);
    }

    public void confirmarCadastro(View view) {
        confirmarBotao.setOnClickListener(v -> irMainPage());
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