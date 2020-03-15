package loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number) == true) {
                count = count + 1;
                //System.out.println("Простое число "+number);
            }
        }
        return count;
    }
}
