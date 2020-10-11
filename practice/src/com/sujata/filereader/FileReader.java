package com.sujata.filereader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IOException {

        File file  = new File("/Users//Sujata//Desktop/captmidn.txt");
        Scanner scan =  new Scanner(file);

        String fileContent = "This is new file created by Java.";

        while(scan.hasNextLine()){
            fileContent = fileContent.concat(scan.nextLine() + "\n");
        }

        FileWriter writer = new FileWriter("/Users//Sujata//Desktop//NewFile.txt");
        writer.write(fileContent);
        writer.close();
    }
}
