package JavaFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ListClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> arr=new ArrayList<String>();
		
		arr.add("ram");
		arr.add("sekhar");
		arr.add("siva");
		arr.add("rammmmmm");
		arr.add(0, "a");
		arr.add(1, "b");                             //add throw index value
		System.out.println(arr);
		arr.remove(5);                               //remove
		System.out.println(arr);
		System.out.println(arr.indexOf("siva"));      //to find which index of the string
		
		   Iterator<String>  it=arr.iterator();      //Iterator
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }

		   System.out.println(arr.size());
	}

}
