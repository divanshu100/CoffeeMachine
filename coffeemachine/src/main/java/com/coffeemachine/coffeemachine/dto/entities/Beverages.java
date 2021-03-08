package com.coffeemachine.coffeemachine.dto.entities;

import com.coffeemachine.coffeemachine.enums.Drink;

import java.util.Map;

public class Beverages {

    private Map<Drink, Ingredients> beverages;

    public Map<Drink, Ingredients> getBeverages() {
        return beverages;
    }

    public void setBeverages(Map<Drink, Ingredients> beverages) {
        this.beverages = beverages;
    }

    @Override
    public String toString() {
        return "Beverages{" +
                "beveragesMap=" + beverages +
                '}';
    }
}
