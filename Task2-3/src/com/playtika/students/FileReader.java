package com.playtika.students;


import java.io.File;
import java.util.Scanner;

public class FileReader {

    private Scanner file;

    public void openFile() {
        try {
            file = new Scanner(new File("file.txt"));
            System.out.println("The following data was read from the file: ");
        } catch (Exception e) {
            System.out.println("File cannot be found");
        }
    }

    public void readFile() {
        while (file.hasNext()) {
            String id = file.next();
            String name = file.next();
            String surname = file.next();
            String age = file.next();
            System.out.printf("%s %s %s %s\n", id, name, surname, age);
        }
    }
    public void closeFile(){
        file.close();
    }
}


