package day5_Array;

import java.util.Scanner;

public class MaximumElementInArray {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a number : ");
			a[i]=s.nextInt();
		}
		int max=a[0];
		for(int k:a) {
			if(max<k)
				max=k;
		}
		System.out.println("Largest Number : " + max);
	}

}
