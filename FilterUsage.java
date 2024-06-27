
/*
 * print even numbers in a list using filter method and method reference
 * 
 * Method Reference needs static method and the class name
 */

import java.util.List;

public class FilterUsage {
    public static void main(String []args){
        // step 1: 
        List<Integer> listOfIntegers = List.of(1, 3, 4, 7, 2);
        // function approach -> convert to stream and apply filter, then print numbers

        // first way of using filter method - use lambda expression in it
        System.out.println("First way of using filter method => lambda expression as filter() arg.");
        listOfIntegers.stream().filter(numb -> numb % 2 == 0).forEach(System.out::println);

        System.out.println("    Now using ClassName:methodName as argument in forEach method.");
        listOfIntegers.stream().filter(numb -> numb % 2 == 0).forEach(FilterUsage::printANumber);

        // second way of using filter method => ClassName::methodName
        System.out.println();
        System.out.println("Second way of using filter method => ClassName::methodName as filter argument");
        listOfIntegers.stream().filter(FilterUsage::checkIfEvenNumber).forEach(System.out::println);

    }

    /* step 2: prints a number */
    private static void printANumber(int numb){
            System.out.println(numb);
    }

    /* check if a number is an even integer */
    private static boolean checkIfEvenNumber(int number){
        return number %2 == 0;
    }
}
