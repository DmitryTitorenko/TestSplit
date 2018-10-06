package com.example.testsplit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show split lines.
     */
    public void split(View view) {
        EditText editTextSentence = findViewById(R.id.editTextSentence);
        TextView textViewResult = findViewById(R.id.textViewResult);

        String result = SplitSentence.split(editTextSentence.getText().toString());
        textViewResult.setText(result);
    }
}
