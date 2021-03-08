package com.coffeemachine.coffeemachine.dto.entities;

public class Outlets {
    private int count_n;

    public int getCount_n() {
        return count_n;
    }

    public void setCount_n(int count_n) {
        this.count_n = count_n;
    }

    @Override
    public String toString() {
        return "Outlets{" +
                "count_n=" + count_n +
                '}';
    }
}
