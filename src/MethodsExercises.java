import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(returnAddition(10, 10));
//        System.out.println(returnSubtraction(10,10));
//        System.out.println(returnMultiplication(3,10));
//        System.out.println(returnDivision(10,10));
//System.out.println(returnMath("add", 3,3));
//        System.out.println(returnMath("subtract" 2));
//        System.out.println("Enter a number between 1 and 10: ");
//        factorial(1, 10);
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(5));


    }

    //}
//    Basic Arithmetic
//
//    Create four separate methods. Each will perform an arithmetic operation:
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//
//        Test your methods and verify the output.
//
//        Add a modulus method that finds the modulus of two numbers.
//
//        Food for thought: What happens if we try to divide by zero? What should
//        happen? Infinity
//
//        Addition
//    public static double returnAddition(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    //        Subtraction
//    public static double returnSubtraction(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    //        Multiplication
//    public static int returnMultiplication(int num1, int num2) {
//        int total = 0;
//        for (int i = 0; i < num1; i++) {
//            total += num2;
//        }
//        return total;
//    }
//
//    //        Division
//    public static double returnDivision(double num1, double num2) {
//        return num1 / num2;
//    }

    //    Bonus
//
//    Create your multiplication method without the * operator (Hint: a loop might be helpful).
//    Do the above with recursion.
//2. Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//
//    public static int getInteger(int min, int max);
//    and is used like this:
//
//    int userInput = getInteger(1, 10);
//    If the input is invalid, prompt the user again.
//
//    Hint: recursion might be helpful here!
//
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int userNum = sc.nextInt();
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Invalid Range");
            }
        } else {
            System.out.print("Invalid Input");
        }
        return 0;
//       int userInput = getInteger(1, 10);
    }

    //    Calculate the factorial of a number.
//    Prompt the user to enter an integer from 1 to 10.
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        if (sc.hasNextInt()) {
//            int userNum = sc.nextInt();
//            if (userNum >= min && userNum <= max) {
//                return userNum;
//            } else {
//                System.out.println("Invalid Range");
//            }
//        } else {
//            System.out.print("Invalid Input");
//        }
//        return 0;
////       int userInput = getInteger(1, 10);
//    }
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:
//
//
//            1! = 1               = 1
//            2! = 1 x 2           = 2
//            3! = 1 x 2 x 3       = 6
//            4! = 1 x 2 x 3 x 4   = 24

    public static int factorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
//
//    Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number.
//    All user inputs are validated.
//    If user's guess is less than the number, it outputs "HIGHER".
//    If user's guess is more than the number, it outputs "LOWER".
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.
//    Bonus
//
//    Keep track of how many guesses a user makes.
//    Set an upper limit on the number of guesses.



}
//
