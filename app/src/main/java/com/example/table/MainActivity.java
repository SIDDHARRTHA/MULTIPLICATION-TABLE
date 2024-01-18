package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText n1;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        b1 = findViewById(R.id.b1);
        ans = findViewById(R.id.ans);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(n1.getText().toString());
                displayMultiplicationTable(num);
            }
        });
    }

    private void displayMultiplicationTable(int number) {
        StringBuilder table = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            table.append(String.format("%d x %d = %d\n", number, i, result));
        }

        ans.setText(table.toString());
    }
}
