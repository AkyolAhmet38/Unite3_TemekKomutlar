package com.example.temelkomutlarunite_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg8_activity);
        Button btn = findViewById(R.id.btnsonuc1);
        EditText text = findViewById(R.id.text1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int sayi = Integer.parseInt(text.getText().toString());
                    System.out.println("x = " + sayi + sayi);
                    System.out.println("x += " + sayi + ": "+ (sayi+=3));
                    System.out.println("x -= " + sayi + ": "+ (sayi-=3));
                    System.out.println("x *= " + sayi + ": "+ (sayi *= 3));
                    System.out.println("x /= " + sayi + ": "+ (sayi /= 3));
                    System.out.println("x %= " + sayi + ": "+ (sayi%= 3));
                }
                catch (Exception e)
                {
                    Toast.makeText(Uyg8Activity.this, "Sayı gir", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
