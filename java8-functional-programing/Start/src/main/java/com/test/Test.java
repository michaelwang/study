package com.test;

import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by wangzhenhua on 15/4/3.
 */
public class Test
{
    public static void main(String args[])
    {
        ExecutorService es = Executors.newSingleThreadExecutor();

        es.submit(() -> {
            try(Scanner scanner = new Scanner(new FileReader("file.txt"))) {
                String line = scanner.nextLine();
                process(line);
            }
            return null;
        });

    }

    private static void process(String line) {
        System.out.println(line);
    }
}
