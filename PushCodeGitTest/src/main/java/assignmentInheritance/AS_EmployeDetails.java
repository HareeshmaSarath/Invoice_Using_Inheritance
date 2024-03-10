package assignmentInheritance;
import java.util.*;
public class AS_EmployeDetails {
	
	String ename;
	int basicpay,deduct,bonus;
	
	public void getEmployeDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		ename=sc.nextLine();
		System.out.println("Enter Basic Pay:");
		basicpay=sc.nextInt();
		System.out.println("Enter The Deduction:");
		deduct=sc.nextInt();
		System.out.println("Enter The Bonus:");
		bonus=sc.nextInt();
	}
}