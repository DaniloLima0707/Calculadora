package com.example.hellomundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double num1, num2, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_ADIÇÃO=(Button)findViewById(R.id.btn_ADIÇÃO);
        Button btn_SUBTRAÇÃO=(Button)findViewById(R.id.btn_SUBTRAÇÃO);
        Button btn_MULTIPLICAÇÃO=(Button)findViewById(R.id.btn_MULTIPLICAÇÃO);
        Button btn_DIVISÃO=(Button)findViewById(R.id.btn_DIVISÃO);

        TextView text_View_Resultado=(TextView)findViewById(R.id.text_View_Resultado);
        EditText edit_Text_Valor1=(EditText) findViewById(R.id.edit_Text_Valor1);
        EditText edit_Text_Valor2=(EditText) findViewById(R.id.edit_Text_Valor2);

        btn_ADIÇÃO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(edit_Text_Valor1.getText().toString());
                num2=Double.parseDouble(edit_Text_Valor2.getText().toString());
                res=num1+num2;
                text_View_Resultado.setText(String.valueOf(res));
            }
        });
        btn_SUBTRAÇÃO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(edit_Text_Valor1.getText().toString());
                num2=Double.parseDouble(edit_Text_Valor2.getText().toString());
                res=num1-num2;
                text_View_Resultado.setText(String.valueOf(res));
            }
        });
        btn_MULTIPLICAÇÃO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(edit_Text_Valor1.getText().toString());
                num2=Double.parseDouble(edit_Text_Valor2.getText().toString());
                res=num1*num2;
                text_View_Resultado.setText(String.valueOf(res));
            }
        });
        btn_DIVISÃO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Double.parseDouble(edit_Text_Valor1.getText().toString());
                num2=Double.parseDouble(edit_Text_Valor2.getText().toString());
                res=num1/num2;
                text_View_Resultado.setText(String.valueOf(res));
            }
        });

    }
}