package DP;

import java.util.Scanner;

public class MinimumDistanceBetweenTwoNumbers {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		
		int min =100;
		int i,start=0;
		for( i=0;i<n;i++){
			if(x==a[i]||y==a[i]){
				start = i;
				break;
			}
		}
		
		for(;i<n;i++){
			if(x==a[i]||y==a[i]){
				if(a[start]!=a[i] && ((i-start) < min)){
					min = i-start;
					start =i;
				}
				else{
					start =i;
				}
			}
		}
		System.out.println(min);
	}

}
