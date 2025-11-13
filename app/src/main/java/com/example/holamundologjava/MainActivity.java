package com.example.holamundologjava;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MiPrimerAppCarlos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Carga el layout XML

        // Imprime en Logcat (evidencia)
        Log.d(TAG, "Hello World");
    }
}