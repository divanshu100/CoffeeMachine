package com.coffeemachine.coffeemachine.service;

import com.coffeemachine.coffeemachine.dto.entities.Beverages;
import com.coffeemachine.coffeemachine.dto.entities.Ingredients;
import com.coffeemachine.coffeemachine.dto.entities.RequestObject;
import com.coffeemachine.coffeemachine.enums.Drink;

import java.util.concurrent.Semaphore;

public class CommandLineExecutor extends CommandExecutor {

//    @Override
//    public <T> T executeMany(T resource) {
//        RequestObject requestObject = (RequestObject) resource;
//        loadBaseConfiguration(requestObject);
//        requestObject.getMachine().getBeverages().forEach((x, y) -> {
//            try {
//                this.semaphores.acquire();
//                this.currentExecution++;
//                if (this.currentExecution < this.numberOfParallelOperation) {
//                    this.map.get(x).getDrink(y.getHot_water(), y.getHot_milk(), y.getGinger_syrup(),
//                            y.getSugar_syrup(), y.getTea_leaves_syrup(), y.getGreen_mixture(), ingredients);
//                }
//                this.currentExecution--;
//                this.semaphores.release();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        return null;
//    }

    @Override
    public <T> T executeMany(T resource) {
        RequestObject requestObject = (RequestObject) resource;
        loadBaseConfiguration(requestObject);
        requestObject.getMachine().getBeverages().entrySet().parallelStream().forEach((entry) -> {
            Drink x = entry.getKey();
            Ingredients y = entry.getValue();
            if (this.currentExecution < this.numberOfParallelOperation) {
                synchronized (this){
                    this.map.get(x).getDrink(y.getHot_water(), y.getHot_milk(), y.getGinger_syrup(),
                            y.getSugar_syrup(), y.getTea_leaves_syrup(), y.getGreen_mixture(), ingredients);
                }
            }
        });
        return null;
    }


    private void loadBaseConfiguration(RequestObject requestObject) {
        this.ingredients = requestObject.getMachine().getTotal_items_quantity();
        this.numberOfParallelOperation = requestObject.getMachine().getOutlets().getCount_n();
        this.semaphores = new Semaphore(this.numberOfParallelOperation);
    }


    @Override
    public <T> T execute(T resource) {
        return null;
    }

    @Override
    public Beverages getCurrentMachineResources() {
        return null;
    }


}
