package com.example.yq.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tu = (Button) findViewById(R.id.tu);
        //吐司
        getTuSi();
    }

    private void getTuSi() {
        tu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"测试一下",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
