package com.example.proyectoc.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectoc.R;

public class AdminMenuActivity extends AppCompatActivity {

    Button btnCotizaciones, btnTecnicos, btnUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu);

        btnCotizaciones = findViewById(R.id.btnCotizaciones);
        btnTecnicos = findViewById(R.id.btnTecnicos);
        btnUsuarios = findViewById(R.id.btnUsuarios);

        btnCotizaciones.setOnClickListener(v ->
                Toast.makeText(this, "Cotizaciones (falta pantalla)", Toast.LENGTH_SHORT).show());

        btnTecnicos.setOnClickListener(v ->
                Toast.makeText(this, "Técnicos (falta pantalla)", Toast.LENGTH_SHORT).show());

        btnUsuarios.setOnClickListener(v ->
                Toast.makeText(this, "Usuarios (falta pantalla)", Toast.LENGTH_SHORT).show());
    }
}
