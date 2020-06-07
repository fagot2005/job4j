package collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void put() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle2", 3));
        queue.put(new Task("middle3", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
    }