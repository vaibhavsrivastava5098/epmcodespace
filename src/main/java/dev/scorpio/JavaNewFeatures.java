package dev.scorpio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaNewFeatures {
    public static void main(String[] args) {
        System.out.println("hello");
        /*String text = "hello java 12 features";
        System.out.println(text);

        String indent = text.indent(4);
        System.out.println(indent);

        String text1 = "    hello java 12 features";
        System.out.println(text1);
        String indent1 = text1.indent(-4);
        System.out.println(indent1);*/

        /*try {
            Path filePath1 = Files.createTempFile("file1", ".txt");
            Path filePath2 = Files.createTempFile("file2", ".txt");
            Files.writeString(filePath1,"hello file handling1");
            Files.writeString(filePath2,"hello file handling2");
            long mismatch = Files.mismatch(filePath1, filePath2);
            System.out.println("mismatch:"+mismatch);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        Double collect = Stream.of(1, 2, 3, 4, 5).collect(Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(), (sum, count) -> sum / count));
        System.out.println(collect);
    }
}