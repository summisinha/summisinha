package scannerEx;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of rows");
	int rows=sc.nextInt();
	System.out.println("enter the no of cols");
	int cols=sc.nextInt();
	int a[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println("enter the value of "+ i + " rows and "+ j+" col");
			a[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}

}
	
}



