package Week4;

import java.util.*;

public class ListExample{


    public static void main(String[] args){
        // add the numbers 1-50 to a List using a for loop


        // Week 4 Java Project numbers 2-6
        String[] names = {"Tim", "Sally", "Josh"};
        int[] nameLengths = new int[names.length];

        for(int i = 0; i < names.length; i++){
            nameLengths[i] = names[i].length();
        }

        int nameSum = 0;

        for(int i = 0; i < nameLengths.length; i++){
            nameSum += nameLengths[i];
        }

        List<Integer> nLengths = new ArrayList<>();

        int nameTotal = 0;
        for(String name : names){
            nLengths.add(name.length());
            nameTotal += name.length();
        }

        System.out.println(nameTotal);


        //Remove duplicates from list example
        List<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Mary");
        namesList.add("Peter");
        namesList.add("Paul");
        namesList.add("Susan");
        namesList.add("John");
        namesList.add("Mary");
        namesList.add("Peter");
        namesList.add("Paul");
        namesList.add("Susan");

        // Add some duplicates
        namesList.add("John");
        namesList.add("Mary");
        namesList.add("Peter");
        namesList.add("Paul");
        namesList.add("Susan");

        System.out.println(namesList);

        //Long way
        // Loop through each element
        // Check it against every other element
        // if equal, remove the initial element

        // Short way, transfer to a Set
        Set<String> set = new HashSet<>(namesList);
        System.out.println(set);

    }

    


}