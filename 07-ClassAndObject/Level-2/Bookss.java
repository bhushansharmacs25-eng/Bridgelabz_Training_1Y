class Bookss {

    public int isbn;
    protected String title;
    private String author;

    void setAuthor(String a) {
        author = a;
    }

    String getAuthor() {
        return author;
    }
}

class EBook extends Bookss {

    void show() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}

class Main {
    public static void main(String[] args) {

        EBook b = new EBook();

        b.isbn = 12345;
        b.title = "Java Basics";
        b.setAuthor("Ravi");

        b.show();
    }
}