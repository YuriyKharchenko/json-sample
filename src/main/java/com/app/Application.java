package com.app;

import org.json.JSONArray;
import org.json.JSONObject;

public class Application {
    public static void main(String[] args) {
        /*String json =  "{\"key\":\"value\"}";   // пара ключ, значение   {"key":"value", "name":"Piter"}
                                                // {"persons":  [{"name":"Piter", "age":"23"},
                                                //  {"name":"Tom", "age":"25"}]}  - лист
*/

        JSONArray array = new JSONArray();
        for (int i = 0; i < 10; i++) {
            JSONObject root = new JSONObject();
            root.put("name", "Piter");
            root.put("age", "25");
            array.put(i, root);
        }

        JSONObject root = new JSONObject();
        root.put("persons", array);
//        root.put("age","25");
        System.out.println(root);
    //    {"persons":[{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"},{"name":"Piter","age":"25"}]}

        System.out.println("---------------------------");

        root = new JSONObject(root.toString());
        array = root.getJSONArray("persons");//получаем список по ключу

        for (int i = 0; i < array.length(); i++) {
            JSONObject obj = array.getJSONObject(i);
            System.out.println(obj.get("name"));
            System.out.println(obj.get("age"));
        }

    }
}
