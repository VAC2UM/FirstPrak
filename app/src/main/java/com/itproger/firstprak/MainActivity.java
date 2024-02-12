package com.itproger.firstprak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button button;
    private TextView textView;
    public final static String EXTRA_MESSAGE = "com.itproger.firstprak.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView =(EditText) findViewById(R.id.edit_message);
//        button = (Button) findViewById(R.id.button);
//
//        button.setOnClickListener(this::onClick);
    }

    public void sendMessage(View v){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

//    @Override
//    public void onClick(View view) {
//        if(view.getId() == R.id.button) {
//            textView.setText("Нажата кнопка");
//        }
//    }
}