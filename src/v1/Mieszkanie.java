package v1;

public class Mieszkanie {
    public static void main(String[] args) {

        int pomieszczenie1 = 3 * 4;
        int pomieszczenie2 = 3 * 4;
        int pomieszczenie3 = 2 * 3;
        int pomieszczenie4 = 2 * 2;

        System.out.println("powierzchnia pomieszczenia1:" + pomieszczenie1 + "m2");
        System.out.println("powierzchnia pomieszczenia2:" + pomieszczenie2 + "m2");
        System.out.println("powierzchnia pomieszczenia3:" + pomieszczenie3 + "m2");
        System.out.println("powierzchnia pomieszczenia4:" + pomieszczenie4 + "m2");


        System.out.println("powierzchnia calkowita mieszkania:" +  (pomieszczenie1 +  pomieszczenie2 + pomieszczenie3 + pomieszczenie4) + "m2");


    }
}