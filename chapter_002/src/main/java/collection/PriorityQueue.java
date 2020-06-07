package collection;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (int i = 0; i < tasks.size(); i++) {
            //System.out.println(tasks);
            if ( tasks.get(i).getPriority() == this.tasks.get(i).getPriority() ) {
                index = i;
                //System.out.println(tasks.get(i).getDesc() + "  " + tasks.get(i).getPriority());
            }
        }
        this.tasks.add(index, task);
//        System.out.println();
//        for (int i = 0; i < tasks.size(); i++) {
//            System.out.println(tasks.get(i).getDesc() + tasks.get(i).getPriority());
//        }
    }

    public Task take() {
        return tasks.poll();
    }
}


