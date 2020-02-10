package branching_and_looping;

public class Task_4_0 {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0){
            System.out.println("This is negative numbers");
        }

    }
}
