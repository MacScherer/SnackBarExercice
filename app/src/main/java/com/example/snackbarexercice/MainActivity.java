package com.example.snackbarexercice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button  buttonOpenSnackBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOpenSnackBar = findViewById(R.id.buttonOpenSnackBar);

        buttonOpenSnackBar.setOnClickListener(v -> {
           snackBarOpen(v);
        });
    }

    private void snackBarOpen(View v) {
        Snackbar.make(v,"Button got pressed", BaseTransientBottomBar.LENGTH_INDEFINITE)
                .setAction("Confirm", v1 -> {
                    Toast.makeText(this, "CONFIRMED", Toast.LENGTH_SHORT).show();
        }).setActionTextColor(getResources().getColor(R.color.green)).show();
    }
}