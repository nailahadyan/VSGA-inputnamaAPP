package dev.nailah.inputnamaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Panggil Variabel Berdasarkan id
        TextNama = findViewById(R.id.TxtNama);
        Hasil = findViewById(R.id.Label2);
    }

    public void TampilNama (View v ){
        Hasil.setText("Nama Anda: " + TextNama.getText());
    }
}