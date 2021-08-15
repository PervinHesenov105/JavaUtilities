/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hesenovpervin105@gmail.com
 */
public class CopyMp3 {
    private static ArrayList<Integer> content=new ArrayList<>();

    public static void fileRead(String musicName){
        try {
            FileInputStream in=new FileInputStream(musicName);
            int read;
            while((read=in.read())!=-1){
                content.add(read);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(String musicName) {

        try {
            FileOutputStream out = new FileOutputStream(musicName);
            for (int value : content) {
                out.write(value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
    public static void main(String[] args) {

        fileRead("Karabakh - Azerbaijan [Trip-Hop - Bass Boost].mp3");
        copy("MyMusic.mp3");



    }
    }

