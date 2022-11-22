package com.test.quadraticsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private TextView Ans1 ,Ans2 , Ans ;
    private EditText Const ,x1,x2;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit = findViewById(R.id.button);
        x2 = findViewById(R.id.editTextNumber);
        x1 = findViewById(R.id.editTextNumber3);
        Const = findViewById(R.id.editTextNumber2);
        Ans = findViewById(R.id.editText);
        Ans1= findViewById(R.id.TextViewAns1);
        Ans2 = findViewById(R.id.TextViewAns2);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String s = x2.getText().toString();
                float a = Float.parseFloat(s);
                s = x1.getText().toString();
                float b = Float.parseFloat(s);
                s = Const.getText().toString();
                float c = Float.parseFloat(s);
                // Ans.setText("A= "+a+" B= "+b+" C= "+c);
                float d;
                d = b * b - 4 * a * c;
                if (d > 0) {
                    Ans.setText("Distint Roots");
                    float ans1 = (float) ((-b + Math.sqrt(d) )/ (2 * a));
                    float ans2 = (float) ((-b - Math.sqrt(d) )/ (2 * a));
                    Ans1.setText(""+ans1);
                    Ans2.setText("" + ans2);
                } else if (d == 0.0) {
                    Ans.setText("Equal Roots");
                    float ans1 = (float) ((-b + Math.sqrt(d)) / (2 * a));
                    Ans1.setText("" + ans1);
                    Ans2.setText("" + ans1);
                } else {
                    Ans.setText("Imaginary roots");
                }
            }
        });
    }
}
