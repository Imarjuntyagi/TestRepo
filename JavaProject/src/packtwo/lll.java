package packtwo;

import java.util.HashMap;

public class lll {

	public static void main(String[] args) {

		HashMap<Integer, String> happy=new HashMap<Integer, String>();
		
happy.put(11, "rahul");
	happy.put(10, "om");
	happy.put(12, "kk");

		
		System.out.println(happy);
		System.out.println(happy.get(10));
		happy.remove(11);
		System.out.println("after remove"+happy);

		
		
	}
 
}
