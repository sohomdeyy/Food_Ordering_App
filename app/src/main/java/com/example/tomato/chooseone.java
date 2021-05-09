package com.example.tomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseone extends AppCompatActivity {
    Button chef,customer,deliverperson;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseone);
        chef=findViewById(R.id.chef);
        customer=findViewById(R.id.customer);
        deliverperson=findViewById(R.id.delivery);

        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Mail")){
                    Intent loginmail=new Intent(chooseone.this,cheflogin.class);
                    startActivity(loginmail);

                }
                if(type.equals("Phone")){
                    Intent loginphone=new Intent(chooseone.this,cheflogin.class);
                    startActivity(loginphone);

                }
                if(type.equals("SignUp")){
                    Intent signup=new Intent(chooseone.this,cheflogin.class);
                    startActivity(signup);

                }

            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        deliverperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}