package fileUtilities;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class FileReaderPartitioner {

    public FileReader oxuyucu;
    public StreamTokenizer st;

    public FileReaderPartitioner() throws IOException {

        oxuyucu = new FileReader("test.txt");
        st = new StreamTokenizer(oxuyucu);
        st.ordinaryChar('*');
        st.ordinaryChar('-');
        st.ordinaryChar('.');
        st.ordinaryChar('/');
    }

    public void bol() throws IOException {

        while (st.nextToken() != StreamTokenizer.TT_EOF) {

            switch (st.ttype) {
                case StreamTokenizer.TT_EOL:
                    break;
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Number geldi:" + st.nval);
                case StreamTokenizer.TT_WORD:
                    if (st.sval != null) {
                        System.out.println("String geldi:" + st.sval);
                    }
            }
        }
    }

    public static void main(String args[]) throws IOException {

        FileReaderPartitioner b = new FileReaderPartitioner();
        b.bol();
        if (b.oxuyucu != null) {
            b.oxuyucu.close();
        }
    }

}
