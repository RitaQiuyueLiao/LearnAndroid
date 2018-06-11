package com.qiuyueliao.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //变量声明
    EditText number1,number2;
    TextView Result;
    Button Add,Subtract,Multiply,Divide;

    int num1,num2;
    float resultNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //调用变量 与UI界面建立联系
        number1=(EditText)findViewById(R.id.number1);
        number2=(EditText)findViewById(R.id.number2);

        Result=(TextView)findViewById(R.id.Result);

        Add=(Button)findViewById(R.id.Add);
        Subtract=(Button)findViewById(R.id.Subtract);
        Multiply=(Button)findViewById(R.id.Multiply);
        Divide=(Button)findViewById(R.id.Divide);

        //创建按钮button与代码间的联系
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                resultNum = num1 + num2;
                Result.setText(String.valueOf(resultNum));
            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                resultNum = num1 - num2;
                Result.setText(String.valueOf(resultNum));
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                resultNum = num1 * num2;
                Result.setText(String.valueOf(resultNum));
            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(number1.getText().toString());
                num2 = Integer.parseInt(number2.getText().toString());

                resultNum = num1 / num2;
                Result.setText(String.valueOf(resultNum));
            }
        });
    }
}
