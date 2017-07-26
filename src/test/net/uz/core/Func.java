package net.uz.core;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Func {

    /**
     * Returns first matching group result, if no matches - return @value without changes
     */
    public static final BiFunction<String, String, String> REGEXP_SUBSTRING = (pattern, value) -> {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(value);
        return matcher.find() ? matcher.group(1) : value;
    };

    public static final BiFunction<String, String, ArrayList<String>> parseJSON = (json, item) -> {
        JsonParser parser = new JsonParser();
        JsonObject mainObject = parser.parse(json).getAsJsonObject();
        JsonArray pItem = mainObject.getAsJsonArray(item);
        ArrayList<String> rez = new ArrayList<>();
        pItem.forEach(o -> rez.add(o.toString()));
        return rez;
    };
}
