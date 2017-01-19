package com.example.simplehan.helloandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView messageView;
    EditText inputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageView = (TextView)findViewById(R.id.text_message);
        inputView = (EditText)findViewById(R.id.edit_input);
        Button btn = (Button)findViewById(R.id.btn_send);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                messageView.setText(inputView.getText().toString());
            }
        });

        Button btn_toast = (Button)findViewById(R.id.btn_toast);
        Button btn_google = (Button)findViewById(R.id.btn_google);
        Button btn_tel = (Button)findViewById(R.id.btn_tel);

        btn_toast.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               Toast.makeText(MainActivity.this, "시작 버튼이 눌렸어요.", Toast.LENGTH_SHORT).show();
           }
        });

        btn_google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(myIntent);
            }
        });

        btn_tel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
                startActivity(myIntent);
            }
        });

        Button btn_next = (Button)findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "시작 버튼이 눌렸어요.", 1000).show();

                Intent myIntent = new Intent(MainActivity.this, MyActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
