package com.example.navneet.endsem01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}






/*
    private RadioButton r, b, w, o;
    private RadioGroup radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textr);
        radio = (RadioGroup) findViewById(R.id.rg);
        r = (RadioButton)findViewById(R.id.red);
        o = (RadioButton)findViewById(R.id.ornage);
        w = (RadioButton)findViewById(R.id.white);
        b = (RadioButton)findViewById(R.id.blue);
        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(r.isChecked())
                    text.setBackgroundColor(Color.RED);
                if(o.isChecked())
                    text.setBackgroundColor(Color.YELLOW);
                if(w.isChecked())
                    text.setBackgroundColor(Color.WHITE);
                if(b.isChecked())
                    text.setBackgroundColor(Color.BLUE);

            }
        });

    }
 */