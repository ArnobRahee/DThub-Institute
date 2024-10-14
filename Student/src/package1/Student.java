package package1;

public class Student {
  public Student(int a) {
	  this(12,14);
	  System.out.println("One parametrized constructor");
  }
  public Student() {
	  this(12,14,15);
	  System.out.println("Default constructor");
  }
  public Student(int a, int b, int c) {
	  System.out.println("Three parametrized constructor");
  }
 public Student(int a, int b) {
	this();
	 System.out.println("Two parametirzed constructor");
 }
  public static void main(String[] args) {
	Student deepak=new Student(123);
	
}
}
