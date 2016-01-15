package DP;

import java.util.Scanner;

public class MaxProductWhenCuttingRope {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int max[] = new int[length+1];
		
		if(length <2) System.out.println(0);;
		if(length == 2) System.out.println(1);
		if(length==3) System.out.println(2);
		else{
		max[0]=0;
		max[1] = 1;
		max[2] = 2;
		max[3] = 3;
		int product;
		for(int i=4;i<=length;i++){
			product =0;
			int max1 =0;
			for(int j = 1;j<=i/2;j++){
				product = max[j]*max[i-j];
				if(max1<product){
					max1=product;
				}
			}
			
			max[i]=max1;
			
		}
		System.out.println(max[length]);
		for(int i=1;i<=length;i++)
			System.out.println(max[i]);
		}
		
	}
}
