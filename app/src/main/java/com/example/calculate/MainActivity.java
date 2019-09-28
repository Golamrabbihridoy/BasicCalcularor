package com.example.calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button Button0,button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonEqual,buttonDot,buttonC;

    TextView text1,result;
    Double oparant1,oparant2,temp=Double.NaN;

    boolean activeadd,activesub,activemul,activediv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDivision = (Button) findViewById(R.id.buttonDiv);
        buttonEqual = (Button) findViewById(R.id.buttonEqueal);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonC = (Button) findViewById(R.id.buttonC);
        text1=(TextView) findViewById(R.id.MainText);
        result=(TextView) findViewById(R.id.result);

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + "9");
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(text1.getText() + ".");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
              @Override
             public void onClick(View v) {
               text1.setText("");
               result.setText("");
               temp=Double.NaN;
               activemul=false;
               activediv=false;
               activeadd=false;
               activesub=false;
             }
            });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal();
                result.setText(temp+"+");
                text1.setText(null);
                activeadd=true;

            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cal();
                result.setText(temp+"-");
                text1.setText(null);
                activesub=true;

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cal();
                result.setText(temp+"*");
                text1.setText(null);
                activemul=true;
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cal();
                result.setText(temp+"/");
                text1.setText(null);
                activediv=true;

            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal();
                result.setText(result.getText().toString()+oparant1 + " ="+ temp );

                temp=Double.NaN;
                activemul=false;
                activediv=false;
                activeadd=false;
                activesub=false;

            }
        });




    }
    public void cal(){
        if(!Double.isNaN(temp)){
            oparant1 = Double.parseDouble(text1.getText().toString());
            text1.setText(null);

            if (activeadd == true) {
                 temp=this.temp+oparant1;
                 activeadd=false;
            }
            else if (activesub == true) {
                temp=this.temp-oparant1;
                activesub=false;
            }

            else if (activemul == true) {
                temp=this.temp*oparant1;
                activemul=false;
            }
            else if (activediv == true) {
                temp=this.temp/oparant1;
                activediv=false;
            }
        }
        else {
            try{
                temp=Double.parseDouble(text1.getText() + "");
            }
            catch (Exception e){}
        }


    }
}
