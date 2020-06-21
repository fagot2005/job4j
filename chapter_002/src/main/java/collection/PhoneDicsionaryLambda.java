package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDicsionaryLambda {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combineAddress = x -> x.getAddress().contains(key);
        Predicate<Person> combineSurname = x -> x.getSurname().contains(key);
        Predicate<Person> combinePhone = x -> x.getAddress().contains(key);
        Predicate<Person> combineName = x -> x.getName().contains(key);
        Predicate<Person> combine = Comparator.comparing(combineAddress).or(combineSurname).or(combinePhone).or(combineName);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
