package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText textNome;
    Button buttonAdd;
    ListView listView;
    ArrayList<String> pessoas = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNome = (EditText)findViewById(R.id.txtNome);
        buttonAdd = (Button)findViewById(R.id.btnAdd);

        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pessoas);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
    }

    public void addPessoas(View view){
        if(textNome.getText().toString().length()>0){
            pessoas.add(textNome.getText().toString());
            arrayAdapter.notifyDataSetChanged();
        }
    }

}
