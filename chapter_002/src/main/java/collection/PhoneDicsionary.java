package collection;

import java.util.ArrayList;

public class PhoneDicsionary {
    private ArrayList<Person> person = new ArrayList<Person>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> found(String key) {
        ArrayList<Person> result = new ArrayList<>();
        System.out.println(person.get(0).getSurname());
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getName().contains(key) || person.get(i).getSurname().contains(key) || person.get(i).getAddress().contains(key) || person.get(i).getPhone().contains(key)) {
                result.add(person.get(i));
            }
        }
        return result;
    }
}

