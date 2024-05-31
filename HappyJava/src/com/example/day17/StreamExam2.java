package com.example.day17;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExam2 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/com/example/");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p -> System.out.println(p.getFileName()));
        stream.close();

        Stream<String> stream2 = Files.lines(Paths.get("src/com/example/test.java"));
        stream2.forEach(System.out::println);

        stream2.close();

    }
}
