package com.example.atikfinalpro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText etn1a;
    Button add;
    RadioGroup rga1;
    RadioButton raa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        etn1a = findViewById(R.id.etname1);
        add = findViewById(R.id.btna1);
        rga1 = findViewById(R.id.radioShifts);
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String nameA = etn1a.getText().toString().trim();
                String radioA = raa1.getText().toString().trim();
                Intent intent = new Intent(HomeActivity.this,NextA1.class);
                intent.putExtra("keyNameA",nameA);
                intent.putExtra("keyRadioA",radioA);
                startActivity(intent);

            }
        });


    }

    public void checkButton(View view) {
        int radioId = rga1.getCheckedRadioButtonId();

        raa1 = findViewById(radioId);

        Toast.makeText(this,"Selected: "+raa1.getText(), Toast.LENGTH_SHORT).show();

    }

}