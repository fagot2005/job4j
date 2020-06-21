package collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDicsionaryLambdaTest {

        @Test
        public void whenFindByName() {
            PhoneDicsionaryLambda phones = new PhoneDicsionaryLambda();
            phones.add(
                    new Person("Petr", "Arsentev", "534872", "Bryansk")
            );
            ArrayList<Person> persons = PhoneDicsionaryLambda.find("Petr");
            assertThat(persons.get(0).getSurname(), is("Arsentev"));
        }
  }