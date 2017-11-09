package com.playtika.students;


import java.util.Formatter;

public class FileWriter {

    private Formatter file;

    public void openFile(){
        try {

            file = new Formatter("file.txt");
            System.out.println("Data was added to the  file");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
    public void addRecord(){
        file.format("%s\t%s", "1", "Jack Danils 80");
        file.format("\n");
        file.format("%s\t%s", "2", "Bill Klinton 60");
        file.format("\n");
        file.format("%s\t%s", "3", "Mike Spenser 43");
        file.format("\n");
        file.format("%s\t%s", "4", "Karl Gamer 18");
        file.format("\n");
        file.format("%s\t%s", "5", "Jarl Kotur 24");
        file.format("\n");
        file.format("%s\t%s", "6", "Lin Jin 48");
        file.format("\n");
        file.format("%s\t%s", "7", "Don Perinion 64");
        file.format("\n");
        file.format("%s\t%s", "8", "Sin Kin 21");
        file.format("\n");
        file.format("%s\t%s", "9", "Gob Bult 57");
        file.format("\n");
        file.format("%s\t%s", "10", "Andry Woody 36");

    }

    public void closeFile() {


        file.close();
    }
}
