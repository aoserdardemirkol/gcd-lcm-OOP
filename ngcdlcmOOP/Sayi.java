package com.ngcdlcmOOP;

import java.util.ArrayList;
import java.util.List;

public class Sayi {

    private int deger;
    private List<AsalCarpan> asalCarpanList = new ArrayList<>();

    public Sayi(int deger) {
        this.deger = deger;
    }

    public void asalCarpanlaraAyir() {
        int deger = this.deger;
        for (int i = 2; i <= deger; i++) {
            int sayac = 0;
            while (deger % i == 0) {
                deger /= i;
                sayac++;
            }
            if (sayac != 0) {
                AsalCarpan asalCarpandeger = new AsalCarpan(i, sayac);
                asalCarpanList.add(asalCarpandeger);
            }
        }
    }

    public int getdeger(){ return deger; }
    public void setdeger (int deger){ this.deger = deger; }

    public List<AsalCarpan> getasalCarpanList() { return asalCarpanList; }
    public void setasalCarpanList(List<AsalCarpan> asalCarpanList) { this.asalCarpanList = asalCarpanList; }

    public String toString() {
        return deger + " " + asalCarpanList;
    }
}