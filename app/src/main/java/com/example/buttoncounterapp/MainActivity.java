package com.example.buttoncounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText userInput;
    private Button button;
    private int numTimesClicked = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        userInput = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        userInput.setText("");

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked += 1;
                String result = "The Button got tapped" + numTimesClicked + " time";

                if (numTimesClicked != 1) {

                    result += "s";

                }
                result += "\n";
                textView.append(result);
            }
        };

        button.setOnClickListener(ourOnClickListener);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}