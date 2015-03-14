package com.example.android.code.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoiseActivity extends Activity {

    private Button mPascalBtn;
    private Button mDelphiBtn;
    private Button mJavaBtn;
    private Button mHTMLBtn;
    private Button mCBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choise_act);
        mPascalBtn = (Button) findViewById(R.id.PascalBtn);
        mPascalBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(ChoiseActivity.this, PascalActivity.class);
                startActivity(i);
            }
        });
        mDelphiBtn = (Button) findViewById(R.id.DelphiBtn);
        mDelphiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(ChoiseActivity.this, DelphiActivity.class);
                startActivity(i);
            }
        });
        mJavaBtn = (Button) findViewById(R.id.JavaBtn);
        mJavaBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(ChoiseActivity.this, JavaActivity.class);
                startActivity(i);
            }
        });
        mHTMLBtn = (Button) findViewById(R.id.HTMLBtn);
        mHTMLBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(ChoiseActivity.this, HTMLActivity.class);
                startActivity(i);
            }
        });
        mCBtn = (Button) findViewById(R.id.CBtn);
        mCBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(ChoiseActivity.this, CActivity.class);
                startActivity(i);
            }
        });
    }
}
