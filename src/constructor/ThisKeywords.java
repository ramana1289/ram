package constructor;

public class ThisKeywords {
	
	String name="krishna";
	
	public void namePrint()
	{
		String name="ram";
		int a=10;
		System.out.println(a);
		System.out.println(name);
		System.out.println(this.name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeywords obj=new ThisKeywords();
		obj.namePrint();
			
	}

}
