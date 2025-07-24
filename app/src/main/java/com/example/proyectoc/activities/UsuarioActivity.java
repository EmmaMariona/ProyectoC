package com.example.proyectoc.activities;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.proyectoc.R;

public class UsuarioActivity extends AppCompatActivity {

    Button btnMisVehiculos, btnHistorial, btnSolicitarServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        btnMisVehiculos = findViewById(R.id.btnMisVehiculos);
        btnHistorial = findViewById(R.id.btnHistorial);
        btnSolicitarServicio = findViewById(R.id.btnSolicitarServicio);

        btnMisVehiculos.setOnClickListener(v ->
                Toast.makeText(this, "Vehículos (falta pantalla)", Toast.LENGTH_SHORT).show());

        btnHistorial.setOnClickListener(v ->
                Toast.makeText(this, "Historial (falta pantalla)", Toast.LENGTH_SHORT).show());

        btnSolicitarServicio.setOnClickListener(v ->
                Toast.makeText(this, "Servicio (falta pantalla)", Toast.LENGTH_SHORT).show());
    }
}
