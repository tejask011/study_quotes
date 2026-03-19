package com.tejas.studyquotes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView quoteText;
    Button newQuoteBtn;

    String[] quotes = {
            "Push yourself, because no one else will.",
            "Dream it. Wish it. Do it.",
            "Stay strong.",
            "Success takes effort.",
            "Never give up.",
            "Work hard in silence.",
            "Be better every day."
    };

    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteText = findViewById(R.id.quoteText);
        newQuoteBtn = findViewById(R.id.newQuoteBtn);

        setRandomQuote();

        newQuoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setRandomQuote();
            }
        });
    }

    private void setRandomQuote() {
        int index = random.nextInt(quotes.length);
        quoteText.setText(quotes[index]);
    }
}