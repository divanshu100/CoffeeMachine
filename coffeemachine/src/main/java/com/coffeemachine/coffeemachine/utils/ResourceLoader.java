package com.coffeemachine.coffeemachine.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ResourceLoader {
    public <T> T loadResource(String filePath, T returnType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(filePath);
        JsonNode jsonObject =  mapper.readTree(file);
        return (T) mapper.convertValue(jsonObject, returnType.getClass());
    }
}
