package com.tonnykratos.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        TextView txtuser = (TextView) findViewById(R.id.fname);
        TextView txtpass = (TextView) findViewById(R.id.password);
        TextView txtdod = (TextView) findViewById(R.id.dob);

        Button btnsign = (Button) findViewById(R.id.btnsign);

        btnsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtuser.getText().toString().equals("admin") && txtpass.getText().toString().equals("admin") && txtdod.getText().toString().equals("2000")){
                    Intent signintent = new Intent(SignUpActivity.this, HomeActivity.class);
                    startActivity(signintent);
                    Toast.makeText(SignUpActivity.this,"SignUp Successful",Toast.LENGTH_SHORT).show();
                }else{
                    if (txtuser.getText().toString().equals("") && txtpass.getText().toString().equals("") && txtdod.getText().toString().equals("")){
                        Toast.makeText(SignUpActivity.this,"SignUp failed",Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(SignUpActivity.this,"SignUp failed",Toast.LENGTH_SHORT).show();


                }
            }
        });
        TextView txtall = (TextView) findViewById(R.id.haveAccount);
        txtall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allintent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(allintent);
            }
        });

    }
}