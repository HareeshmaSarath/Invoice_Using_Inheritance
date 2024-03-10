package assignmentInheritance;

public class AS_SalaryInvoice extends AS_Calcuate{
	
	int total;

	public static void main(String[] args) {
		
		AS_SalaryInvoice ob=new AS_SalaryInvoice();
		ob.getEmployeDetails();
		ob.calculate();
		ob.totalSlary();
		ob.paySlip();	
	}
	
	public void totalSlary()
	{
		total=basicpay+hra+bonus-(pf+deduct);
	}
	
	public void paySlip()
	{
		System.out.println();
		System.out.println("          Company Name         ");
		System.out.println("       Salary Slip For March      ");
		System.out.println("************************************");
		System.out.println("Name        : "+ename);
		System.out.println("Desiganation: Software Engineer");
		System.out.println("------------------------------------------");
		System.out.print("  Earnings ");
		System.out.println("            Deduction  ");
		System.out.println("------------------------------------------");
		System.out.print("Basic Pay: "+basicpay);
		System.out.println("        PF: "+pf);
		System.out.print("HRA      : "+hra);
		System.out.println("         Deduction: "+deduct);
		System.out.println("Bonus    : "+bonus);
		System.out.println("------------------------------------------");
		System.out.print("Gross Salary: "+(basicpay+hra+bonus));
		System.out.println("    Total Deduction: "+(pf+deduct));
		System.out.println("------------------------------------------");
		System.out.print("  NetPay ");
		System.out.println("                "+total+"  ");
		System.out.println("------------------------------------------");
	}
}