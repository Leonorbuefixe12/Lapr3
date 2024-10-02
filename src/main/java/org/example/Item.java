package org.example;
import java.util.List;

public class Item {
    private final String idItem;
    private final int priority;
    private final List<String> operations;

    // Constructor
    public Item(String idItem, int priority, List<String> operations) {
        this.idItem = idItem;
        this.priority = priority;
        this.operations = operations;
    }

    // Getters
    public String getIdItem() {
        return idItem;
    }

    public int getPriority() {
        return priority;
    }

    public List<String> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem='" + idItem + '\'' +
                ", priority=" + priority +
                ", operations=" + operations +
                '}';
    }
}
