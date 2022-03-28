package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt"));
            writer.write("This is the file which will be created");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
