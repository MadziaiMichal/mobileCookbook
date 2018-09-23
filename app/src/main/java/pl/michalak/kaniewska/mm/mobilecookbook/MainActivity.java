package pl.michalak.kaniewska.mm.mobilecookbook;

import android.app.Notification;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonBreakfast;
    Button buttonDinner;
    Button buttonSupper;
    Button buttonDessert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBreakfast= findViewById(R.id.button);
        buttonBreakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MealsList.class);
                startActivity(i);
            }
        });

        buttonDinner= findViewById(R.id.button2);
        buttonDinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MealsList.class);
                startActivity(i);
            }
        });

        buttonSupper= findViewById(R.id.button3);
        buttonSupper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MealsList.class);
                startActivity(i);
            }
        });

        buttonDessert= findViewById(R.id.button4);
        buttonDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, MealsList.class);
                startActivity(i);
            }
        });
    }
}