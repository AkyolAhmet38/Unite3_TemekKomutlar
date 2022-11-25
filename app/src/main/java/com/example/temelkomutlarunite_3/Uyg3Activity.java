package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        char karakter = 'A';
        System.out.println("Karakter: " + karakter);

        karakter = 'A' + 32;
        System.out.println("Yeni Karakter: " + karakter);


    }
}
