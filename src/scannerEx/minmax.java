package scannerEx;
import java.util.Arrays;
import java.util.Scanner;

public class minmax {
public static void main(String[] args) {
int size;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
size=sc.nextInt();
int a[]=new int[size];
for(int i=0;i<a.length;i++) {
	System.out.println("eneter the value of an array at location "+ i);
	a[i]=sc.nextInt();
}
//unsorted array
//sorted array
Arrays.sort(a);
System.out.println("enter the nth max and min value");
int n=sc.nextInt();
System.out.println("the nth min value is "+a[n-1]+" the nth max value is "+a[size-n]);
// 0 1 2 3 4 5 
// 1 2 3 4 5 6  3rd max    L-6 - n 

}
}

