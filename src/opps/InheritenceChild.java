package opps;

public class InheritenceChild extends InheritenceParent {
	public void bikeBody()
	{
		System.out.println("made of wood");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       InheritenceChild  obj =new InheritenceChild();
       obj.bikeBody();
       obj.bikeCc();
       obj.bikeCost();
       
	}

}
