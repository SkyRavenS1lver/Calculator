package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText display1;
    EditText display2;
    Button add;
    Button subs;
    Button times;
    Button div;
    String numb1,numb2;
    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display1 = findViewById(R.id.display1);
        display2 =  findViewById(R.id.display2);
        results = findViewById(R.id.result);
        add = findViewById(R.id.add);
        subs = findViewById(R.id.substract);
        times = findViewById(R.id.times);
        div = findViewById(R.id.divide);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = display1.getText().toString();
                numb2 = display2.getText().toString();
                if (numb1.equals("")){display1.setText("0"); numb1 = "0";}
                if (numb2.equals("")){display2.setText("0"); numb2 = "0";}
                try {
                    results.setText(added(Integer.parseInt(numb1),Integer.parseInt(numb2))+"");
                }
                catch (NumberFormatException e){
                    results.setText(added(Double.parseDouble(numb1),Double.parseDouble(numb2))+"");
                }
            }
        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = display1.getText().toString();
                numb2 = display2.getText().toString();
                if (numb1.equals("")){display1.setText("0"); numb1 = "0";}
                if (numb2.equals("")){display2.setText("0"); numb2 = "0";}
                try {
                    results.setText(subs(Integer.parseInt(numb1),Integer.parseInt(numb2))+"");
                }
                catch (NumberFormatException e){
                    results.setText(subs(Double.parseDouble(numb1),Double.parseDouble(numb2))+"");
                }
                }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = display1.getText().toString();
                numb2 = display2.getText().toString();
                if (numb1.equals("")){display1.setText("0"); numb1 = "0";}
                if (numb2.equals("")){display2.setText("0"); numb2 = "0";}
                try {
                    results.setText(times(Integer.parseInt(numb1),Integer.parseInt(numb2))+"");
                }
                catch (NumberFormatException e){
                    results.setText(times(Double.parseDouble(numb1),Double.parseDouble(numb2))+"");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numb1 = display1.getText().toString();
                numb2 = display2.getText().toString();
                if (numb1.equals("")){display1.setText("0"); numb1 = "0";}
                if (numb2.equals("")){display2.setText("0"); numb2 = "0";}
                results.setText(divide(Double.parseDouble(numb1),Double.parseDouble(numb2))+"");
            }
        });
    }
    public double added(double x, double y)
    {return x+y;}
    public int added(int x, int y)
    {return x+y;}
    public double subs(double x, double y)
    {return x-y;}
    public int subs(int x, int y)
    {return x-y;}
    public double times(double x, double y)
    {return x*y;}
    public int times(int x, int y)
    {return x*y;}
    public double divide(double x, double y)
    {return x/y;}

}