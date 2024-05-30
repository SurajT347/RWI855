package loop;

class B {
	
	public static void main(String[] args) {
		 System.out.println("==main==");
	}

	  static {
		  
		  for(int i=0; i<=5; i++) {
			  for(int j=0;j<=i;j++) {
				  
				  System.out.print("*");
			  }
			  System.out.println();
		  }
	  }
}
