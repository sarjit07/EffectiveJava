package DP;

import java.util.Scanner;

public class MinimumNumberOfCoins {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num  = in.nextInt();
		int n = in.nextInt();
		int a[] = new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=in.nextInt();
		int count =0;
		int min = 100;
// this is also a correct solution, seeing another solution		
//		for(int j = n-1;j>=0;j--){
//		int number =num;
//		count =0;
//			for(int i=j;i>=0;){
//			if(number/a[i]>0){
//				if(number%a[i]==0){
//					count = count + number/a[i];
//					break;
//				}
//				else{
//				number = number%a[i];
//				count++;
//				}
//			}
//			else
//				i--;
//		}
//		if(count<min){
//			min =count;
//		}
//		}
//		System.out.println(min);
		
		/*
		 * 
		 *o(num*n) where  n = no. of coins and num = value
		 * or another solutions 
		 */
		
		int matrix[][] = new int[num][n];
		for(int j=0;j<=num;j++){
			for(int i=1;i<=n;i++){
				if(j>=a[i]){
					matrix[i][j] =  Math.min(matrix[i-1][j], 1+matrix[i][j-a[i]]);
				}
				else
				{
					matrix[i][j]= matrix[i-1][j];
				}
			}
		}
		System.out.println(matrix[num][n]);
	}
}

