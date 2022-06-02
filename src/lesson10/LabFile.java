package lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LabFile {
    public static List<String> readFile(File file) {
        List<String> strList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                strList.add(input);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return strList;
    }

    public static void writeFile(String string, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(string);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void glueFile(File file1, File file2) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt"))) {
                String input1;
                String input2;
                while ((input1 = reader1.readLine()) != null) {
                    writer.write(input1);
                }
                writer.write("\n");
                while ((input2 = reader2.readLine()) != null) {
                    writer.write(input2);
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void replaceFile(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String str : stringList) {
                writer.append(str.replaceAll("[^\\p{L}0-9]", "\\$"));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
