package collection;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        int counter = 0;
        for (Task x: tasks) {
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


