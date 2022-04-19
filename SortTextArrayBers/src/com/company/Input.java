package com.company;

import com.sun.jdi.IntegerValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Input {
    public static void input() throws IOException {
        try (FileReader reader = new FileReader("C:\\Код\\Bers.txt")) {
            int c;
            char[] Arr = new char[256];
            while ((c = reader.read(Arr)) > 0) {
                if (c < 256) {
                    Arr = Arrays.copyOf(Arr, c);}}
            Arrays.sort( Arr);
            System.out.println( Arr);
            FileWriter writer = new FileWriter("C:\\Код\\Bers.txt");
            for (int i = 0; i < Arr.length; i++) {
                writer.write(Arr[i]);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}