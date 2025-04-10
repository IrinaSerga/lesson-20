package com.dmdev.lesson22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {

        //File file = new File(String.join("resources", "test.txt"));
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {


            byte[] bytes = new byte[(fileInputStream.available())]; //available() - размер файла, лежащего на жествком диске
            int counter = 0;
            byte currentByte;
            while ((currentByte = (byte) fileInputStream.read()) != -1) {
                bytes[counter++] = currentByte;

            }
            String stringValue = new String(bytes);
            System.out.println(stringValue);


//            int read = fileInputStream.read();  // считывать понемногу
//            byte[] bytes = fileInputStream.readAllBytes(); // считать целиком
//
//
//            String stringValue = new String(bytes);
//            System.out.println(stringValue);
        }
    }
}
