package com.company.File.dataStreams;

import java.io.*;

public class primitiveDataHandler {
    public static void main(String[] args)
    {
        try {
            new primitiveDataHandler().writeFile("File.txt","Hello");
            new primitiveDataHandler().readFile("File.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(String fileName,String data) throws FileNotFoundException {
        FileOutputStream writerStream=new FileOutputStream(fileName,true);
        DataOutputStream writer = new DataOutputStream(writerStream);
        try (writer) {
            writer.writeBoolean(true);
            writer.writeInt(24);
            writer.writeDouble(2.0);
            //writer.writeUTF(data);
        } catch (IOException e) {
            System.out.println("Exception occured:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public StringBuilder readFile(String fileName) throws FileNotFoundException {
        FileInputStream reader = new FileInputStream(fileName);
        DataInputStream dreader = new DataInputStream(reader);
        StringBuilder data = new StringBuilder();
        try(dreader) {
            boolean b = dreader.readBoolean();
            int i = dreader.readInt();
            double v = dreader.readDouble();
            //String s = dreader.readUTF();
            System.out.println(b+"\n"+i+"\n"+v+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
