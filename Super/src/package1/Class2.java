package package1;

public class Class2 extends Class1{
public Class2() {
	this(8,9,0);
	System.out.println("Child Default constructor");
}
public Class2(int a) {
	this(7,8);
	System.out.println("Child one parametirized constructor");
	
}
public Class2(int a,int b) {
	super(12);
	System.out.println("Child two parametirized constructor");
	
}

public Class2(int a,int b,int c) {
	this(9);
	System.out.println("Child three parametirized constructor");
}
public static void main(String[] args) {
	Class2 obj=new Class2();
	System.out.println("**********************");
	obj.m2(7,9);
	obj.m1();
}
}
