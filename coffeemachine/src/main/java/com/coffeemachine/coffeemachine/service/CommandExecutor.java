package com.coffeemachine.coffeemachine.service;

import com.coffeemachine.coffeemachine.dto.entities.Beverages;
import com.coffeemachine.coffeemachine.dto.entities.Ingredients;
import com.coffeemachine.coffeemachine.enums.Drink;
import com.coffeemachine.coffeemachine.service.impl.BlackTea;
import com.coffeemachine.coffeemachine.service.impl.GreenTea;
import com.coffeemachine.coffeemachine.service.impl.HotCoffee;
import com.coffeemachine.coffeemachine.service.impl.HotTea;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

public abstract class CommandExecutor {
    public abstract  <T> T executeMany(T resource);
    public abstract <T> T execute(T resource);
    public abstract Beverages getCurrentMachineResources();
    protected int numberOfParallelOperation;
    protected Ingredients ingredients;
    protected int currentExecution = 0;
    protected Semaphore semaphores;
    protected Map<Drink, DrinkFactory> map = new HashMap<Drink, DrinkFactory>() {{
        put(Drink.black_tea, new BlackTea());
        put(Drink.green_tea, new GreenTea());
        put(Drink.hot_tea, new HotTea());
        put(Drink.hot_coffee, new HotCoffee());
    }};

}
