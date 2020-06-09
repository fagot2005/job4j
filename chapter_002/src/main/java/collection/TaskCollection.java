package collection;

public class TaskCollection {
    private String number;
    private String description;

    public TaskCollection(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }
}
