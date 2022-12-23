package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager{
    private static final String input = "resources/input.txt";
    private static final String output = "resources/output.txt";

    public static String readFromInput(){
        try(Scanner scanner = new Scanner(new File(input))){
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile(String result){
        try(FileWriter fileWriter = new FileWriter(output, true)){
            fileWriter.write(result + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}