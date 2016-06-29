package com.example.user.learning;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        final TextView textview = (TextView) findViewById(R.id.editText);
        Button go = (Button) findViewById(R.id.button);
        Button go2 = (Button) findViewById(R.id.button2);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = textview.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),SecondActivity.class);
                i.putExtra("value","Hey I am coming from first activity");
                startActivity(i);
            }
        });
    }
}
