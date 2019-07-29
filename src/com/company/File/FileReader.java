package com.company.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReader {
    public String readFile(String fileName) throws FileNotFoundException {
        FileInputStream reader = new FileInputStream(fileName);
        return fileName;
    }
}
