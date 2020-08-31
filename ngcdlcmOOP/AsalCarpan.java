package com.ngcdlcmOOP;

public class AsalCarpan {
    private int asalDeger;
    private int katsayi;

    public AsalCarpan(int deger, int katsayi) {
        this.asalDeger = deger;
        this.katsayi = katsayi;
    }

    public int getasalDeger() {
        return asalDeger;
    }
    public void setasalDeger(int deger) {
        this.asalDeger = deger;
    }

    public int getkatsayi() {
        return katsayi;
    }
    public void setkatsayi(int katsayi) {
        this.katsayi = katsayi;
    }

    public String toString() {
        return asalDeger + "^" + katsayi ;
    }
}