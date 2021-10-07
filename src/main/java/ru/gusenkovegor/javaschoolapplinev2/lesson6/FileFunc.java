package ru.gusenkovegor.javaschoolapplinev2.lesson6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;


public class FileFunc {

    public static ArrayList<String> readToArrayListStrings(String fileName) throws IOException {
        return new ArrayList<>(Arrays.asList(new String(Files.readAllBytes(Paths.get(fileName))).split(" ")));
    }
}
