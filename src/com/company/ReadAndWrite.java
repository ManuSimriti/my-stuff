package com.company;

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\19052\\Documents\\newFile\\myFile.txt"));
            writer.write("This is the file which will be created");
            writer.write("I want to add few more lines to it");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\19052\\Documents\\newFile\\myFile.txt"));
           String s;
           while ((s = reader.readLine()) != null){
               System.out.println(s);
           }
           reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
