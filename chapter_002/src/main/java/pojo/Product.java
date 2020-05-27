package pojo;

public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        Product milk = new Product("Milk", 40);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 20);
        products[0] = milk;
        products[1] = bread;
        products[2] = egg;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(products[i].getName());
        }
        products[1]=null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(products[i].getName());
        }

        Product[] prods = new Product[3];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        for (int i = 0; i < prods.length; i++) {
            System.out.println(prods[i].getName() + " " + prods[i].getCount());
        }
    }
}
