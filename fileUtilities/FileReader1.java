/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileUtilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class FileReader1 {

    //.txt fayldan Stringi oxumaq
    public static String readFromFile(String filename) throws IOException {
        try (InputStream in = new FileInputStream(filename);
                InputStreamReader r = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(r);) {
            String line = null;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result = result + line + "\n";
            };
            return result;
        }

    }

    //Object fayli oxumaq
    public static Object readObjectFromFile(String name) throws Exception {
        Object obj = null;

        FileInputStream ft = new FileInputStream(name);

        try (ObjectInputStream in = new ObjectInputStream(ft)) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }
    //.byte lari oxumaq >> meselen  .png fayli   (NIO FILE)

    public static byte[] NIOreadBytes(String fileName) throws Exception {
        Path filePath = Paths.get(fileName);
        byte[] byteArray = Files.readAllBytes(filePath);
        return byteArray;
    }

    //.byte lari oxumaq >> meselen  .png fayli   (IO FILE)
    public static byte[] readBytes(String fileName) throws Exception {
        File fi = new File(fileName);

        try (FileInputStream fis = new FileInputStream(fi);) {
            byte[] byteArray = new byte[(int) fi.length()];
            fis.read(byteArray);
            return byteArray;
        } catch (Exception ex) {
            return null;
        }
    }

}
