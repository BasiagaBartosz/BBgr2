package v2;

import java.util.Scanner;

public class KalkulatorCzasu {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj sekundy: ");
        double czas = klawiatura.nextDouble();

        if (czas < 60) {
            System.out.println("ilosc czasu to: " + czas + "s");
        } else if (czas > 59 && czas < 3600) {
            czas = czas / 60;
            System.out.println("ilosc czasu to: " + czas + "min");
        } else if (czas > 3599 && czas < 86400) {
            czas = czas / 3600;
            System.out.println("ilosc czasu to: " + czas + "h");
        } else if (czas > 86400) {
            czas = czas / 86400;
            System.out.println("ilosc czasu to: " + czas + "dni");
        }

    }
}