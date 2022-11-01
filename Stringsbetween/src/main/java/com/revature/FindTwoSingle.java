package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTwoSingle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 2, 1, 4, 4, 6, 7, 8, 7, 6, 9, 9};
		
//		int[] arr= {2, 4, 6, 8, 10, 2, 6, 10};
		int[] arranswer= findTwoSingles(arr);
		
		for (int a : arranswer)  System.out.print(" "+a);
	}

	public static int[] findTwoSingles(int[] arr) {
		
		int[] answer= new int[2];
		int answerIndex= 0;
		
		List<Integer> al = new ArrayList<Integer>();
		
		for (int a : arr)  al.add(a); 
		
		Collections.sort(al);
		 
		for(int i = 0; i<al.size();i++) {
			int current= al.get(i);
	  
			if(i==0) {
				if ( ! (current == al.get(i+1))) {
					//if gets here i index is single
					answer[answerIndex]= current;
					answerIndex++;
				}
			}else if(i== al.size()-1) {
				if ( ! (current == al.get(i-1))) {
					//if gets here i index is single
					answer[answerIndex]= current;
					answerIndex++;
				}
			}else {
				if (!(current ==al.get(i+1)) && !(current ==al.get(i-1) ) ) {
					answer[answerIndex]= current;
					answerIndex++;
				}
			}
			
		}
		return answer;
		
		
		
	}

}
