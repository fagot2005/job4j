package tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];
    private int positions = 0;

    private String generateId() {
        Random rd = new Random();
        return String.valueOf(rd.nextLong() + System.currentTimeMillis());

    }

    public Item add(Item item) {
        item.setId(generateId());
        items[positions++] = item;
        return item;
    }

//    public void  show() {
//        Item[] result = new Item[positions];
//        for (int index = 0; index < result.length; index++) {
//            System.out.println(result[index].getId() + result[index].getName());
//        }
//    }

    public Item[] findAll() {
        return Arrays.copyOf(items, positions);
    }


    public Item[] findByName(String key) {
        Item[] newItemsArray = new Item[positions];
        int newSize = 0;
        for (int i = 0; i < positions; i++) {
            if (items[i].equals(key)) {
                newItemsArray[i] = items[i];
                newSize++;
            }
        }
        return Arrays.copyOf(newItemsArray, newSize);
    }

    public Item[] findById(String id) {
        Item[] newItemsArray = new Item[positions];
        int newSize = 0;
        for (int i = 0; i < positions; i++) {
            if (items[i].equals(id)) {
                newItemsArray[i] = items[i];
                newSize++;
            }
        }
        return Arrays.copyOf(newItemsArray, newSize);
    }
//
//    public boolean replase(String id, Item item) {
//
//    }
//    private int index(String) {
//        int rls = -1;
//        for (int index = 0; index<positions; index++) {
//            if (items[index].getId().equals(id));
//            rls = index;
//            break;
//        } return rls;
//    }
}
