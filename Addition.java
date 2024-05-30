
public class Addition extends MainC {
	int a=10;
	int b=5;
	public void Add() {
		
		System.out.println("Addition of two no "+(a+b));
	}

	  public static void main(String[] args) {
		  MainC sb= new Addition();
		 sb.Add();
		 sb.print();
		
	}
}
