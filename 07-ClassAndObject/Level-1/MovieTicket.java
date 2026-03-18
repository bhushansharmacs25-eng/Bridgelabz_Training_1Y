public class MovieTicket {

    String movieName;
    int seatNumber;
    int price;

    MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    void bookTicket(int seatNumber, int price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully");
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Avengers");

        t1.bookTicket(12, 300);
        t1.displayDetails();
    }
}
