package com.czxy.lzh;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class JsonType {
    public static void jsonDemo() throws IOException {
        JsonParser parser = new JsonParser();
        JsonObject Config = (JsonObject) parser.parse(new FileReader("Config.json"));
        JsonArray languages = Config.get("languages").getAsJsonArray();
        System.out.println(languages.get(0).getAsJsonObject().get("name"));
    }
}
