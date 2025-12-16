package com.example.constraintlayout;

import androidx.lifecycle.ViewModel;

public class PktViewModel extends ViewModel {
    private int punkty = 0;

    public int getPunkty(){
        return punkty;
    }

    public void setPunkty(int punkty){
        this.punkty = punkty;
    }

    public void addPunkty(int punkty){
        punkty++;
    }
}
