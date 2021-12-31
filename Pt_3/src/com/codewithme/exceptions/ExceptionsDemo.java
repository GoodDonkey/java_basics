package com.codewithme.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
            var value = reader.read(); // 읽을 수 없으면 IOException
            reader.close(); // close로 자원을 반납해야
        } catch (IOException e) {
            System.out.println("Could not read data");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
