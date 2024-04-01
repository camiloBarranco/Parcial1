package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtUser,edtPassword;
    Button btnLogin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edtUser);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cajita = edtUser.getText().toString();
                String cajita2 =edtPassword.getText().toString();

                if (cajita.equals("") || cajita2.equals("")){
                    Toast.makeText(MainActivity.this,"Digite los campos vacios",Toast.LENGTH_LONG).show();
                }
                else if(cajita.equals("uac123") && cajita2.equals("12345678")){
                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this,"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show();
                    edtUser.setText("");
                    edtPassword.setText("");
                }

            }
        });

    }
}