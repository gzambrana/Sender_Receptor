package com.example.gabriel.exerccio23;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtSobrenome;
    EditText edtIdade;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtSobrenome = (EditText) findViewById(R.id.edtSobrenome);
        edtIdade = (EditText) findViewById(R.id.edtIdade);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecebeFormulario.class);
                intent.putExtra("Nome", edtNome.getText().toString());
                intent.putExtra("Sobrenome", edtSobrenome.getText().toString());
                intent.putExtra("Idade", edtIdade.getText().toString());
                startActivity(intent);
            }
        });
    }
}
