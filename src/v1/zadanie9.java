package v1;

public class zadanie9 {
    public static void main(String[] args) {

        String FirstName = " Bartosz";
        String MiddleName = " Piotr";
        String LastName = " Basiaga";

        char FirstInitial = FirstName.charAt(0);
        char MiddleInitial = MiddleName.charAt(0);
        char LastInitial = LastName.charAt(0);

        System.out.println("imie" + FirstName);
        System.out.println("drugie imie" + MiddleName);
        System.out.println("nazwisko" + LastName);
        System.out.println(FirstInitial + MiddleInitial + LastInitial);

    }
}