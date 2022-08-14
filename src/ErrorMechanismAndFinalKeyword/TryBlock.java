package ErrorMechanismAndFinalKeyword;

import java.rmi.AccessException;

public class TryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			int i=10;
			int k=0;
			int j;
			
			j=i/k;
		}
	
		catch (ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
		System.out.println("script ended");	
		}
	}

}
