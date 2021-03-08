package com.coffeemachine.coffeemachine.dto.entities;

import com.coffeemachine.coffeemachine.enums.Drink;

import java.util.Map;

public class Machine {
    private Outlets outlets;
    private Ingredients total_items_quantity;
    private Map<Drink, Ingredients> beverages;

    public Outlets getOutlets() {
        return outlets;
    }

    public void setOutlets(Outlets outlets) {
        this.outlets = outlets;
    }

    public Ingredients getTotal_items_quantity() {
        return total_items_quantity;
    }

    public void setTotal_items_quantity(Ingredients total_items_quantity) {
        this.total_items_quantity = total_items_quantity;
    }

    public Map<Drink, Ingredients> getBeverages() {
        return beverages;
    }

    public void setBeverages(Map<Drink, Ingredients> beverages) {
        this.beverages = beverages;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "outlets=" + outlets +
                ", total_items_quantity=" + total_items_quantity +
                ", beverages=" + beverages +
                '}';
    }
}
