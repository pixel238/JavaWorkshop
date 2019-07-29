package com.company.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String readFile(String fileName) throws FileNotFoundException {
        FileInputStream reader = new FileInputStream(fileName);
        String data = "";
        try {
            byte[] buffer = new byte[reader.available()];//use a multiple of 8 for sizeof array
            reader.read(buffer);
            data = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
