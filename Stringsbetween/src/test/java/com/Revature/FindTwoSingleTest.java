package com.Revature;

import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.revature.FindTwoSingle;

class FindTwoSingleTest {

	@Test
	public void example1() { 
		int[] arr= {2, 4, 6, 8, 10, 2, 6, 10};
		int[] answer= {4,8};
		int[] returned= FindTwoSingle.findTwoSingles(arr); 
		Assertions.assertEquals(answer[0], returned[0]);
		Assertions.assertEquals(answer[1], returned[1]);
		 
	}
	
	@Test
	public void example2() { 
		int[] arr= {1, 2, 3, 2, 1, 4, 4, 6, 7, 8, 7, 6, 9, 9};
		int[] answer= {3,8};
		int[] returned= FindTwoSingle.findTwoSingles(arr); 
		Assertions.assertEquals(answer[0], returned[0]);
		Assertions.assertEquals(answer[1], returned[1]);
		 
	}

}
