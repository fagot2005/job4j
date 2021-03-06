package collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1/SSK2", "K1/SK1/SSK1", "K1/SK2",
                "K1/SK1", "K2/SK1", "K2/SK1/SSK1");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2",
                "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenStringDownComparator() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1", "k2/sk2/ssk1");
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk2", "k2/sk2/ssk1", "k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }
}