package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = readItemsFromCSV("../artigos.csv");
        List<Machine> machines = readMachinesFromCSV("../maquinas.csv");

        // Print loaded data
        for (Item item : items) {
            System.out.println(item);
        }

        System.out.println("------------------------------------ ");

        for (Machine machine : machines) {
            System.out.println(machine);
        }

        //commenting for testing
    }

    private static List<Item> readItemsFromCSV(String filePath) {
        List<Item> items = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String idItem = fields[0].trim();
                int priority = Integer.parseInt(fields[1].trim());
                List<String> operations = Arrays.asList(Arrays.copyOfRange(fields, 2, fields.length));
                items.add(new Item(idItem, priority, operations));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    private static List<Machine> readMachinesFromCSV(String filePath) {
        List<Machine> machines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String idMachine = fields[0].trim();
                String operationName = fields[1].trim();
                int time = Integer.parseInt(fields[2].trim());
                machines.add(new Machine(idMachine, operationName, time));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return machines;
    }
}
