package lesson10;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Задание 1:");
//        File file1 = new File("files/textFile1.txt");
//        List<String> fileList = LabFile.readFile(file1);
//        System.out.println(fileList);
//
//        System.out.println("Задание 2:");
//        File file2 = new File("files/textFile2.txt");
//        LabFile.writeFile("В середине разговора про политические действия Анна Павловна разгорячилась.", file2);

//        System.out.println("Задание 3:");
//        File file3 = new File("files/textFile3.txt");
//        File file4 = new File("files/textFile4.txt");
//        LabFile.glueFile(file3, file4);

        System.out.println("Задание 4:");
        File file5 = new File("files/textFile5.txt");
        LabFile.replaceFile(file5);
    }
}
