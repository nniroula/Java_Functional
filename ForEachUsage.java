/*
 * print numbers from a list of numbers
 */

import java.util.List;

public class ForEachUsage{
    public static void main(String []args){
        List<Integer> numbers = List.of(1, 3, 4, 2, 8);

        // traditional way
        System.out.println("Traditional way ............");
        for(int number: numbers){
            System.out.println(number);
        }

        // functional way -> convert list to stream and use method reference
        System.out.println();
        System.out.println("Functional way of printing numbers from a list ....");
        numbers.stream().forEach(System.out::println);
    }
}