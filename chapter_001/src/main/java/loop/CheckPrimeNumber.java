package loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number!=1){
            for (int i=1; i<=number; i++) {
                if (i != 1 && i != number) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
        } else prime = false;
        return prime;
    }
}