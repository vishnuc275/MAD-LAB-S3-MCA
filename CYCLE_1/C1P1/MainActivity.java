package com.example.sjcet.pg1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button lgnbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.usr);
        password=findViewById(R.id.pwd);
        lgnbtn=findViewById(R.id.lgnbtn);
    }
    public void Click(View view) {
        String user = username.getText().toString();
    }
}