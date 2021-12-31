package com.codewithme.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read(); // 읽을 수 없으면 IOException
            new SimpleDateFormat().parse("");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 예외를 유발한 메서드의 trace를 포함하고 있다.
            System.out.println("File does not exist");
        } catch (IOException e) {
            System.out.println("Could not read data");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
