package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Inicio extends AppCompatActivity {

    private ArrayList<Listagem> list;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        recyclerView = findViewById(R.id.recyclerView);
        list = new ArrayList<>();

        setListagemInfo();
        setAdapter();
    }

    private void setAdapter() {
        recyclerAdapter adapter = new recyclerAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setListagemInfo() {
        list.add(new Listagem("Diego"));
        list.add(new Listagem("Leonardo Rafaelli"));
        list.add(new Listagem("João"));
        list.add(new Listagem("Camilly fofa do TI"));
        list.add(new Listagem("Thiago"));
        list.add(new Listagem("Douglas"));
        list.add(new Listagem("Jean"));
        list.add(new Listagem("Kenzo"));
        list.add(new Listagem("Felipe"));
        list.add(new Listagem("Otavio agusto"));
        list.add(new Listagem("Otavio neves"));
        list.add(new Listagem("Camilly vitoria"));
        list.add(new Listagem("Matheus"));
        list.add(new Listagem("Ester"));
        list.add(new Listagem("Eduarda"));
        list.add(new Listagem("Leonardo Poglia"));
        list.add(new Listagem("Vytor"));
        list.add(new Listagem("Vinicius Bonatti"));
        list.add(new Listagem("Gustavo"));
    }
}