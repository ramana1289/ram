package constructor;

public class SuperKeyword extends ThisKeywords {
	
	String name="ram";
	
	public void namePrint()
	{
		super.namePrint();
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeyword obj1=new SuperKeyword();
		obj1.namePrint();
		obj1.namePrint();
	
		
	}

}
