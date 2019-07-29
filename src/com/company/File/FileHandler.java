package com.company.File;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args) {
        writeFileContent();
        System.out.println("Written to file");
        System.out.println("Displaying the file content");
        readFileContent();
    }

    public static void writeFileContent() {
        FileWriter myfileWriter = new FileWriter();
        String data = "\nBye";
        try {
            myfileWriter.writeFile("DataFile.txt", data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name");
            e.printStackTrace();
        }
    }

    public static void readFileContent() {
        FileReader myfileReader = new FileReader();
        try {
            System.out.println(myfileReader.readFile("DataFile.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Please enter valid file name");
            e.printStackTrace();
        }
    }
}
