package javaAll;

import java.util.StringTokenizer;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class StringToken1 {

    private StringTokenizer st;
    private String cumle = "Perfect Course Proqramlasdirma kurslari";

    public StringToken1() throws Exception {
        st = new StringTokenizer(cumle);
    }

    public void bolumle() throws Exception {
        if (st != null) {
            while (st.hasMoreElements()) {
                System.out.println("--> " + st.nextToken());
            }
        }
    }

    public static void main(String args[]) throws Exception {

        StringToken1 stob = new StringToken1();
        stob.bolumle();

    }
}
