package tracker;

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

    public Item[] findAll() {
        return null;
    }

    public Item[] findByName(String key) {
        return null;
    }
    public Item findById(String id) {
        return null;
    }

}
