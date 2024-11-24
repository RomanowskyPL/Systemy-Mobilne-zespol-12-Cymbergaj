package com.example.cymbergaj;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LiczbaGraczy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_liczba_graczy);

        // Przycisk dla 1 gracza
        findViewById(R.id.buttonGracz1).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(LiczbaGraczy.this, PoziomTrudnosci.class);
            startActivity(intent);
        });

        // Przycisk dla 2 graczy
        findViewById(R.id.buttonGracz2).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(LiczbaGraczy.this, PoziomTrudnosci.class);
            startActivity(intent);
        });

        // Przycisk powrot
        findViewById(R.id.buttonPowrot2).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(LiczbaGraczy.this, MainActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}