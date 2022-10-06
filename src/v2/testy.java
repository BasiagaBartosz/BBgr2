package v2;


import java.util.Scanner;

public class testy {
    public static void main(String[] args) {
        int ocena1, ocena2, ocena3;
        int iloscOcen = 3;
        double srednia1, srednia;
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj ocene 1: ");
        ocena1 = klawiatura.nextInt();

        System.out.println("podaj ocene 2: ");
        ocena2 = klawiatura.nextInt();

        System.out.println("podaj ocene 3: ");
        ocena3 = klawiatura.nextInt();

        srednia1 = (((ocena1 + ocena2 + ocena3) / iloscOcen) * 100);
        srednia = (srednia1 / 5);
        System.out.println("twoja srednia wynosi: " + srednia + "%");


        if (srednia >= 90)
            System.out.println("Bardzo dobrze! ocena 5");
        else if (srednia >= 80)
            System.out.println("Dobrze, ocena 4");
        else if (srednia >= 70)
            System.out.println("Moglo byc lepiej, ocena 3");
        else if (srednia >= 60)
            System.out.println("kiepsko, ocena 2");
        else if (srednia >= 50)
            System.out.println("wez sie do nauki, ocena 1");

    }
}
