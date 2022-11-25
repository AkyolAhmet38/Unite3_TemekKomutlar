package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        float ondalik1 = 1f/3f;
        double ondalik2 = 1d/3d;

        System.out.println("Float Sayı (1/3): " + ondalik1);
        System.out.println("Double Sayı (1/3): " + ondalik2);

    }
}
