package Homework.hw5.testlist;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("melon");
        fruits.add("apricot");
        fruits.add("apple");
        fruits.add("apricot");
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("pineapple");
        fruits.add("avocado");
        fruits.add("avocado");

        countOccurance(fruits, "apple");

    }
    public static void countOccurance(ArrayList<String> fruits, String name) {
        int count = Collections.frequency(fruits, name);
        System.out.println("Word " + name + " found in the list " + count + " times");
    }
}
