
public class Text extends Employee{
	
	int Salary;
	String position;
	

public Text(int empId, String empNm, int salary, String position) {
	super(empId, empNm);
		Salary = salary;
		this.position = position;
	}


public static void main(String[] args) {
	
	
	Text ta1 = new Text(15,"Suraj",15000,"Java Developer");
	Text ta2 = new Text(16,"Sandip",16000,"Python Developer");
	System.out.println(ta1.EmpId);
	System.out.println(ta1.EmpNm);
	System.out.println(ta1.Salary);
	System.out.println(ta1.position);
	
	System.out.println("************************");
	
	System.out.println(ta2.EmpId);
	System.out.println(ta2.EmpNm);
	System.out.println(ta2.Salary);
	System.out.println(ta2.position);
	 
	 
	
}
		
		
	

}
