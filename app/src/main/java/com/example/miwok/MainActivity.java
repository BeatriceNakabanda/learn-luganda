package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view that shows the numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        //set a click listener on numbers text view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open numbers activity
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //start the new activity
                startActivity(numbersIntent);
            }
        });

        //find the view that shows the colors category
        TextView colors = (TextView)findViewById(R.id.colors);
        //set a click listener on colors text view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open numbers activity
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //start the new activity
                startActivity(colorsIntent);
            }
        });

        //find the view that shows the family category
        TextView family = (TextView)findViewById(R.id.family);
        //set a click listener on colors text view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open numbers activity
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //start the new activity
                startActivity(familyIntent);
            }
        });

        //find the view that shows the colors category
        TextView phrases = (TextView)findViewById(R.id.phrases);
        //set a click listener on colors text view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create intent to open numbers activity
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //start the new activity
                startActivity(phrasesIntent);
            }
        });
    }
}
