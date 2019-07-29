package com.company.File.dataStreams;

import java.io.*;

public class ConsoleWriter {
    public static void main(String[] args)
    {
        writeToConsole("Hello");
    }
    public static void writeToConsole(String data){
        OutputStream writer = new BufferedOutputStream(System.out);
        try (writer) {
            writer.write(data.getBytes());
        } catch (IOException e) {
            System.out.println("Exception occured:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
