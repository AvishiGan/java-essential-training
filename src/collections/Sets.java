package collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        System.out.println(fruits);
        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("Number of items after removing lemon: " + fruits.size());

        //Can't use add or remove when use Set.of
        Set moreFruits = Set.of("pear", "raising", "cherry");
        System.out.println(moreFruits);
    }
}
