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

    return Arrays.copyOf(items, positions);

    public Item[] findByName(String key) {
        int pos[] = new int[positions];
        int newSize = 0;
        for (int = 0; i<items.lenght; i++){
            if (items[i]==key){
                pos[i] = items[i];
                newSize+=;
            }
        }
        return pos;
    }
    public Item findById(String id) {
        return null;
    }

}
