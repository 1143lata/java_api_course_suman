package Date27_First_assignment;

public class methods {

	public void m()
	{
		System.out.println("default method");
		
	}
	
	public void m1(int j)
		{
			System.out.println("one parammetrized method");
			this.m();
			
		}
		
	public void m2(int a, int b)
	{
		System.out.println("two parammetrized method");
		
			}
	
	public void m3(int a1, int b1, int c1)
	{
		System.out.println("three parammetrized method");
		this.m4(3,6,7,5);
	}
		
	public void m4(int x, int y,int z, int t)
	{
		this.m1(4);
		this.m();
		System.out.println("four parammetrized method");
	
			}
	public static void main(String[] args) {
		methods ob1=new methods();
		ob1.m3(6,2,1);
	}
	
}
