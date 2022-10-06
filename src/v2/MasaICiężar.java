package v2;

import java.util.Scanner;

public class MasaICiężar {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj mase: ");
        double masa = klawiatura.nextDouble();

        double ciezar = (masa * 9.8);

        if (ciezar > 1000) {
            System.out.println("ten obiekt jest za ciezki");


        } else if (ciezar < 10) {
            System.out.println("ten obiekt jest za lekki:");


        } else {
            System.out.println("ten obiekt ma dobra wage");
        }
    }
}