package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int points = 0;
    private Button buttonClickerButton;
    private TextView scoreDisplayTextView;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //used as a constructor/initializer for instance variables

        //wiring widgets links xml and Java
        buttonClickerButton = findViewById(R.id.button_main_clicker);
        scoreDisplayTextView = findViewById(R.id.textview_main_pointdisplay);
        constraintLayout = findViewById(R.id.constraint_layout_main);

    }


    public void onClickerClicked(View view) {
        Toast.makeText(this, "Click.", Toast.LENGTH_SHORT).show();
        points++;
        scoreDisplayTextView.setText("Points: " + points);
        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        int color = Color.rgb(r, g, b);
        constraintLayout.setBackgroundColor(color);
        scoreDisplayTextView.setTextColor(Color.rgb(255-r, 255- g, 255- b));
    }
}
