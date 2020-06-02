package collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PhoneDicsionaryTest {

    @Test
    public void add() {
    }

    @Test
    public void found() {
        PhoneDicsionary phones = new PhoneDicsionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.found("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

}