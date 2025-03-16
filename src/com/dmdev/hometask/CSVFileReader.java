package com.dmdev.hometask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVFileReader {

    public static Map<String, String> readFromFileToMap(Path path) throws IOException {

        try (Stream<String> linesPrice = Files.lines(path)) {
            return linesPrice.skip(1) // заголовки
                    .map(line -> line.split(",")) // разделяем по запятой на значения
                    .collect(Collectors.toMap(field -> field[0], field -> field[1]));// только первый и второй столбец
        }
    }

}
