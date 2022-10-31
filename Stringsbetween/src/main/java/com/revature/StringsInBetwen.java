package com.revature;

public class StringsInBetwen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String list_of_words = "There was an old lady who lived in an outhouse";
		count_words_between("lady", "outhouse", list_of_words);  // 4 
		count_words_between("an", "outhouse", list_of_words);    // 6
		System.out.println(count_words_between("lady","outhouse","There was an old lady who lived in an outhouse"));
		

	}

	private static int count_words_between(String firstWord, String secondWord, String list_of_words) {
		// TODO Auto-generated method stub
		char charFirstWord= firstWord.charAt(0);
		char charSecondWord= secondWord.charAt(0);
		
		boolean isFirstWord= false;
		boolean isSecondWord= true;
		
		int spaceCount= 0;
		
		for(int i =0; i<list_of_words.length();i++) {
			
			if( list_of_words.charAt(i) == charFirstWord && isFirstWord == false  ) {
				int matchinChars= 1;
				for( int index =1; index<firstWord.length(); index++ ) {
					if ( list_of_words.charAt(i + index) == firstWord.charAt(index) ) { 
						matchinChars++;  
					}  
				}
				if(matchinChars == firstWord.length()) {
					isFirstWord = true;
				} 
			}
			
			
			if( list_of_words.charAt(i) == charSecondWord  && isSecondWord == true ) {
				int matchinChars= 1;
				for( int index =1; index<secondWord.length(); index++ ) {
					if ( list_of_words.charAt(i + index) == secondWord.charAt(index) ) { 
						matchinChars++;  
					}  
				}
				if(matchinChars == secondWord.length()) {
					isSecondWord = false;
				} 
			}
			
			 
			if(isFirstWord && isSecondWord) {
				if (list_of_words.charAt(i) == ' ') {
					spaceCount++; 
				}
			}
		}
		
		return spaceCount-1;
		
	}
	

	
	
	

}
