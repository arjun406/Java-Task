package Mypack;
 import java.util.Scanner;
public class Primenumber {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       int n;
		       try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the number of elements you want:");
				   n=sc.nextInt();
				   int a[]=new int[10];
				   System.out.println("Enter the number of array Elements:");
				   for(int i=0;i<n;i++)
				   {
					   a[i]=sc.nextInt();
					   
				   }
				   System.out.println("Array Elements are:");
				   for(int i=0;i<n;i++)
				   {
					   if(a[i]%2 !=0)
					   {
					   System.out.println(a[i]);
					   }
				   }
			}
			}


	}

