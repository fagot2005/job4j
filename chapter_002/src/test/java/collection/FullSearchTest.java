package collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Task> tasks = Arrays.asList(
                new Task("First desc", 1),
                new Task("Second desc", 2),
                new Task("First desc", 1));
        Set<String> expected = new HashSet<>(Arrays.asList("First desc", "Second desc"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }

}