package com.company.File;

import java.io.FileNotFoundException;

public class FileHandler {
    public static void main(String[] args){
        FileWriter myfileWriter = new FileWriter();
        String data = "Hello! How are you?";
        try {
            myfileWriter.writeFile("DataFile.txt",data);
        } catch (FileNotFoundException e) {
            System.out.println("Please use a valid name");
            e.printStackTrace();
        }
    }
}
