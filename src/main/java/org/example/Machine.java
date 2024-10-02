package org.example;

public class Machine {
    private final String idMachine;
    private final String operationName;
    private final int time;

    // Constructor
    public Machine(String idMachine, String operationName, int time) {
        this.idMachine = idMachine;
        this.operationName = operationName;
        this.time = time;
    }

    // Getters
    public String getIdMachine() {
        return idMachine;
    }

    public String getOperationName() {
        return operationName;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "idMachine='" + idMachine + '\'' +
                ", operationName='" + operationName + '\'' +
                ", time=" + time +
                '}';
    }
}
