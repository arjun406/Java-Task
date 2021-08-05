package Mypack;
import java.util.Scanner;

public class convertLetter {


			public static void main(String[] args) {
				try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
					String s=sc.nextLine();
					String[] arr=s.split(" ");
					String Last="";
					for(String x:arr) {
						Last=Last+convertLast(x)+" ";
					}
					System.out.println(Last);
				}

			}
			static String convertLast(String s)
			{
				char a=s.charAt(s.length()-1);
				char n=Character.toUpperCase(a);
				
				return s.substring(0,s.length()-1)+n;
			}

		}


