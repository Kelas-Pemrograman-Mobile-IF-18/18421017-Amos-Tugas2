package com.amos.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNama, edtNPM, edtJekel, edtTelp;
    TextView txtHasil;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNPM = (EditText) findViewById(R.id.edtNPM);
        edtJekel = (EditText) findViewById(R.id.edtJekel);
        edtTelp = (EditText) findViewById(R.id.edtTelp);

        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHasil.setText(edtNama.getText() + "\n" + edtNPM.getText() + "\n" + edtJekel.getText() + "\n" + edtTelp.getText());
            }
        });

    }
}