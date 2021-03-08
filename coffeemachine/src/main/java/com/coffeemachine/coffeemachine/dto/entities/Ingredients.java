package com.coffeemachine.coffeemachine.dto.entities;

public class Ingredients {
    private int hot_water;
    private int hot_milk;
    private int ginger_syrup;
    private int sugar_syrup;
    private int tea_leaves_syrup;
    private int green_mixture;

    public int getHot_water() {
        return hot_water;
    }

    public void setHot_water(int hot_water) {
        this.hot_water = hot_water;
    }

    public int getHot_milk() {
        return hot_milk;
    }

    public void setHot_milk(int hot_milk) {
        this.hot_milk = hot_milk;
    }

    public int getGinger_syrup() {
        return ginger_syrup;
    }

    public void setGinger_syrup(int ginger_syrup) {
        this.ginger_syrup = ginger_syrup;
    }

    public int getSugar_syrup() {
        return sugar_syrup;
    }

    public void setSugar_syrup(int sugar_syrup) {
        this.sugar_syrup = sugar_syrup;
    }

    public int getTea_leaves_syrup() {
        return tea_leaves_syrup;
    }

    public void setTea_leaves_syrup(int tea_leaves_syrup) {
        this.tea_leaves_syrup = tea_leaves_syrup;
    }

    public int getGreen_mixture() {
        return green_mixture;
    }

    public void setGreen_mixture(int green_mixture) {
        this.green_mixture = green_mixture;
    }

    @Override
    public String toString() {
        return "Ingredients{" +
                "hot_water=" + hot_water +
                ", hot_milk=" + hot_milk +
                ", ginger_syrup=" + ginger_syrup +
                ", sugar_syrup=" + sugar_syrup +
                ", tea_leaves_syrup=" + tea_leaves_syrup +
                ", green_mixture=" + green_mixture +
                '}';
    }
}
