package School;

import java.util.HashMap;
import java.util.Scanner;

public class methodclass {
	HashMap<Integer, String> mapone = new HashMap<Integer, String>();

	void addmethod() {
		Scanner rnumadd = new Scanner(System.in);
		System.out.println("Enter roll number of student that you want to add");

		int rnum = rnumadd.nextInt();
		Scanner namescanner = new Scanner(System.in);

		System.out.println("Enter name  of student that you want to add");

		String sname = namescanner.nextLine();

		mapone.put(rnum, sname);

		System.out
				.println("Details has been added sucesfully with rollnumber " + rnum + " and student name is " + sname);

	}

	void readmethod() {

		Scanner rnumread = new Scanner(System.in);
		System.out.println("Enter roll number of student whose details you wan to see");

		int rnum = rnumread.nextInt();
		
System.out.println(mapone.containsKey(rnum));

		System.out.println(mapone.get(rnum) + "is the name of student with roll number" + rnum);

	}

	void deletedmethod() {

		Scanner rnumdel = new Scanner(System.in);
		System.out.println("Enter roll number of student whose details you wan to delete");

		int rnum = rnumdel.nextInt();

		System.out.println("Details deleted successfuly with roll number " + rnum+" with name "+mapone.get(rnum));
		mapone.remove(rnum);

	}
	
	

}
