package com.epam.IOProject;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        String fromFile = read.readFromFile();
        System.out.println(fromFile);
        String textFromKeyboard = read.textFromKeyboard();
        System.out.println(textFromKeyboard);
        String combineText = fromFile + " " + textFromKeyboard;
        System.out.println(combineText);
        int lengthOfString = combineText.length();
        int start = lengthOfString/3+1;
        int end = lengthOfString/3+lengthOfString/3;
        String partOfString = combineText.substring(start, end);
        System.out.println(partOfString);
        String upper = partOfString.toUpperCase();
        System.out.println(upper);
        String low = partOfString.toLowerCase();
        String reversable = read.reversation(combineText);
        System.out.println(reversable);
        read.writeInFile(reversable);

    }
}
