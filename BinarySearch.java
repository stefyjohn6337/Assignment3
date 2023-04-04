package day6;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a number : ");
			a[i]=s.nextInt();
		}
		System.out.println("Enter a number to be searched : ");
		int num=s.nextInt();
		int f=0;
		int l=a.length-1;
		int mid;
		while(f<=l) {
			mid=(f+l)/2;
			if(a[mid]==num) {
				System.out.print("Record found");
				break;
			}
			else if(a[mid]<num)
				f=mid+1;
			else
				l=mid-1;
				
		}
		if(f>l)
			System.out.println("Record not found");

	}

}
