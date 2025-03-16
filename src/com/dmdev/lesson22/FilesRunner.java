package com.dmdev.lesson22;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesRunner {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "output2.txt");
        //try (BufferedWriter fileOutputStream = Files.newBufferedWriter(file)) { //append = true -  не перезаписіваем, а дописываем в конец
        Files.write(path, List.of("Hello World!", "Java"));


//            String value = "Hello World";
//            fileOutputStream.write(value.getBytes());
//            fileOutputStream.write(System.lineSeparator().getBytes());
        // }


    }
}
