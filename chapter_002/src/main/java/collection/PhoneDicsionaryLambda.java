package collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDicsionaryLambda {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = x -> x.getAddress().contains(key) ||
                x.getSurname().contains(key) ||
                x.getAddress().contains(key) ||
                x.getPhone().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
