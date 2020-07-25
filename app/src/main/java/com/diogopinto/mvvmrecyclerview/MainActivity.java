package com.diogopinto.mvvmrecyclerview;

import android.os.Bundle;

import com.diogopinto.mvvmrecyclerview.adapters.RecyclerAdapter;
import com.diogopinto.mvvmrecyclerview.models.NicePlace;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecyclerAdapter recyclerAdapter;
    private ArrayList<NicePlace> nicePlaces = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        Inicializando componentes de layout
        inicializarComponentes();

//        Add items on arraylist
        addItemsOnList();

//        Inicializa os componentes e dependencias de para abrir os itens da recyclerView
        initializeRecyclerView();



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initializeRecyclerView() {

        recyclerAdapter = new RecyclerAdapter(nicePlaces, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setHasFixedSize(true);

    }

    private void addItemsOnList(){
        NicePlace nicePlace = new NicePlace();

        nicePlace.setImageUrl("https://i.ytimg.com/vi/KFj8EOktfwA/hqdefault.jpg");
        nicePlace.setTitle("Imagem teste");
        nicePlaces.add(nicePlace);

        nicePlace.setImageUrl("https://http2.mlstatic.com/quadro-decorativo-natureza-paisagem-natural-salas-decorar-06-D_NQ_NP_700305-MLB29130115553_012019-F.jpg");
        nicePlace.setTitle("Segunda Imagem teste");
        nicePlaces.add(nicePlace);
    }


    private void inicializarComponentes() {
        recyclerView = findViewById(R.id.recyclerViewNicePlaces);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
