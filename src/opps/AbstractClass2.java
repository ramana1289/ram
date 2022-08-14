package opps;

public class AbstractClass2 extends AbstractClass1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AbstractClass2 obj=new AbstractClass2();
	obj.colour();
	obj.House();
	obj.design();
	AbstractClass1 obj1=new AbstractClass2();
	obj.House();
	obj.colour();

	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("colour add to the house");
	}

}
