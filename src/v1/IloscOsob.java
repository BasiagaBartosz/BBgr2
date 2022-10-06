package v1;

public class IloscOsob {
    public static void main(String[] args) {

        int pomieszczenie1 = 3 * 4;
        int pomieszczenie2 = 3 * 4;
        int pomieszczenie3 = 2 * 3;
        int pomieszczenie4 = 2 * 2;

        int LiczbaOsob = 4;

        int PowierzchniaCalkowitaMieszkania = pomieszczenie1 + pomieszczenie2 + pomieszczenie3 + pomieszczenie4;
        double PowierzchniaNaJednaOsobe = (double)PowierzchniaCalkowitaMieszkania /LiczbaOsob;

        System.out.println("PowierzchniaNaJednaOsobe:" + PowierzchniaNaJednaOsobe);

    }
}