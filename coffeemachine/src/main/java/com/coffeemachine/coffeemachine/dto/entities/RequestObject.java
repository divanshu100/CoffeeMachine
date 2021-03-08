package com.coffeemachine.coffeemachine.dto.entities;

public class RequestObject {
    private Machine machine;

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public String toString() {
        return "RequestObject{" +
                "machine=" + machine +
                '}';
    }
}
