package collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Tom");
        for (Object value: names) {
            System.out.println(value);
        }
    }

}
