package ScenarioBasedProblems;

class Book {
    int bookId;
    String title;
    double price;
    static String libraryName = "Central Library";

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public double calculateFine(int daysLate) {
        return 0; // Default fine
    }
}

class TextBook extends Book {
    public TextBook(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return 2.0 * daysLate;
    }
}

class Magazine extends Book {
    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return 5.0 * daysLate;
    }
}

public class SmartLibrarySystem {
    public static void main(String[] args) {
        System.out.println("Library: " + Book.libraryName);
        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(102, "Tech Today", 100);

        System.out.println("TextBook fine for 3 days: " + b1.calculateFine(3));
        System.out.println("Magazine fine for 3 days: " + b2.calculateFine(3));
    }
}
