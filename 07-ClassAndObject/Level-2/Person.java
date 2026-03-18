public class Person{
	String name;
	int age;
	Person(String n,int a){
		name=n;
		age=a;
	}
	Person(Person p) {
        name = p.name;
        age = p.age;
    }
	public void show(){
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
	}
	public static void main(String[]args){
		Person p1 = new Person("Khushi",18);
		Person p2 = new Person(p1);
		p1.show();
		p2.show();
	}
}
