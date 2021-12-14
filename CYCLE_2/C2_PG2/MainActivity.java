package com.example.sjcet.c2pg2;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;
public class MainActivity extends AppCompatActivity {
    Button snd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        snd=findViewById(R.id.btn);
    }
    public void click(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
        startActivity(intent);
    }
}