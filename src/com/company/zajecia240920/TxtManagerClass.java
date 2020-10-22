package com.company.zajecia240920;

import java.io.*;
import java.util.Scanner;

public class TxtManagerClass implements TxtManager{

    @Override
    public void viewFile() throws FileNotFoundException {
        Integer min = 255;
        Integer max = 0;
        Scanner scanner = new Scanner(new File("/Users/oskarmulcan/Desktop/Programs/programy/Mosh Java /MlodziProgramisci/src/com/company/zajecia240920/dane.txt"));
        while (scanner.hasNextLine()) {
            Integer number = Integer.parseInt(scanner.next());
            if (min>number) min = number;
            if (max<number) max = number;
        }
        scanner.close();
        System.out.println("Min: " + min);
        System.out.println("Max: "+ max);
    }

    @Override
    public void addTextLine(String text) throws IOException {
        var fileWriter = new FileWriter(new File("/Users/oskarmulcan/Desktop/Programs/programy/Mosh Java /MlodziProgramisci/src/com/company/zajecia240920/dane.txt"), true);
        var bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(text);
        bufferedWriter.newLine();
        bufferedWriter.close();
        fileWriter.close();
    }

    @Override
    public void openTextFile() {

    }

    public static void main(String[] args) throws IOException {
        var txtManagerClass = new TxtManagerClass();
        txtManagerClass.addTextLine("Ale nowa linijka textu");
        txtManagerClass.viewFile();
    }


}
