package JavaFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int[] arr=new int[5];
//		
//       int[] obj= {111,12,12,14};
//       arr[0]=1;
//       arr[1]=2;
//       arr[2]=3;
//       arr[3]=4;
//       System.out.println(arr[2]);
//       for(int ob :obj)
//       {
//    	   System.out.println(ob);
//       }
	
	HashSet<String> hs=new HashSet<String>();
	hs.add("ram");
	hs.add("ramakrishna");
	hs.add("raman");
	hs.add("siva");
	
	
	
	System.out.println(hs);
	Iterator<String> sh=hs.iterator();
	while(sh.hasNext())
	{
		System.out.println(sh.next());
	}
	
	
	}

}
