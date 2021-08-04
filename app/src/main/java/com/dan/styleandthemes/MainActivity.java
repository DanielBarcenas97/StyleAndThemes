package com.dan.styleandthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButtonMen;
    RadioButton radioButtonWoman;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filters);

        radioButtonMen = (RadioButton) findViewById(R.id.rb_men);
        radioButtonWoman = (RadioButton) findViewById(R.id.rb_women);
        textView = (TextView) findViewById(R.id.tv_search);

        textView.setText(R.string.rb_women);


        radioButtonMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButtonMen.setChecked(true);
                textView.setText(R.string.rb_men);
            }
        });


        radioButtonWoman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButtonWoman.setChecked(true);
                textView.setText(R.string.rb_women);
            }
        });


    }

}