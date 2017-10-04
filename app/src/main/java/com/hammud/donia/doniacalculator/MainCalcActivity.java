package com.hammud.donia.doniacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener
    {
        private TextView tvQuestionMark;
    private TextView tvResult;
    private EditText etNum1;
    private EditText etNum2;
    private EditText etResult1;
    private Button btnPlus,btnMinest,btnFe,btnAlaa,btnKowaa,btnUsawy,btnClear;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        etNum1=(EditText)findViewById(R.id.etNum1);
        etNum2=(EditText)findViewById(R.id.etNum2);
        etResult1=(EditText)findViewById(R.id.etResult1);
        tvQuestionMark=(TextView) findViewById(R.id.tvQuestionMark);
        tvResult=(TextView) findViewById(R.id.tvResult);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMinest=(Button)findViewById(R.id.btnMinest);
        btnFe=(Button)findViewById(R.id.btnFe);
        btnAlaa=(Button)findViewById(R.id.btnAlaa);
        btnKowaa=(Button)findViewById(R.id.btnKowaa);
        btnUsawy=(Button)findViewById(R.id.btnUsawy);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnPlus.setOnClickListener(this);
        btnMinest.setOnClickListener(this);
        btnFe.setOnClickListener(this);
        btnAlaa.setOnClickListener(this);
        btnKowaa.setOnClickListener(this);
        btnUsawy.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

        @Override
        public void onClick(View view)
        {
            String stnNum=
            if (view == btnAlaa) {


            }
            if (view == btnFe) {

            }
            if (view == btnClear) {

            }
            if (view == btnKowaa) {

            }
            if (view == btnPlus) {

            }
            if (view == btnMinest) {


            }
            if (view == btnUsawy) {

            }


        }

    }
