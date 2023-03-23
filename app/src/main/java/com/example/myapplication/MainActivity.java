package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView player1,player2;

    Button bt_reset,bt_resetscore;

    Button bt_00,bt_01,bt_02,bt_10,bt_11,bt_12,bt_20,bt_21,bt_22;

    int scorePL1=0;
    int scorePL2=0;

    boolean PL1turn=true;
    boolean PL2turn=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_00=findViewById(R.id.button13);
        bt_01=findViewById(R.id.button14);
        bt_02=findViewById(R.id.button15);
        bt_10=findViewById(R.id.button16);
        bt_11=findViewById(R.id.button18);
        bt_12=findViewById(R.id.button19);
        bt_20=findViewById(R.id.button17);
        bt_21=findViewById(R.id.button20);
        bt_22=findViewById(R.id.button21);

        bt_reset=findViewById(R.id.buttonreset);
        bt_resetscore=findViewById(R.id.button24);

        player1=findViewById(R.id.textView2);
        player2=findViewById(R.id.textView3);

        bt_00.setOnClickListener(this);
        bt_01.setOnClickListener(this);
        bt_02.setOnClickListener(this);
        bt_10.setOnClickListener(this);
        bt_11.setOnClickListener(this);
        bt_12.setOnClickListener(this);
        bt_20.setOnClickListener(this);
        bt_21.setOnClickListener(this);
        bt_22.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.button13:

                break;
        }

    }
}