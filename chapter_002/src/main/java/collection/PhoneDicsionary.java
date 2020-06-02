package collection;

import java.util.ArrayList;

public class PhoneDicsionary {
    private ArrayList<Person> person = new ArrayList<Person>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> found(String key) {
        ArrayList<Person> result = new ArrayList<>();
        return result;
    }
}
