package assignmentInheritance;

public class AS_Calcuate extends AS_EmployeDetails{
	
	int hra,pf;
	
	public void calculate()
	{
		hra=(basicpay*5)/100;
		pf=(basicpay*20)/100;
	}
}