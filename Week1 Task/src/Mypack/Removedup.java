package Mypack;

import java.util.Scanner;

public class Removedup {

            static int RemoveDuplicates(int ar[],int n)
			{
				if(n==0||n==1)
				  return n;
				int[] temp=new int[n];
				
				int j=0;
				for(int i=0;i<n-1;i++)
					if(ar[i]!=ar[i+1])
						temp[j++]=ar[i];
					temp[j++]=ar[n-1];
					
					for(int i=0;i<j;i++)
						ar[i]=temp[i];
					return j;
				}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter the number of Elements:");
		         int n=sc.nextInt();
		         int ar[]=new int[n+1];
		         System.out.println("Enter the array Elements:");
		         for(int i=0;i<n;i++)
		         {
		        	 ar[i]=sc.nextInt();
		         }
		         n=RemoveDuplicates(ar,n);
		         System.out.println("Array after removing the elements:");
		         for(int i=0;i<n;i++)
		         {
		        	 System.out.println(ar[i]+" ");
		         }
			}
}	



