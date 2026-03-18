public class Books{
	String title;
    String author;
    int price;
    boolean available;

    Books(String t, String a, int p, boolean av) {
        title = t;
        author = a;
        price = p;
        available = av;
    }

    void borrowBook() {
        if (available == true) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }

    public static void main(String[] args) {

        Books b1 = new Books("Java", "Ramesh", 300, true);

        b1.show();
        b1.borrowBook();
        b1.show();
    }
}