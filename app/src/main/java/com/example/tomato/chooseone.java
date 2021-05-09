package com.example.tomato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseone extends AppCompatActivity {
    Button chef,customer,deliveryperson;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseone);
        chef=findViewById(R.id.chef);
        customer=findViewById(R.id.customer);
        deliveryperson=findViewById(R.id.delivery);

        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Mail")){
                    Intent loginmail=new Intent(chooseone.this,cheflogin.class);
                    startActivity(loginmail);

                }
                if(type.equals("Phone")){
                    Intent loginphone=new Intent(chooseone.this,chefloginphone.class);
                    startActivity(loginphone);

                }
                if(type.equals("SignUp")){
                    Intent signup=new Intent(chooseone.this,chefregistration.class);
                    startActivity(signup);

                }

            }
        });
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Mail")){
                    Intent loginmailcust=new Intent(chooseone.this,login.class);
                    startActivity(loginmailcust);

                }
                if(type.equals("Phone")){
                    Intent loginphonecust=new Intent(chooseone.this,loginphone.class);
                    startActivity(loginphonecust);

                }
                if(type.equals("SignUp")){
                    Intent signupcust=new Intent(chooseone.this,registration.class);
                    startActivity(signupcust);

                }
            }
        });
        deliveryperson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(type.equals("Mail")){
                    Intent loginmaildelivery=new Intent(chooseone.this,deliverylogin.class);
                    startActivity(loginmaildelivery);

                }
                if(type.equals("Phone")){
                    Intent loginphonedelivery=new Intent(chooseone.this,deliveryloginphone.class);
                    startActivity(loginphonedelivery);

                }
                if(type.equals("SignUp")){
                    Intent signupdelivery=new Intent(chooseone.this,deliveryregistration.class);
                    startActivity(signupdelivery);

                }

            }
        });

    }
}