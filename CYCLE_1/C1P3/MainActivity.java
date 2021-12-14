package com.example.sjcet.pg3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    EditText text1;
    TextView text2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(EditText)findViewById(R.id.text1);
        btn=(Button)findViewById(R.id.btn);
        text2=(TextView)findViewById(R.id.text2);
    }
    public void Click(View view) {
        String content= text1.getText().toString();
        text2.setText(content);
    }
}
