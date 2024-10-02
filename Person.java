package abstract1;

public class Person {
	 final String name;
	 final int age;
	 
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

   public void display() {
	   System.out.println("Name: " + name);
	   System.out.println("Age: " + age);
   }


	public static void main(String args[]) 
	{
		Person p=new Person("Chinmay", 23);
		p.display();
	}
}
