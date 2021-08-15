package fileUtilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class FileWriter1 {

    private char[] cbuf = {'S', 'a', 'l', 'a', 'm'};
    private FileWriter yazici;

    // Constructor
    public FileWriter1(String fileName) throws IOException {

        yazici = new FileWriter(new File(fileName));
    }

    //tek tek yazir .
    public void tekTekYaz() throws IOException {
        yazici.write("\r\n");// bir setir asagiya kec
        for (int i = 0; i < cbuf.length; i++) {
            yazici.write(cbuf[i]);
        }
    }

    //blok seklinde yazir
    public void blokYaz() throws IOException {
        yazici.write("\r\n");
        yazici.write(cbuf);
    }

    //blokun mueyyen bir hissesini yazir
    public void mBlokYaz() throws IOException {
        yazici.write("\r\n");
        yazici.write(cbuf, 2, cbuf.length - 2);
    }

    public static void main(String[] args) throws IOException {

        FileWriter1 fwo = new FileWriter1("test2.txt");
        fwo.tekTekYaz();
        fwo.blokYaz();
        fwo.mBlokYaz();

        if (fwo.yazici != null) {
            fwo.yazici.close();
        }
    }
}
