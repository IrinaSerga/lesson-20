package com.dmdev.lesson20.exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("main start");
        try {
            unsafe(10);
        } catch (FileNotFoundException | TimeoutException t) {
            t.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{  // выполняется всегда, вне зависимости было исключение или нет
            System.out.println("finally");
        }
        System.out.println("main end");

    }

    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new FileNotFoundException(); //ArithmeticException();
        }
        System.out.println("unsafe end");
    }


}
