package com.example.bishalquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"1. Our nearest Galaxy is Andromeda ?","2. Does Jupiter is the smallest planet in our solar system ?",
    "3. Did India completed its Mangalyan Mission in 1st attempt ?","4. does time travelling is Possible in Future?","5. Does Kalpana Chawla was from West Bengal ?",
            "6. Black hole is a hole in black colour ?","7. Water in moon was discoverd by India?","8. 2nd most habitable planet could be mars?"};

    private boolean[] answers={true,false,true,false,false,false,true,true};

    int score = 0;
    Button yes;
    Button no;
    TextView textView;

    private int index= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView = findViewById(R.id.textView);
        textView.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length - 1) {
                    // If you have given correct answer
                    if(answers[index]){
                        score++;

                    }
                    // Go to the next question
                    index++;
                    if (index <= questions.length -1) {
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index <= questions.length - 1) {
                    // If you have given correct answer
                    if(!answers[index]){
                        score++;

                    }
                    // Go to the next question
                    index++;
                    if (index <= questions.length -1) {
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}