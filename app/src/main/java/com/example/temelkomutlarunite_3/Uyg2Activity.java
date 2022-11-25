package com.example.temelkomutlarunite_3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);

        byte kucukSayi = 120;
        short kisaSayi = 32727;
        int tamSayi = 2147483647;
        long uzunSayi = 9223372036854775807L;

        System.out.println("Byte: " + kucukSayi);
        System.out.println("Short: " + kisaSayi);
        System.out.println("Int: " + tamSayi);
        System.out.println("Long: " + uzunSayi);
    }
}
