package opps;

public class MathodOverloading {
	
	public void sub(int a, int b)
	{
	   int c=a-b;
	   System.out.println(c);
	}
	public void sum(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathodOverloading obj = new MathodOverloading();
		obj.sub(2, 3);
		obj.sum(1, 2, 3);
		
	}

}
