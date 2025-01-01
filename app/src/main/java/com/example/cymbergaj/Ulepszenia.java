package com.example.cymbergaj;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ulepszenia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ulepszenia);

        findViewById(R.id.Sklep3).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(Ulepszenia.this, Sklep.class);
            startActivity(intent);
        });

        findViewById(R.id.Gra3).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(Ulepszenia.this, MainActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.SETTINGS).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(Ulepszenia.this, Ustawienia.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}