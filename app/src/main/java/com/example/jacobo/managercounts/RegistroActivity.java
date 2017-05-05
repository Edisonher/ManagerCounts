package com.example.jacobo.managercounts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroActivity extends AppCompatActivity {


    EditText eRUsuario, eRClave1, eRClave2, eRCorreo;
    Button bRAceptar, bRCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        bRAceptar = (Button) findViewById(R.id.bRAceptar);
        bRCancelar = (Button) findViewById(R.id.bRCancelar);
    }

    public void click(View v) {
        Intent i = new Intent();
        switch (v.getId()) {

            case R.id.bRAceptar:
                setResult(RESULT_OK, i);
                finish();
                break;
            case R.id.bRCancelar:
                setResult(RESULT_CANCELED, i);
                finish();
                break;
        }
    }
}
