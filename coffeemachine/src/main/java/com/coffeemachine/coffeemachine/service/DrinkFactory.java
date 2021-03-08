package com.coffeemachine.coffeemachine.service;

import com.coffeemachine.coffeemachine.dto.entities.Ingredients;
import com.coffeemachine.coffeemachine.enums.Drink;

public interface DrinkFactory {
    public abstract void getDrink(int hot_water, int hot_milk, int ginger_syrup, int sugar_syrup, int tea_leaves_syrup, int green_mixture, Ingredients availableIngredients);
}
