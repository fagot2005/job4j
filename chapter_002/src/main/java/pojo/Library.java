package pojo;

public class Library {
    public static void main(String[] args) {
        Book firstbook = new Book("Pinokio", 250);
        Book secondbook = new Book("Bilbo", 1450);
        Book thriddbook = new Book("Clean code", 180);
        Book fourdbook = new Book("Mu-mu", 30);

        Book[] book = new Book[4];
        book[0] = firstbook;
        book[1] = secondbook;
        book[2] = thriddbook;
        book[3] = fourdbook;

        for (int i=0; i<book.length; i++){
            Book pr = book[i];
            System.out.println(pr.getName() + ", " + pr.getCount());
        }
        Book temp = new Book("BluSky", 120);
        book[0] = temp;
        book[0] = book[3];
        book[3] = temp;

        System.out.println();

        for (int i=0; i<book.length; i++) {
            Book pr = book[i];
            System.out.println(pr.getName() + ", " + pr.getCount());
        }
        System.out.println();
        System.out.println("Shown only product.name = Clean code");
        for (int i=0; i<book.length; i++) {
            Book pr = book[i];
            if (pr.getName()=="Clean code"){
                System.out.println(pr.getName() + ", " + pr.getCount());
            }

        }

   }
}
