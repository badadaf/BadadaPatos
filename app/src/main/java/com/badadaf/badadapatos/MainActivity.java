package com.badadaf.badadapatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClickMe = (Button) findViewById(R.id.btnClickMe);
        final ImageView duckView = (ImageView) findViewById(R.id.quackImageView);
        final TextView noDucks = (TextView) findViewById(R.id.noDucksForYou);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hasPermission()){
                    noDucks.setVisibility(View.INVISIBLE);
                    duckView.setVisibility(View.VISIBLE);
                }
                else{
                    noDucks.setVisibility(View.VISIBLE);
                    duckView.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    protected boolean hasPermission(){
        return false;
    }
}