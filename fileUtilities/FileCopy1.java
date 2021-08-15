package fileUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class FileCopy1 {
//bir fayli diger fayla kopyalamaq . 
    public static void copyFile(String fromFile, String toFile) throws IOException {
        InputStream oxuyucu = null;
        OutputStream yazici = null;
        try {
            oxuyucu = new FileInputStream(fromFile);
            yazici = new FileOutputStream(toFile);
            long baslamaZamani = new Date().getTime();
            while (true) {
                int data = oxuyucu.read();
                if (data == -1) {
                    break;
                }
                yazici.write(data);
            }
            long bitisZamani = new Date().getTime() - baslamaZamani;
            System.out.println("Toplam kecen vaxt:" + bitisZamani + "ms");
            oxuyucu.close();
            yazici.close();
        } finally {
            if (oxuyucu != null) {
                oxuyucu.close();
            }
            if (yazici != null) {
                yazici.close();
            }
        }
    }

    public static void main(String args[]) throws IOException {
        String[] fs = {"pwo.txt", "test.txt"};
        if ((fs[0] == null) && (fs[1] == null)) {
            System.out.println("Daxil olunan parametrler yalnisdir!");
            System.exit(-1);
        }
        copyFile(fs[0], fs[1]);

    }
}
