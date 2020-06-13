package sort;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class JobSorterTest {

    @Test
    public void JobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName());
        //assertThat(jobs, ('X task', 0){"Fix bug", 4}, name='Fix bug', priority=2});
        System.out.println(jobs);
    }

    @Test
    public void JobUpByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobUpByPriority());
        //assertThat(jobs, ('X task', 0){"Fix bug", 4}, name='Fix bug', priority=2});
        System.out.println(jobs);
    }

    @Test
    public void JobUpByPriorityAndDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByPriority().thenComparing(new JobDescByName()));
        //assertThat(jobs, ('X task', 0){"Fix bug", 4}, name='Fix bug', priority=2});
        System.out.println(jobs);
    }
}