package constructor;

public class Con1 extends con3 {
	
	
	
      public Con1()
    {
    	  System.out.println("ram is the best guy");
	}
      public Con1(String name)
      {
    	System.out.println(name);  
      }
      public Con1(int a)
      {
    	  System.out.println(a);
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Con1 obj=new Con1("ram" +1);
		Con1 r1=new Con1();
		
		
	
	}

}
