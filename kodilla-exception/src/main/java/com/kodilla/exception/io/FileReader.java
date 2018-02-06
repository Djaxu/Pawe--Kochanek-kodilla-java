package com.kodilla.exception.io;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    /*public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))){
            fileLines.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("OH NO ! Something went Horribly wrong and world is about to END " + e);
        } finally {
            System.out.println("I am gonna be here... always!!");
        }
    }*/
    public void readFile() throws FileReaderException {


        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        try (Stream<String> fileLines = Files.lines(Paths.get("file//names.txt"))) {
            fileLines.forEach(System.out::println);

        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!!");
        }
    }
}