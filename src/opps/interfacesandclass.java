package opps;

public class interfacesandclass implements interfaces,secondinterfacew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       interfaces obj1 =new interfacesandclass();
        obj1.Yellow();
       
      secondinterfacew obj2 =new interfacesandclass();
       obj2.method();
       
       interfacesandclass obj =new interfacesandclass();
          obj.Yellow();
           obj.green();
           obj.method();
           obj.method2();
           obj.method3();
		
        	obj.ram();
		
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("redlight");
	}

	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellowlight");
		}

	@Override
	public void green() {
		// TODO Auto-generated method stub
	System.out.println("grennlight");	
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("megthod");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("method3");
	}
   public void ram() {
	 
	   System.out.println("ram");
	   
   }
   
}

