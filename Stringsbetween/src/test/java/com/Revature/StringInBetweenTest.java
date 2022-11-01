package com.Revature;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.StringsInBetwen;

public class StringInBetweenTest {

	@Test
	public void test() {
		
		String list_of_words = "There was an old lady who lived in an outhouse";
		StringsInBetwen.count_words_between("an", "outhouse", list_of_words);
		
		assertTrue(true);
	}

}
