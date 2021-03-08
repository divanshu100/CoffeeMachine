package com.coffeemachine.coffeemachine;

import com.coffeemachine.coffeemachine.dto.entities.RequestObject;
import com.coffeemachine.coffeemachine.service.CommandLineExecutor;
import com.coffeemachine.coffeemachine.utils.ResourceLoader;

import java.io.IOException;

public class CoffeemachineApplication {
    private static final String value = "../coffeemachine/src/main/resources/test.json";

    //run this method which will pick up the queries from test.json
    public static void main(String[] args) throws IOException {
        Runner();
    }

    private static void Runner() throws IOException {
        ResourceLoader resourceLoader = new ResourceLoader();
        CommandLineExecutor commandLineExecutor = new CommandLineExecutor();
        RequestObject requestObject = new RequestObject();
        commandLineExecutor.executeMany(resourceLoader.loadResource(value, requestObject));
    }

}
