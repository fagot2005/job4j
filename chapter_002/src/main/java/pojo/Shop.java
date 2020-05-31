package pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products  = new Product[5];
        products[0] = new Product("Milk", 10);
        products[3] = new Product("Bread", 4);
        products[4] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i]; //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом 1"); //удаляем значение из ячейки с индексом 1
        products[1] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i]; //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Записываем  в ячейку с индексом "
                + "1 значение ячейки с индексом 2 и удаляем "
                + "значение из ячейки с индексом 2"); //записываем в ячейку с индексом 1 значение ячейки с индексом 2.
        products[1] = products[2]; //удаляем значение из ячейки с индексом 2.
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];   //проверяем, что объект не равен null. так как  у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        System.out.println("Удаляем элемент с индексом 3");
        delete(products, 3);
    }

    public static Product[] delete(Product[] products, int index) {
        printArray(products);
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        System.out.println();
        printArray(products);
        return products;
    }

    public static void printArray(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
