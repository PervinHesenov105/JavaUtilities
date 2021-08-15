
package javaAll;

import java.io.IOException;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class UnicodeSearch {
    
    public static StringBuffer unicodeFind(String word) {

		char[] ac = word.toCharArray();
		int iValue;
		String s = null;
		StringBuffer sb = new StringBuffer();

		for( int ndx = 0; ndx < ac.length; ndx++ ) {
			iValue = ac[ndx];

			if( iValue < 0x10 ) {
				s = "\\u000";
			} else
				if( iValue < 0x100 ) {
				s = "\\u00";
			} else
				if( iValue < 0x1000 ) {
				s = "\\u0";
			}

			sb.append( s + Integer.toHexString( iValue ) );
		} 
		return sb;

	}

	public static StringBuffer unicodeFind(char[] word) {

		char[] ac = word;
		int iValue;
		String s = null;
		StringBuffer sb = new StringBuffer();

		for( int ndx = 0; ndx < ac.length; ndx++ ) {
			iValue = ac[ndx];

			if( iValue < 0x10 ) {
				s = "\\u000";
			} else
				if( iValue < 0x100 ) {
				s = "\\u00";
			} else
				if( iValue < 0x1000 ) {
				s = "\\u0";
			}

			sb.append( s + Integer.toHexString( iValue ) );
		} // end for
		return sb; 
	}
        public static void main(String[] args) throws IOException {
		
		String characters = "abcð" ;
		System.out.println(UnicodeSearch.unicodeFind(characters) );
		
		characters = new String( characters.getBytes("ISO8859-9"),"ISO8859-1" );
		System.out.println(UnicodeSearch.unicodeFind(characters) );
		
		characters = new String( characters.getBytes("ISO8859-1"),"ISO8859-4" );			
		System.out.println(UnicodeSearch.unicodeFind(characters) );
		
		characters = new String( characters.getBytes("ISO8859-4"),"ISO8859-9" );
		System.out.println(UnicodeSearch.unicodeFind(characters) );
	}
}
