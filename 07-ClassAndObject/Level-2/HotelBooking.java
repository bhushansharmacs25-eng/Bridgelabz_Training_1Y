public class HotelBooking{
	String guestName;
    String roomType;
    int nights; 
	HotelBooking(){
		guestName = "Guest";
        roomType = "Standard";
        nights = 1;
	}
	HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }
	HotelBooking(HotelBooking h){
		guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }
	public void show(){
		System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
	public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Ravi", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.show();
        b2.show();
        b3.show();
    }
}
