import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.", pi);

/** Prompt a user to enter a integer and store that value in an int variable using the nextInt method*/
//        System.out.println("Enter an integer");
//        int userNum = scanner.nextInt();
//        System.out.println("User input: " + userNum);
/** Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.*/
//
//        System.out.println("Enter 3 words: ");
//        String words = scanner.nextLine();
//        String[] wordParts = words.split(" ");
//        for(String word: wordParts) {
//        System.out.println(word);
//        }
//        String wordOne = wordParts[0];
//        String wordTwo = wordParts[1];
//        String wordThree = wordParts[2];
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);
// What happens if you enter less than 3 words?//
// Runtime Error
//  What happens if you enter more than 3 words?//
// Only outputs the first 3 words

/**Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.*/
//        System.out.println("Please enter a sentence: ");
//        String userInput = scanner.next();
//        System.out.println(userInput);
//do you capture all of the words?
//No, it only captures the first word.

/**        Rewrite the above example using the nextLine method.*/
//        System.out.println("Please enter a sentence: ");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
//Prints the entire sentence.

//
/**        Calculate the perimeter and area of Codeup's classrooms.
 Prompt the user to enter values of length and width of a classroom at Codeup.*/
//
// Use the nextLine method to get user input and cast the resulting string to a numeric type.
//
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.
//Display the area and perimeter of that classroom.
//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width./

//        /* Get length from user*/
//        System.out.println("Please enter the length of Codeup's classroom in feet: ");
//        String length = scanner.nextLine();
//        int classLength = Integer.parseInt(length);
//        /* Get width from user*/
//        System.out.println("Please enter the width of Codeup's classroom in feet: ");
//        String width = scanner.nextLine();
//        int classWidth = Integer.parseInt(width);
//        /*Display length and width to user */
//        System.out.format("The class length is %d feet.\n", classLength);
//        System.out.format("The class width is %d feet.\n", classWidth);
//        /* Calculate area and perimeter*/
//        int classArea = classLength * classWidth;
//        int classPerimeter = (2 * classLength) + (2 * classWidth);
//        /* Display area and perimeter  to user*/
//        System.out.format("The area of the class is %d feet.\n", classArea);
//        System.out.format("The perimeter of the class is %d feet.\n", classPerimeter);
//
//
/**         Bonuses */
//Accept decimal entries.
//Calculate the volume of the rooms in addition to the area and perimeter.
        /* Get length from user*/
        System.out.println("Please enter the length of Codeup's classroom in feet: ");
        String length = scanner.nextLine();
        double classLength = Double.parseDouble(length);
        /* Get width from user*/
        System.out.println("Please enter the width of Codeup's classroom in feet: ");
        String width = scanner.nextLine();
        double classWidth = Double.parseDouble(width);
        /*Get Height from Users*/
        System.out.println("Please enter the height of Codeup's classroom in feet: ");
        String height = scanner.nextLine();
        double classHeight = (int) Double.parseDouble(height);
        /*Display length and width to user */
        System.out.format("The class length is %.2f feet.\n", classLength);
        System.out.format("The class width is %.2f feet.\n", classWidth);
        System.out.format("The class height is %.2f feet.\n", classHeight);
        /* Calculate area and perimeter*/
        double classArea = classLength * classWidth;
        double classPerimeter = (2 * classLength) + (2 * classWidth);
        double classVolume = classLength * classWidth * classHeight;
        /* Display area and perimeter  to user*/
        System.out.format("The area of the class is %.2f feet.\n", classArea);
        System.out.format("The perimeter of the class is %.2f feet.\n", classPerimeter);
        System.out.format("The volume of the class is %.2f feet.\n", classVolume);


//        The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//
//
//        scanner.useDelimiter("\n");
//        How does this change the way your program operates?
//
//        Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.

    }
}
