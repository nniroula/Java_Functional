/*
 * It uses lambda expression
 */

import java.util.List;

public class LambdaExpression {
    public static void main(String []args){
        List<Integer> integers = List.of(1, 3, 4, 8, 9);
        System.out.println("Printing odd numbers using lambda Expression in filter method");
        integers.stream().filter(number -> number % 2 == 1).forEach(System.out::println);
    }
}
