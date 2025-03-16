package com.dmdev.hometask;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class CSVFileWriter {

    public static void writeResultCSVFile(Path pathPrice, Path pathName, Path result) throws IOException {
        Map<String, String> priceMap = CSVFileReader.readFromFileToMap(pathPrice);
        Map<String, String> nameMap = CSVFileReader.readFromFileToMap(pathName);

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND, CREATE)) {
            {
                CSVFileDataResultBuilder.resultMapFromMaps(priceMap, nameMap)
                        .forEach(line -> {
                            try {
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }

                        });
                System.out.println("Add new csv file");
            }

        }

    }
}
