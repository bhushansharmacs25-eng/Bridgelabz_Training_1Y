class CarRental {

    String customerName;
    String carmodel;
    int rentaldays;
	
    CarRental() {
        customerName = "Customer";
        carmodel = "Basic";
        rentaldays = 1;
    }
    CarRental(String n, String m, int d) {
        customerName = n;
        carmodel = m;
        rentaldays = d;
    }
    int totalCost() {
        int pricePerDay = 5000;
        return rentaldays * pricePerDay;
    }
    void show() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carmodel);
        System.out.println("Rental Days: " + rentaldays);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }

    public static void main(String[] args) {

        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Khushi", "BMW", 3);

        r1.show();
        r2.show();
    }
}
