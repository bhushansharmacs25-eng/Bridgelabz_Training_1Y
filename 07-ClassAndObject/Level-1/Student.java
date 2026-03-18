public class Student{
	private String name;
	private int rollnumber;
	private int marks;
	
	public Student(String name,int rollnumber,int marks){
		this.name=name;
		this.rollnumber=rollnumber;
		this.marks=marks;
	}
	public String Grades(){
		if(marks>=90){
			return "A";
		}else if(marks>=75){
			return "B";
		}else if(marks>=60){
			return "C";
		}else if(marks>=50){
			return "D";
		}else{
			return "F";
		}
	}
	public void displayDetail(){
		System.out.println("Name: "+name);
		System.out.println("Roll no : "+rollnumber);
		System.out.println("Marks : "+marks);
		System.out.println("Grades: "+Grades());
	}
	public static void main(String[]args){
		Student s1=new Student("Khushi",37,95);
		s1.displayDetail();
	}
}