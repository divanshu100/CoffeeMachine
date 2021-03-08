package com.coffeemachine.coffeemachine.enums;

public enum Drink {
    hot_tea("hot_tea"),
    hot_coffee("hot_coffee"),
    black_tea("black_tea"),
    green_tea("green_tea");

    public final String label;

    private Drink(String label) {
        this.label = label;
    }
}
