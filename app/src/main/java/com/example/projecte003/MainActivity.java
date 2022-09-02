
package com.example.projecte003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private RadioButton rb1, rb2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);

        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);

        tv1=findViewById(R.id.tv1);
    }

    public void calcular(View V){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        int resultat = 0;

        if(rb1.isChecked()){
            resultat = n1 + n2;

        }else if (rb2.isChecked()){
            if (n1>n2){
                resultat = n1 - n2;
            }else{
                resultat = n2 - n1;
            }
        }

        tv1.setText("Resultat: " + resultat);
    }
}