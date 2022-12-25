package com.example.kullanicigirisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Singleton {
    private String kullaniciAdi;
    private String kullaniciParola;
    private static Singleton singleton;
    private Singleton(){
    }
    public String getKullaniciAdi(){
        return kullaniciAdi;
    }
    public String getKullaniciParola(){
        return kullaniciParola;
    }
    public void setKullaniciParola(String kullaniciParola){
        this.kullaniciParola=kullaniciParola;
    }
    public void setKullaniciAdi(String kullaniciAdi){
        this.kullaniciAdi=kullaniciAdi;
    }
    public static Singleton getInstance(){
        if (singleton==null){
            singleton= new Singleton();
        }
        return singleton;
    }
}