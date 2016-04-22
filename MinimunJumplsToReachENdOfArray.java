package DP;

import java.util.Scanner;

/*Given an array of integers where each element represents the max number of steps that can be made forward from that element. 
 * Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element). 
 * If an element is 0, then cannot move through that element.
	Example:
	Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
	Output: 3 (1-> 3 -> 8 ->9)
*/
public class MinimunJumplsToReachENdOfArray {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=in.nextInt();
		int index=0;
		int count =0;
		int max;
		for(int i=0;i<n;){
			int x = a[i];
			if(i+x<n){
				max=0;
				for(int j=i+1;j<=i+x;j++){
					if(max<a[j]){
						max=a[j];
						index=j;
					}
				}
				count=count+1;
				i=index;
			}
			else{
				count=count+1;
				i=n;
			}
		}
		System.out.println(count);
	}
}
