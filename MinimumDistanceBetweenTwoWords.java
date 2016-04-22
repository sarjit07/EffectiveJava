package DP;

import java.util.Scanner;
//order of two words is not preserved here.

public class MinimumDistanceBetweenTwoWords {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String[] strArray = {"hello","are","hi","you"};
		String str1 = "hello";
		String str2 = "you";
		int i,start=0,min=100;
		for( i=0;i<strArray.length;i++){
			if(strArray[i].equals(str1)||strArray[i].equals(str2)){
				start = i;
				break;
			}
		}
		
		for(;i<strArray.length;i++){
			if(strArray[i].equals(str2)||strArray[i].equals(str2)){
				if(strArray[i]!=strArray[start] &&  i-start<min){
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
