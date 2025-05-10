package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public static final String INVENTORY_FILE_PATH = "src/main/resources/libraryInventory.csv";
    public static final String BORROW_LOG_FILE_PATH = "src/main/resources/borrowLog.csv";

    public static List<LibraryItem> inventory = initInventory(INVENTORY_FILE_PATH);
    public static List<String> borrowLogs = initBorrowLogs(BORROW_LOG_FILE_PATH);

    /**
     * Reads library items from an external CSV file to initialize the inventory
     */
    private static List<LibraryItem> initInventory(String path) {
        List<LibraryItem> items = new ArrayList<>();
        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String id = parts[0];
                String title = parts[1];
                int year = Integer.parseInt(parts[2]);
                String type = parts[3]; // "Book" or "Magazine"

                if ("Book".equalsIgnoreCase(type)) {
                    String author = parts[4];
                    items.add(new Book(id, title, year, author));
                } else if ("Magazine".equalsIgnoreCase(type)) {
                    int issue = Integer.parseInt(parts[4]);
                    items.add(new Magazine(id, title, year, issue));
                }
            }
        } catch (FileNotFoundException ignored) {}

        return items;
    }

    /**
     * Reads borrowing log lines from file.
     */
    private static List<String> initBorrowLogs(String path) {
        List<String> logs = new ArrayList<>();
        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                logs.add(scanner.nextLine());
            }
        } catch (FileNotFoundException ignored) {}

        return logs;
    }
}
