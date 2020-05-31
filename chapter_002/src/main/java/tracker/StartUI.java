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
                tracker.findAll();
//                    for (int index = 0; index<positions; index++){
//                        System.out.println();
                //}
            } else if (selest == 4) {
                System.out.println("===Found Item by Id===");
                System.out.println("Enter Id: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.findById(item);
            } else if (selest == 5) {
                    System.out.println("===Found Item by Name===");
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    Item item = new Item(name);
                    tracker.findByName(item);
                } else if (selest == 6) {
                    run = false;
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

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            Tracker tracker = new Tracker();
            new StartUI().unit(scanner, tracker);
        }

    }
}
