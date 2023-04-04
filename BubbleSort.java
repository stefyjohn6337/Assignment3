package day6;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter a number : ");
			a[i]=s.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array : ");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
