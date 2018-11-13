package com.epam.IOProject;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.sql.SQLOutput;


public class ReadFile implements AutoCloseable{


    public String readFromFile() throws IOException {
        String textFromFile = "";
        try (FileReader filereader = new FileReader("File.txt")) {
            BufferedReader bufferedReader = new BufferedReader(filereader);
            textFromFile = bufferedReader.readLine();
        }
        catch (IOException e){
            try(FileWriter fileWriter = new FileWriter("Random.txt", true)) {
                fileWriter.write("Java begin");
            }
           FileReader filereader = new FileReader("Random.txt");
           BufferedReader bufferedReader = new BufferedReader(filereader);
           textFromFile = bufferedReader.readLine();
        }

        return textFromFile;
    }

    public String reversation(String rev){
        String reversableText;
        StringBuilder stringBuilder = new StringBuilder(rev);
        stringBuilder.reverse();
        reversableText = stringBuilder.toString();

        return reversableText;
    }

    public void writeInFile(String reversable) throws IOException {
        try (Writer writeToFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Write.txt")));){
            writeToFile.write(reversable);

        }
        catch (IOException e){
            System.out.println("File not found");
            File file = new File("writeInNew.txt");
            file.createNewFile();
            Writer writeToFile = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("writeInNew.txt")));
            writeToFile.write(reversable);
        }
    }

    public String textFromKeyboard() throws IOException {
        String stringFromKeyboard;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your text");
        stringFromKeyboard = bufferedReader.readLine();

        return stringFromKeyboard;
    }

    @Override
    public void close() throws Exception {

    }
}
