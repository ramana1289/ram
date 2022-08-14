package JavaFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hm =new HashMap<String,String>();
		
			
		hm.put("username1", "ram");
		hm.put("username2", "krishna");
		hm.put("username3", "ramana");
		
		System.out.println(hm);
		hm.remove("username2", "krishna");
        System.out.println(hm);
        System.out.println(hm.get("username1"));
        Set sn = hm.entrySet();
        Iterator it =sn.iterator();
        while(it.hasNext())
        	
        {
        	Map.Entry mp=(Map.Entry)it.next();
        	System.out.println(mp.getValue());
        }
        
	}

}
