package com.dmdev.hometask;

import java.io.IOException;
import java.nio.file.Path;

/**
 * Задача:
 * Считать оба CSV файла и объединить их по полю ID в один result.csv, где будут следующие поля: ID,NAME,PRICE.
 * Желательно реализовать доп. функционал:
 * Если для каких-то ID не будет значений в обоих файлах, то записать их в один файл errors.csv, где будет лишь одно поле ID.
 */

public class FileRunner {

    public static void main(String[] args) throws IOException {
        // Исходные файлы
        Path pathPrice = Path.of("resources", "items-price.csv");
        Path pathName = Path.of("resources", "items-name.csv");

        // Результирующий
        Path result = Path.of("resources", "result.csv");
        //Path error = Path.of("resources", "errors.csv");

        CSVFileWriter.writeResultCSVFile(pathPrice, pathName, result);








    }
}
