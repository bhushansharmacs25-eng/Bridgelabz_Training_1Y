public class Employee{
	private String name;
	private int  id;
	private int salary;
	public Employee(String name,int id,int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetail(){
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Salary:"+salary);
	}
	public static void main(String[]args){
		Employee e1=new Employee("khushi",101,100000);
		e1.displayDetail();
	}
}