package tracker;

import java.util.Scanner;

public class StartUI {
    public void unit(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select:");
            int selest = Integer.valueOf(scanner.nextLine());
            if (selest == 0) {
                System.out.println("===Greate new Item===");
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (selest == 1) {
                System.out.println("===Show all Item===");
                Item[] itemsNew = tracker.findAll();
                System.out.println("===Id====          ===Name===");
                for (int index = 0; index < itemsNew.length; index++) {
                    if (itemsNew[index] != null) {
                        System.out.println(itemsNew[index].getId() + "   " + itemsNew[index].getName());
                    }
                }
            }
            else if (selest == 2) {
                System.out.println("===Edit Item by Id===");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                System.out.println("Enter newName: ");
                String name = scanner.nextLine();
                if (tracker.replase(id, name)) {
                    System.out.println("Item " + id + " replase Name successfully");
                } else System.out.println("Item " + id + " not found");
            }
            else if (selest == 3) {
                System.out.println("===Delete Item by Id===");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item " + id + " deleted successfully");
                } else {
                    System.out.println("Item " + id + " not found");
                }
            }
            else if (selest == 4) {
                System.out.println("===Found Item by Id===");
                System.out.println("Enter Id: ");
                String name = scanner.nextLine();
                Item item = tracker.findById(name);
                System.out.println("===Show Item by Id===");
                System.out.println("===Id====          ===Name===");
                System.out.println(item.getId() + "   " + item.getName());
            } else if (selest == 5) {
                System.out.println("===Found Item by Name===");
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                Item[] item = tracker.findByName(name);
                System.out.println("===Show Item by Name===");
                System.out.println("===Id====          ===Name===");
                for (int index = 0; index < item.length; index++) {
                    if (item[index] != null) {
                        System.out.println(item[index].getId() + "   " + item[index].getName());
                    }
                }
            } else if (selest == 6) {
                run = false;
            } else {
                System.out.println("The menu item is not correct, select from 1-6");
                run = true;
            }
        }
    }

    private void showMenu () {
        System.out.println("Menu");
        System.out.println("0. Add");
        System.out.println("1. Show");
        System.out.println("2. Edit");
        System.out.println("3. Delete");
        System.out.println("4. Find ID");
        System.out.println("5. Find Name");
        System.out.println("6. Exit");
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().unit(scanner, tracker);
    }

}
