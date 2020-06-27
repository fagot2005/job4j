package collection;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        var index = 0;
        var counter = 0;
        for (var x: tasks) {
            if (task.getPriority() <= x.getPriority()) {
                index = counter;
                break;
            }
            counter ++;
        }
        this.tasks.add(counter, task);
    }

    public Task take() {
        return tasks.poll();
    }
}


