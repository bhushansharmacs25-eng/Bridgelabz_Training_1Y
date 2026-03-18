public class Item{
	private int itemcode;
	private String itemname;
	private int price;
	public Item(int itemcode,String itemname,int price){
		this.itemcode=itemcode;
		this.itemname=itemname;
		this.price=price;
	}
	public void displayDetail(int quantity){
		int total=price*quantity;
		System.out.println("Itemcode:"+itemcode);
		System.out.println("Itemname:"+itemname);
		System.out.println("Price:"+price);
		System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
	}
	public static void main(String[]args){
		Item c1=new Item(243,"Tv",25000);
		c1.displayDetail(2);
	}
}
