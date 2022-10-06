package v2;

import java.util.Scanner;

public class IndeksBMI {
    public static void main(String[] args) {

        double waga, wzrost, BMI;

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("podaj swoją wagę: ");
        waga = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("podaj swój wzrost: ");
        wzrost = klawiatura.nextDouble();


        BMI = waga / (wzrost * wzrost);

        if (BMI < 18.5) {
            System.out.println("masz niedowage");

        } else if (BMI > 25) {

            System.out.println("masz niedowage");
        } else {
            System.out.println("twoje bmi jest prawidlowe");
        }

    }
}