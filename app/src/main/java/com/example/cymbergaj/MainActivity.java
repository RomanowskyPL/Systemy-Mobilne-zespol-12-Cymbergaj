package com.example.cymbergaj;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Przycisk do rozpoczęcia gry
        findViewById(R.id.Gra_1vsBot).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, PoziomTrudnosci.class);
            startActivity(intent);
        });

        findViewById(R.id.Gra_1vs1).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, GraNormalnaCustom.class);
            startActivity(intent);
        });


        // Przycisk do ustawień
        findViewById(R.id.SETTINGS).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, Ustawienia.class);
            startActivity(intent);
        });

        findViewById(R.id.Sklep).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, Sklep.class);
            startActivity(intent);
        });

        findViewById(R.id.Ulepszenia).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, Ulepszenia.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}