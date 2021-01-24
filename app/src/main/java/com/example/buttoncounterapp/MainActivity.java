package com.example.buttoncounterapp;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TextView textView;
    private EditText userInput;

    private final String TEXT_CONTENTS = "TextContents";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        userInput = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        userInput.setText("");
        textView.setText("");

        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();

                result = result + "\n";

                textView.append(result);

                userInput.setText("");

            }
        };

        button.setOnClickListener(ourOnClickListener);

        textView.setMovementMethod(new ScrollingMovementMethod());

        Log.d(TAG, "onCreate: finished");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: Called");
        super.onDestroy();

        Log.d(TAG, "onDestroy: finished");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: Called");
        super.onStop();

        Log.d(TAG, "onStop: finished");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: Called");
        super.onRestart();

        Log.d(TAG, "onRestart: finished");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: Called");
        super.onRestoreInstanceState(savedInstanceState);
        String saveData = savedInstanceState.getString(TEXT_CONTENTS);
        textView.setText(saveData);
        Log.d(TAG, "onRestoreInstanceState: finished");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: Called");
        outState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(outState);

        Log.d(TAG, "onSaveInstanceState: finished");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: Called");
        super.onPause();

        Log.d(TAG, "onPause: finished");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: Called");
        super.onResume();
        Log.d(TAG, "onResume: finished");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: Called");
        super.onStart();
        Log.d(TAG, "onStart: finished");
    }
}