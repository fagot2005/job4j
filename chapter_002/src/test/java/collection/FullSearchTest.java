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
        List<TaskCollection> tasksCollection = Arrays.asList(
                new TaskCollection("1", "First desc"),
                new TaskCollection("2", "Second desc"),
                new TaskCollection("1", "First desc"));
        Set<String> expected = new HashSet<>(List.of("1", "2"));
        assertThat(FullSearch.extractNumber(tasksCollection), is(expected));
    }

}