package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static int countChars(String string, Character character){
        string = string.toUpperCase();
        //if (character >=97 && character <= 122) character -= 32;
        character = character.toUpperCase(character);
        char myChar = Character.toUpperCase(character);
        int numberOfChars = 0;
        int stringSize = string.length();
        for (int i = 0; i < stringSize; i++)
            if(string.charAt(i) == character) numberOfChars++;
        return numberOfChars;
    }
    public static void main(String[] args) {
        System.out.println(countChars("Tekst tekst tekst tekst tekst", 't'));
    }
}
