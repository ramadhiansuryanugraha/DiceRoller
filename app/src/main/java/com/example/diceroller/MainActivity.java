package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    static class Dice {
        int roll() {
            Random rand = new Random();
            int res = rand.nextInt(6);
            return res+1;
        }
    }

    void rollDice() {
        Dice dice = new Dice();
        int diceRoll = dice.roll();
        ImageView diceImage = findViewById(R.id.imageView);
        if (diceRoll == 1){
            diceImage.setImageResource(R.drawable.dice_1);
        }
        else if (diceRoll == 2){
            diceImage.setImageResource(R.drawable.dice_2);
        }
        else if (diceRoll == 3){
            diceImage.setImageResource(R.drawable.dice_3);
        }
        else if (diceRoll == 4){
            diceImage.setImageResource(R.drawable.dice_4);
        }
        else if (diceRoll == 5){
            diceImage.setImageResource(R.drawable.dice_5);
        }
        else {
            diceImage.setImageResource(R.drawable.dice_6);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(view -> rollDice());

    }
}