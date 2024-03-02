package Date27_First_assignment;

public class Constructor {

	public void Constructor()
	{
		
		System.out.println("default parametrized");
		this.Constructor(60);
	}
	
	public void Constructor(int a)
	{
		System.out.println("One parametrized");
		this.Constructor(60,9);
	}
	
	public void Constructor(int c, int b)
	{
		System.out.println("two parametrized");
		this.Constructor(10,3,4,1);
	}
	
	public void Constructor(int x, int y,int z)
	{
		System.out.println("three parametrized");
		this.Constructor();
	}
		
	public void Constructor(int l, int m,int n, int O)
	{
		System.out.println("Four parametrized");
	}
	
	public static void main(String[] args) {
		Constructor ob=new Constructor();
		ob.Constructor(4,1,77);
		
	}
	
}
