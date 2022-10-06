package v2;


import java.util.Scanner;

public class MagiczeDaty {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);


        System.out.println("podaj numer dnia: ");
        int NumerDnia = klawiatura.nextInt();


        System.out.println("podaj numer miesiaca: ");
        int NumerMiesiaca = klawiatura.nextInt();


        System.out.println("podaj ostatnie cyfry roku: ");
        int OstatnieCyfryRoku = klawiatura.nextInt();

        if (NumerDnia + NumerMiesiaca == OstatnieCyfryRoku) {
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna ");
        }
    }
}


