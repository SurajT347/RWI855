
public class Student {
	int rollno;
	String name;
	int age;
	String Std;
	
	public void displayInfo(int rollno) {
		System.out.println(rollno);
	}
	
	public void displayInfo(String name) {
		System.out.println(name);
	}
	public void displayInfo(int age,String Std) {
		System.out.println(age);
		System.out.println(Std);
	}
	
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Student st1 = new Student();
         st.displayInfo(12);
         st.displayInfo("Vishal");
         st.displayInfo(18, "12th");
         System.out.println("*************");
         st1.displayInfo(13);
         st1.displayInfo("Sujit");
         st1.displayInfo(17,"11th" );
         
	}

}
