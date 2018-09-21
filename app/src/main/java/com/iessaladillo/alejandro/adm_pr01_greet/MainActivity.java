package com.iessaladillo.alejandro.adm_pr01_greet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtSurname;
    private TextView lblGreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        txtName = findViewById(R.id.txtName);
        txtSurname = findViewById(R.id.txtSurname);
        Button btnGreet = findViewById(R.id.btnGreet);
        Button btnReset = findViewById(R.id.btnReset);
        lblGreet = findViewById(R.id.lblGreet);

        btnGreet.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGreet) {
            lblGreet.setText(R.string.main_activity_greet);
        } else {
            lblGreet.setText(R.string.main_activity_reset);
        }
    }
}
