package com.coffeemachine.coffeemachine.service.impl;

import com.coffeemachine.coffeemachine.dto.entities.Ingredients;
import com.coffeemachine.coffeemachine.service.DrinkFactory;

public class BlackTea implements DrinkFactory {
    @Override
    public void getDrink(int hot_water, int hot_milk, int ginger_syrup, int sugar_syrup, int tea_leaves_syrup,
                         int green_mixture, Ingredients availableIngredients) {
        if (hot_water <= availableIngredients.getHot_water() && hot_milk <= availableIngredients.getHot_milk()
                && ginger_syrup <= availableIngredients.getGinger_syrup() && sugar_syrup <= availableIngredients.getSugar_syrup()
                && tea_leaves_syrup <= availableIngredients.getTea_leaves_syrup() && green_mixture <= availableIngredients.getGreen_mixture()) {
            availableIngredients.setHot_water(availableIngredients.getHot_water() - hot_water);
            availableIngredients.setHot_milk(availableIngredients.getHot_milk() - hot_milk);
            availableIngredients.setGinger_syrup(availableIngredients.getGinger_syrup() - ginger_syrup);
            availableIngredients.setSugar_syrup(availableIngredients.getSugar_syrup() - sugar_syrup);
            availableIngredients.setTea_leaves_syrup(availableIngredients.getTea_leaves_syrup() - tea_leaves_syrup);
            availableIngredients.setGreen_mixture(availableIngredients.getGreen_mixture() - green_mixture);
            System.out.println("black_tea is prepared");
        } else {
            System.out.println("black_tea cannot be prepared because item hot_water is not sufficient");
        }
    }

}
