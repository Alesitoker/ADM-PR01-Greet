package com.iessaladillo.alejandro.adm_pr01_greet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName;
    private EditText txtSurname;
    private TextView lblGreet;
    private CheckBox chkPolite;

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
        chkPolite = findViewById(R.id.chkPolite);

        btnGreet.setOnClickListener(this);
        btnReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message;
        if (v.getId() == R.id.btnGreet) {
            if(chkPolite.isChecked()) {
                message = getString(R.string.main_activity_polite_greet);
            } else
                message = getString(R.string.main_activity_impolite_greet);
            lblGreet.setText(String.format(message, txtName.getText(), txtSurname.getText()));
        } else {
            lblGreet.setText(R.string.main_activity_reset);
            txtName.setText(R.string.main_activity_reset);
            txtSurname.setText(R.string.main_activity_reset);
            chkPolite.setChecked(false);

        }
    }
}
