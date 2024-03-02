package Date27_First_assignment;

public class Student
 {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
		public static void main(String[] args) {
		Student ob1=new Student();
		ob1.display1();
		ob1.display2();
		ob1.rollno=2;
		ob1.age=20;
		System.out.println("rollno is "+ob1.rollno);
		System.out.println("age is "+ob1.age);
	}
}
