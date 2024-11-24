package com.example.cymbergaj;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
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
        findViewById(R.id.buttonGra).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, LiczbaGraczy.class);
            startActivity(intent);
        });

        // Przycisk do ustawień
        findViewById(R.id.buttonUstawienia).setOnClickListener(view -> {
            // Corrected the Intent initialization by adding a comma to separate parameters
            Intent intent = new Intent(MainActivity.this, Ustawienia.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}