package collection;

import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDicsionaryTest {

    @Test
    public void add() {
    }

    @Test
    public void found() {
        PhoneDicsionary phones = new PhoneDicsionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        phones.add(new Person("Seter", "Ivanov", "534872", "Bryansk"));
        phones.add(new Person("Vasil", "Retearov", "534872", "Bretnsk"));
        phones.add(new Person("1", "2", "534872", "Bretnsk"));
        ArrayList<Person> persons = phones.found("et");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
        assertThat(persons.get(1).getSurname(), is("Ivanov"));
        assertThat(persons.get(2).getSurname(), is("Retearov"));
        assertThat(persons.get(3).getSurname(), is("2"));
    }

    @Test
    public void whenFindByName() {
        PhoneDicsionary phones = new PhoneDicsionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = PhoneDicsionary.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

}