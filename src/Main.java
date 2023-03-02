// Packages and Import Keyword
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int number = 100;
        double numberTow = 10.02;
        String name = "Eduardo";
//        Date date = new Date();

        // Data Types

        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // Naming Variables
        double pi = 3.1415;

        // The String Class
       String nameT = new String("Eduardo");
       System.out.println(nameT.toUpperCase());


       // Packages and Import Keyword
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // Arithmetic Operations
        int ten = 10;
        int two = 2;
        int addition = ten + two;
    }
}