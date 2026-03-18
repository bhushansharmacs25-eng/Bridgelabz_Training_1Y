public class MobliePhone{
	private String brand;
	private String model;
	private int price;
	
	public MobliePhone(String brand,String model,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void displayDetail(){
		System.out.println("Brand:-"+brand);
		System.out.println("Model:-"+model);
		System.out.println("Price:-"+price);
	}
	public static void main(String[]args){
		MobliePhone m1=new MobliePhone("Sumsung","A14",25000);
		m1.displayDetail();
	}
}