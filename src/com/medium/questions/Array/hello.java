package com.medium.questions.Array;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class hello {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        //Executes only one thread
        ExecutorService es = Executors.newSingleThreadExecutor();
    }

}
