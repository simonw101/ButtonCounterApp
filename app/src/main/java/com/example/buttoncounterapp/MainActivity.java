package com.example.buttoncounterapp;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText userInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        userInput = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        userInput.setText("");

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();

                result = result + "\n";

                textView.append(result);

            }
        };

        button.setOnClickListener(ourOnClickListener);

        textView.setMovementMethod(new ScrollingMovementMethod());
    }
}