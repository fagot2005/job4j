package loop;

public class Mortgage {

    public int year(int amount, int salary, double percent) {
        int year = 0;
        double loanBalance = amount;
        //где amount - сумма выданная по кредиту, salary - годовой доход, percent - процентная ставка по кредиту
        while (loanBalance > 0) {
            year = year + 1;
            loanBalance = loanBalance * (1 + (percent / 100)) - salary;
        }

        return year;
    }
}
