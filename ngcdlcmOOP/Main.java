package com.ngcdlcmOOP;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Main method
        ArrayList<Sayi> liste = new ArrayList<>();

        Scanner klavye = new Scanner(System.in);
        System.out.print("Kaç sayı olacak ?: ");
        int sayac = klavye.nextInt();

        int[] dizi = new int[sayac];

        for (int i=0; i<sayac; i++) {
            System.out.print("Sayı Giriniz: ");
            dizi[i] = klavye.nextInt();
        }

        for (int i = 0; i < sayac; i++){
            liste.add(new Sayi(dizi[i]));
            liste.get(i).asalCarpanlaraAyir();
            System.out.println("Sayıların asal carpanları: " + liste.get(i).toString());
        }

        System.out.println("Obeb " + obebBul(dizi));
        System.out.println("Okek " + okekBul(dizi));
    }

    public static int obebBul(int[] dizi) {
        //TODO
        int ebob = dizi[0];

        for(int i=1; i<dizi.length; i++) {
            ebob = findGCD(dizi[i], ebob);
        }
        return ebob;
    }
    public static int okekBul(int[] dizi) {
        //TODO
        int ekok = dizi[0];
        int ebob;

        for(int i=1; i<dizi.length; i++){
            ebob = findGCD(dizi[i], ekok);
            ekok = (ekok*dizi[i])/ebob;
        }
        return ekok;
    }

    public static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b, a%b);
    }
}