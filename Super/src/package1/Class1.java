package package1;

public class Class1 {
  public Class1() {
	  this(5,6,7);
	  System.out.println("Parent Default constructor");
	  
  }
  public Class1(int a) {
	  this(9,6);
	  System.out.println("Parent one parameterized constructor");
  }
  public Class1(int a,int b) {
	  this();
	  System.out.println("Parent two parameterized constructor");
	  
}
  public Class1(int a,int b, int c) {
	  
	  System.out.println("Parent three parameterized constructor");
	 
}
  public void m1() {
	 
	  System.out.println("Parent default method");
	  m3(8,9,0);
  }
  public void m2(int a, int b) {
	
	  System.out.println("Parent two parameterized method");
	  if(a==7) {
		  m1(); 
	  }
	 
  }
  public void m3(int a, int b,int c) {
	
	  System.out.println("Parent three parameterized method");
	  m4(7);
  }
  public void m4(int a) {
	  System.out.println("Parent one parameterized method");
	 m2(6,5);
  }
}
