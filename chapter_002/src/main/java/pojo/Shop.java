package pojo;

public class Shop {
    public static void main(String[] args) {
        Product[] products  = new Product[5];
        products[0] = new Product("Milk", 10);
        products[3] = new Product("Bread", 4);
        products[4] = new Product("Egg", 19);
        printArray(products);
        products[1] = null;
        products[1] = products[2];
        products[2] = null;
        delete(products, 3);
    }

    public static Product[] delete(Product[] products, int index) {
        printArray(products);
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        printArray(products);
        return products;
    }

    public static void printArray(Product[] products) {
        System.out.println();
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
