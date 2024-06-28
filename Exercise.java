/*
 * Q1. print only odd numbers from a list
 * Q2. print all courses individually
 *      List<String> courses = List.of("Spring", "Spring Boot", "API", "JS", "Docker", "Kubernetes")
 * Q3. print courses containing word Spring
 * Q4. print courses whose name has atleast 4 letters
 */

import java.util.List;

class OnlyOddNumber{
    //Q1
    static void printAllOddNumbers(){
        List<Integer> listOfNumbers = List.of(1, 3, 4, 8, 9);
        System.out.println("Odd numbers are: ");
        listOfNumbers.stream().filter(number -> number % 2 ==1).forEach(System.out::println);
    }
}

class AllCourse{
    //Q2
    static void printAllCourses(List<String> courseList){
        courseList.stream().forEach(System.out::println);
    }

    // Q3. print courses containing word Spring
    static void printCoursesContainingSpring(List<String> list){
        list.stream()
            .filter(AllCourse::isSpringPresent)
            .forEach(System.out::println);
    }

    static boolean isSpringPresent(String course){
        //courseList.contains("Spring");
        return course.toLowerCase().contains("spring");
    }

    //Q4
    static void printAllCoursesWithAtleastFourLetters(List<String> courses){
        courses.stream()
                .filter(AllCourse::hasAtleatFourCharacters)
                .forEach(System.out::println);
    }

    static boolean hasAtleatFourCharacters(String course){
        return course.length() >= 4;
    }
}

// main class
public class Exercise {
    public static void main(String []args){
        // OnlyOddNumber class
        OnlyOddNumber.printAllOddNumbers();

        //AllCourse class
        List<String> programmingCourses = List.of("Spring", "Spring Boot", "API", "JS", "Docker", "Kubernetes");
        System.out.println();
        System.out.println("All courses are:");
        AllCourse.printAllCourses(programmingCourses);

        // all courses containing word spring
        System.out.println();
        System.out.println("Courses containg the word spring are: ");
       AllCourse.printCoursesContainingSpring(programmingCourses);

       // coures with atleast 4 letters
       System.out.println();
       System.out.println("Courses with at least four letters are:");
        AllCourse.printAllCoursesWithAtleastFourLetters(programmingCourses);

    }
}
