package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button  u  =findViewById(R.id.button2);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(u);
            }
        });
       TextView  m =findViewById(R.id.name2);
       TextView J = findViewById(R.id.age2);
        Bundle L = getIntent().getExtras();
        String lol = L.getString("ll");
        String lo = L.getString("lll");
        m.setText(lol);
        J.setText(lo);
    }
}