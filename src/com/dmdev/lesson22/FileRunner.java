package com.dmdev.lesson22;

import java.io.File;
import java.io.IOException;

/**         output stream
 * application -------> file
 *            input stream
 * application <------- file
 *
 */

public class FileRunner {

    public static void main(String[] args) throws IOException {
        File file = new File("resources/test.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getCanonicalFile());
        //Абсолютный (он же полный) путь — это когда мы указываем все диски и папки, в которые нужно зайти, чтобы добраться до нужного файла.
        //Относительный путь — это путь к файлу относительно текущего каталога. Текущий каталог — это тот, в котором запускается скрипт, программа или открывается страница в браузере.
        File dir = new File("resources/test/dir");
        dir.mkdirs();



    }
}
