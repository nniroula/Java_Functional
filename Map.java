/*
 * Functional programming using map function
 */

import java.util.List;

public class Map {
    public static void main(String []args){
        // print cubes of odd numers
        List<Integer> integers = List.of(1, 3, 5, 4, 2, 8);
        System.out.println("Cubes of odd numbers are: ");
        integers.stream().filter(numb -> numb % 2 == 1) // filter returns true if a number is odd
                .map(number -> number * number * number) // returns a cube of a number
                .forEach(System.out::println);  // forEach prints out each number obtained from map
    }
}
