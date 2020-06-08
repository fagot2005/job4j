package collection;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        int counter = 0;
        for (Task x: tasks) {
            if ( x.getPriority() == this.tasks.get(counter).getPriority()) {
                index = counter;
        }
            counter ++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}


