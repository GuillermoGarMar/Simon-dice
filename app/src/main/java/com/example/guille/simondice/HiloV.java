package com.example.guille.simondice;

import android.graphics.Color;
import android.widget.Button;

public class HiloV extends Thread{
    Button Vr;
    public void  getB(Button b){
        Vr=b;
    }
    public void Hiloverde(){
        Thread V = new Thread(){
            public void run(){
                Vr.setBackgroundColor(Color.parseColor("#00cc00"));
            }
        };
    }
}
