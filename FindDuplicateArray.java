package com.bms;

/*Write a Java Program to find duplicate elements in given Array?

Input:  1, 2, 5, 5, 6, 6, 7, 2

Output:  2, 5, 6
 */

public class FindDuplicateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 5, 6, 6, 7, 2};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])&(i!=j)) {
					System.out.println(arr[j]);
				}
			}
		}
	}

}
