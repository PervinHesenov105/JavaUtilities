
package javaAll;

/**
 *
 * @author Parvin_Hasanov
 */
public class AsciiCreator {

   
    public static void main(String[] args) {
        System.out.println("<HTML border='1'>");
		System.out.println("<TR>");
		boolean ok = false;
		
		for(int i=0; i<128; i++) {

			byte b = (byte)i ; 
			System.out.println("<TD>");
			System.out.println(b + " = " + (char)b);
			System.out.println("</TD>");
			
			if( ((i%9) == 0) && (i!=0)) {
				System.out.println("</TR>");
				ok = true ;
			} 

			if(ok) {
			   	ok = false;
				System.out.println("<TR>");
			}
		}
		
		System.out.println("</HTML>");
	}
    }
    

