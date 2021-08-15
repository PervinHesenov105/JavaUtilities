/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaAll;

import java.util.StringTokenizer;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class StringToken2 {

    private StringTokenizer st;
    private String cumle = "Kod-zarafat-kimidir-İzah-etməli-olsan-pisdir";

    public StringToken2(boolean ayirici) throws Exception {
        if (ayirici) {
            st = new StringTokenizer(cumle, "-", true);
        } else {
            st = new StringTokenizer(cumle, "-");
        }

    }

    public void bolumle() throws Exception {
        if (st != null) {
            while (st.hasMoreElements()) {
                System.out.println("-->" + st.nextToken());
            }
        }
    }

    public static void main(String args[]) throws Exception {

        StringToken2 stoi = new StringToken2(true);
        stoi.bolumle();

        System.out.println("------------------");

        stoi = new StringToken2(false);
        stoi.bolumle();
    }
}
