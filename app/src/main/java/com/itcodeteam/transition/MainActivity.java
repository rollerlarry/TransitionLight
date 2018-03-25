package com.itcodeteam.transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    boolean turn;
    TransitionDrawable transitiondrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tvTransition);
        btn = findViewById(R.id.btnTurn);
        transitiondrawable = (TransitionDrawable) tv.getBackground();
    }
    public void Start(View view){
        //transitiondrawable.startTransition(3000);
        transitiondrawable.reverseTransition(2000);
            btn.setText("Turn Off");
    }
}
