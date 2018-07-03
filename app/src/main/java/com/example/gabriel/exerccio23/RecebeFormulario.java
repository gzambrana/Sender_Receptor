package com.example.gabriel.exerccio23;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecebeFormulario extends Activity {

    TextView nomeTexto;
    TextView sobrenomeTexto;
    TextView idadeTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_formulario);

        nomeTexto = (TextView) findViewById(R.id.nomeTexto);
        String first = getIntent().getStringExtra("Nome");
        nomeTexto.setText(first);

        sobrenomeTexto = (TextView) findViewById(R.id.sobrenomeTexto);
        String last = getIntent().getStringExtra("Sobrenome");
        sobrenomeTexto.setText(last);

        idadeTexto = (TextView) findViewById(R.id.idadeTexto);
        String age = getIntent().getStringExtra("Idade");
        idadeTexto.setText(age);
    }

}


