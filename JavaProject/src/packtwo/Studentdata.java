package packtwo;

import java.util.ArrayList;

public class Studentdata {

	static ArrayList<student> studentlist = new ArrayList<student>();

	static

	{
//		ArrayList al = new ArrayList();
//
//		al.add(101);
//		al.add("vandan");

		student s1 = new student(101, "vandan");

		studentlist.add(s1);

	}

}
