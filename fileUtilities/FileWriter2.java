package fileUtilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class FileWriter2 {

    //Stringi .txt fayla yazmaq ucun metod
    public static void writeIntoFile(String filename, String text) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename));) {
            bw.write(text);
        }
    }

//Obyekti fayla yazdirmaq (.obj)
    public static void writeObjectToFile(Serializable object, String name) throws Exception {
        try (FileOutputStream fout = new FileOutputStream(name);
                ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        }
    }

    //.byte lari yazdirmaq >> meselen  .png fayli (NIO FILE)
    public static void NIOwriteBytes(byte[] data, String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        Files.write(filePath, data);

    }

    //.byte lari yazmaq >> meselen  .png fayli   (IO FILE)
    public static void writeBytes(String fileName, byte[] data) throws Exception {
        try (FileOutputStream fops = new FileOutputStream(fileName);) {
            fops.write(data);
        }

    }

}
