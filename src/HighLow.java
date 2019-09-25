//import java.util.Scanner;
//
//public class HighLow {
//    public static void main(String[] args) {
//
////        Game Development 101
////        Welcome to the world of game development!
////
////                You are going to build a high-low guessing game. Create a class named HighLow inside of src.
////
////        The specs for the game are:
////
////        Game picks a random number between 1 and 100.
////        Prompts user to guess the number.
////        All user inputs are validated.
////                If user's guess is less than the number, it outputs "HIGHER".
////        If user's guess is more than the number, it outputs "LOWER".
////        If a user guesses the number, the game should declare "GOOD GUESS!"
////        Hints
////
////        Use the random method of the java.lang.Math class to generate a random number.
////        Bonus
////
////        Keep track of how many guesses a user makes.
////                Set an upper limit on the number of guesses.
//
//
//    }
//
//
//    public static int guessNum(int min, int max) {
//        String userContinue = "Yes";
//        while (userContinue.equalsIgnoreCase("Yes")) {
//            System.out.println("Guess a number between 1-100: ");
//            Scanner sc = new Scanner(System.in);
//            int userInput = Integer.parseInt(sc.nextLine());
//            System.out.println("You guessed : " + userInput);
//            int x = (int) (Math.random() * ((100 - 1) + 1)) + 1;
//            int guess = 1;
//
//
//            switch (guess) {
//                case 1:
//                    if (userInput < x) {
//                        System.out.println("HIGHER!");
//                        break;
//                    }
//                case 2:
//                    if (userInput > x) {
//                        System.out.println("LOWER!");
//                        break;
//                    }
//                case 3:
//                    if (userInput == x) {
//                        System.out.println("GOOD GUESS!");
//                        break;
//                    }
//                default:
//                    System.out.println("This is not a valid input");
//            }
//
//            System.out.println("Enter a new number: ");
//            userContinue = sc.nextLine();
//        }
//
//    }
//
//
//}
