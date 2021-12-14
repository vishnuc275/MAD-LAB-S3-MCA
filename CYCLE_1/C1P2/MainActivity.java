package com.example.sjcet.pg2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText txt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt= findViewById(R.id.txt);
        btn= findViewById(R.id.btn);
    }
    public void click(View view) {
        txt.setText("Lionel Messi");
    }
}