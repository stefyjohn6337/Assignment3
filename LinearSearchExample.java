package day5_Array;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int flag=0,num;
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a number : ");
			a[i]=s.nextInt();
		}
		System.out.println("Enter the number to be entered : ");
		num=s.nextInt();		
		for(int k:a) {
			if(k==num) {
				System.out.println("Record found.");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Record not found.");
	}

}
