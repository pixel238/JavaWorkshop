package com.company.File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public StringBuilder readFile(String fileName) throws FileNotFoundException {
        FileInputStream reader = new FileInputStream(fileName);
        BufferedInputStream breader = new BufferedInputStream(reader);
        StringBuilder data = new StringBuilder();
        try {
            byte[] buffer = new byte[8];//use a multiple of 8 for sizeof array or use breader.available()
            while (breader.read(buffer) > 0) {
                data.append(new String(buffer));
                buffer = new byte[8];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
