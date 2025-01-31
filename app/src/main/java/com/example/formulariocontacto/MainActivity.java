package com.example.formulariocontacto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    // Declarar las vistas
    EditText txtNombre;
    EditText txtTelefono;
    EditText txtMensaje;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar las vistas
        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtMensaje = findViewById(R.id.txtMensaje);
        btnEnviar = findViewById(R.id.btnEnviar);

        // Configurar el clic del botón "Enviar"
        btnEnviar.setOnClickListener(v-> {

                // Obtener los valores ingresados por el usuario
                String nombre = txtNombre.getText().toString();
                String telefono = txtTelefono.getText().toString();
                String mensaje = txtMensaje.getText().toString();

                // Mostrar un Toast con la información
                String mensajeToast = "Nombre: " + nombre + "\nTeléfono: " + telefono + "\nMensaje: " + mensaje;
                Toast.makeText(MainActivity.this, mensajeToast, Toast.LENGTH_LONG).show();

        });
    }
}