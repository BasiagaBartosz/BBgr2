package v2;

import java.util.Scanner;

public class LiczbyRzymskie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String  liczba1 = "I", liczba2 = "II", liczba3 = "III", liczba4 = "IV", liczba5 = "V",
                liczba6 = "VI", liczba7 = "VII", liczba8 = "VIII", liczba9 = "IX", liczba10 = "X";

        int liczba = 0;

        System.out.println("podaj dowolna liczbe z zakresu 1-10: ");

        liczba =scanner.nextInt();
        scanner.nextLine();



        if (liczba == 1) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba1);
        }
        else if (liczba == 2) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba2);
        }
        else if (liczba == 3) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba3);
        }
        else if (liczba == 4) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba4);
        }
        else if (liczba == 5) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba5);
        }
        else if (liczba == 6) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba6);
        }
        else if (liczba == 7) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba7);
        }
        else if (liczba == 8) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba8);
        }
        else if (liczba == 9) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba9);
        }
        else if (liczba == 10) {
            System.out.println("twój odpowiednik w systemie rzymskim to: " + liczba10);
        }
        else
            System.out.println("podano blędna liczbe");

    }
}

