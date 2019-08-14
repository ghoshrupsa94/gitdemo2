//Write a program to reverse a String


import java.util.Scanner;

public class reverseofstring {

	public static void main(String[] args) 
	{

System.out.println("Enter a string to reverse");
Scanner sc = new Scanner(System.in);
String str=sc.nextLine();
StringBuilder sb = new StringBuilder(str);
System.out.println("reverse String is:");
System.out.println(sb.reverse().toString());

	}

}
