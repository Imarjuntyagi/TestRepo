package School;

import java.util.Scanner;

//import sun.tools.tree.ContinueStatement;

public class mainclass extends methodclass {

	public static void main(String[] args) {

//
		methodclass classobject = new methodclass();

		mainclass classobject2 = new mainclass();
		// classobject2.userinput();
		int ll = classobject2.userinput();

//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Press 1 to enter new student details  with roll number and student name \n" + 
//				"	Press 2 to see details  of existing student from  roll number \n" + 
//				"	Press 3 to delete details  of existing student from  roll number \n" + 
//				"	Press 4 to terminate the program");
//			
//		int ll = sc.nextInt();

		// for(int i=0;i<5;i++)
		boolean i = true;

		while (i) {

			switch (ll)

			{
			case 1:

				classobject.addmethod();
				
				ll=classobject2.userinput();
				continue;

			case 2:
				classobject.readmethod();
				ll=classobject2.userinput();
				continue;

			case 3:
				classobject.deletedmethod();
			 ll=classobject2.userinput();
				continue;
			case 4:
				System.out.println("Program Terminated as per your command");
				i = false;
				System.exit(0);

			default:
				System.out.println("Please enter number between 1 and 4");
				classobject2.userinput();
				i = false;

			}

		}
	}

	int userinput()

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Press 1 to enter new student details  with roll number and student name \n"
				+ "	Press 2 to see details  of existing student from  roll number \n"
				+ "	Press 3 to delete details  of existing student from  roll number \n"
				+ "	Press 4 to terminate the program");

		int ll = sc.nextInt();

		return ll;

	}

}
