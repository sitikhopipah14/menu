package com.example.manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity_faktor extends AppCompatActivity {
    TextView penyelesaian;
    TextView textfak;
    TextView prima;
    TextView akhir;
    ImageButton kembaliii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faktor);

        penyelesaian = (TextView) findViewById(R.id.penyelesaian);
        penyelesaian.setText("1 x 4 = 4\n" +
                "2 x 4 = 4 + 4 = 8\n"+
        "3 x 4 = 4 + 4 + 4 = 12\n"+
        "4 x 4 = 4 + 4 + 4 + 4 = 16\n"+
"Jadi, kelipatan dari 4 adalah 4, 8, 12, 16, .... dan seterusnya.");

        textfak = (TextView) findViewById(R.id.textfak);
        textfak.setText("Jadi faktor dari 24 adalah 1,2,3,4,6,8,12 dan 24\n" +
                "Jadi faktor dari 32 adalah 1,2,4,8,16 dan 32");

        prima = (TextView) findViewById(R.id.prima);
        prima.setText("Faktor dari 20 adalah 1, 2, 4, 5, 10, dan 20\n" +
                "Faktor prima dari 20 adalah 2 dan 5.");

        akhir = (TextView) findViewById(R.id.akhir);
        akhir.setText("30    = 2 x 3 x 5\n\n" +
                "42    = 2 x 3 x 7\n\n"+
                "FPB = 2 x 3\n\n"+
                "KPK = 2 x 3 x 5 x 7\n");

        kembaliii = (ImageButton) findViewById(R.id.kembaliii);
        kembaliii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activitykelas4.class));
            }
        });
    }
}