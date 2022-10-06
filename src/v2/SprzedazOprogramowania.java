package v2;

import java.util.Scanner;

public class SprzedazOprogramowania {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe zakupionych pakietow: ");
        int cena, rabat, liczbaSztuk, lacznaKwota, cenaPakietu;
        cenaPakietu = 99;


        if (liczbaSztuk > 10 && liczbaSztuk <19);
        {
            rabat = 20%;
            cena = liczbaSztuk * cenaPakietu;
            lacznaKwota = (int) (cena - 0.2);
            System.out.println("rabat: " + rabat + "%");
            System.out.println("cena: " + cena + "zł");
            System.out.println("łaczna kwota: " + lacznaKwota + "zł");
        }
        else if (liczbaSztuk > 20 && liczbaSztuk <49);
        {
            rabat = 30%;
            cena = liczbaSztuk * cenaPakietu;
            lacznaKwota = (int) (cena - 0.3);
            System.out.println("rabat: " + rabat + "%");
            System.out.println("cena: " + cena + "zł");
            System.out.println("łaczna kwota: " + lacznaKwota + "zł");
        }
        else if (liczbaSztuk > 50 && liczbaSztuk <99);
        {
            rabat = 40%;
            cena = liczbaSztuk * cenaPakietu;
            lacznaKwota = (int) (cena - 0.4);
            System.out.println("rabat: " + rabat + "%");
            System.out.println("cena: " + cena + "zł");
            System.out.println("łaczna kwota: " + lacznaKwota + "zł");
        }

    }
}

