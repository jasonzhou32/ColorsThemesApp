package com.example.colorsthemesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mainLayout;

    int snackBarCount;
    int surpriseCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
        snackBarCount = 0;
        surpriseCount = 0;
    }

    public void snackbarClicked(View v) {
        Snackbar.make(mainLayout, "How many snackbars?", Snackbar.LENGTH_LONG)
                .setAction("Answer", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackBarCount++;
                        Snackbar.make(mainLayout, "Count: " + snackBarCount,
                                        Snackbar.LENGTH_SHORT)
                                .show();
                    }
                })
                .show();
    }

    public void toastClicked(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "This is a toast", Toast.LENGTH_SHORT);

        toast.show();
    }


}