package package1;
import java.util.*;
public class Pyramid {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of lines");
	int n=sc.nextInt();
	for(int i=1; i<=n; i++) {
		for(int space=0; space<=n-i; space++) {
			System.out.print(" ");
		}
		for(int star=1; star<=((2*i)-1); star++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
