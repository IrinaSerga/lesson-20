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

//            что значат эти цифры? индексы можно вынести в константы и назвать соответствующе
//            private static final int READ_ID = 0; private static final int READ_NAME = 1; private static final int READ_PRICE = 1; private static final int READ_DESCRIPTION = 2;
        }
    }

}
