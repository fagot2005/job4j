package collection;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDicsionary {
    private static ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> found(String key) {
        ArrayList<Person> result = new ArrayList<>();
        System.out.println(persons.get(0).getSurname());
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getName().contains(key) || persons.get(i).getSurname().contains(key) || persons.get(i).getAddress().contains(key) || persons.get(i).getPhone().contains(key)) {
                result.add(persons.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Person> find(String key) {
        Predicate<Person> combineAddress = x -> x.getAddress().contains(key);
        Predicate<Person> combineSurname = x -> x.getSurname().contains(key);
        Predicate<Person> combinePhone = x -> x.getAddress().contains(key);
        Predicate<Person> combineName = x -> x.getName().contains(key);
        Predicate<Person> or = combineAddress.or(combineSurname).or(combinePhone).or(combineName);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (or.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

