package com.example.message;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Hello tcyang");
        TestMaster();
    }

    private void TestMaster() {
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master分支");
        Test123();

    }

    private void Test123() {
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("123分支");
    }
}
