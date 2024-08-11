package collections;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Maps {

    public static void main(String[] args) {

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
//        fruitCalories.put("lemon", 17); //overrides existing method
        fruitCalories.putIfAbsent("lemon", 17);
        fruitCalories.remove("lemon");
        fruitCalories.containsKey("lemon"); //true
        fruitCalories.containsKey("200"); //false

        System.out.println(fruitCalories);
        System.out.println("banana: " + fruitCalories.get("banana"));
    }
}
