package DP;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++)
			a[i] = in.nextInt();
		
		int max=0,sum=a[0],start=0,end=0;
		for(int i=1;i<n;i++){
			sum =Math.max(sum+a[i], a[i]);
			if(sum == a[i]){
				start =i;
			}
			if(max<sum){
				max= sum;
				start = start;
				end =i;
			}
		}

		System.out.println(max);
		System.out.println("start = "+start);
		System.out.println("end = "+end);
		
	}
}
