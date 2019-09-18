import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        int i = 5;
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
//
//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        do {
//            System.out.println(x);
//            x+=2;
//
//        }while( x <= 100);
//        Alter your loop to count backwards by 5's from 100 to -10.
//        int j = 100;
//        do {
//            j--;
//            if(j%5 == 0){
//                System.out.println(j);
//            }
//
//        }while( j >= -10);
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long k = 2;
//        do{
//           System.out.println(k);
//           k *= k;
//
//        }while( k < 1000000);
//        2
//        4
//        16
//        256
//        65536
//        For
//
//        Refactor the previous two exercises to use a for loop instead.
        //1
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
        //2a
//        for(int j = 0; j<=100; j++){
//            if(j%2 == 0){
//                System.out.println(j);
//            }
//        }
        //2b

//        for(int j = 100; j >=-10; j--) {
//            if (j % 5 == 0) {
//                System.out.println(j);
//            }
//        }

//        for(long k = 2; k <= 1000000;){
//            System.out.println(k);
//            k *= k;
//        }


//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (byte i = 1; i <= 100; i++) {
////            System.out.println(i);
//            int fizz = 1;
//
//            switch (fizz) {
//                case 1:
//                    if ((i % 3 == 0) && (i % 5 == 0)) {
//                        System.out.println("FizzBuzz");
//                        continue;
//                    }
//                case 2:
//                    if (i % 5 == 0) {
//                        System.out.println("Buzz");
//                        continue;
//                    }
//                case 3:
//                    if (i % 3 == 0) {
//                        System.out.println("Fizz");
//                        continue;
//                    }
//                default:
//                    System.out.println(i);
//                    break;
//            }
//        }
//        Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125
        //User Question
        //User continue
//        String yesNo = "Yes";
//        while (yesNo.equalsIgnoreCase("Yes") || yesNo.equalsIgnoreCase("y")) {
//            System.out.println("Please enter a number between 1-100:");
//            int answer = Integer.parseInt(input.nextLine());
//            System.out.println("Here is your table!");
//            String leftAlignFormat = " %-3d    | %-3d    |%-3d%n";
//            System.out.format(" number |squared | cubed %n");
//            for (int i = 1; i <= answer; i++) {
//                System.out.format(leftAlignFormat, i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
//            }
//            System.out.println("Would you like to continue adding numbers");
//            yesNo = input.nextLine();
//
//        }
//        System.out.println("Have a good day");
//        Convert given number grades into letter grades.
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.

        String yesNo = "Yes";
        while (yesNo.equalsIgnoreCase("Yes") || yesNo.equalsIgnoreCase("y")) {
        System.out.println("Please input a  a numerical grade from 0 to 100: ");
        String grade = input.nextLine();
        int userGrade = Integer.parseInt(grade);
        int letter = 1;

            switch (letter) {
                case 1:
                    if (userGrade <= 100 && userGrade >= 99) {
                        System.out.println("Yay! You got an A+!");
                        break;
                    }
                case 2:
                    if (userGrade <= 98 && userGrade >= 88) {
                        System.out.println("Yay! You got an A-!");
                        break;
                    }
                case 3:
                    if (userGrade <= 87 && userGrade >= 85) {
                        System.out.println("Yay! You got an B+!");
                        break;
                    }
                case 4:
                    if (userGrade <= 84 && userGrade >= 80) {
                        System.out.println("Yay! You got an B-!");
                        break;
                    }
                case 5:
                    if (userGrade <= 79 && userGrade >= 77) {
                        System.out.println("Yay! You got an C+!");
                        break;
                    }
                case 6:
                    if (userGrade <= 76 && userGrade >= 67) {
                        System.out.println("Yay! You got an C-!");
                        break;
                    }

                case 7:
                    if (userGrade <= 66 && userGrade >= 64) {
                        System.out.println("Yay! You got an D+!");
                        break;
                    }
                case 8:
                    if (userGrade <= 63 && userGrade >= 60) {
                        System.out.println("Yay! You got an D+!");
                        break;
                    }
                case 9:
                    if (userGrade <= 59 && userGrade >= 53) {
                        System.out.println("Yay! You got an F+!");
                        break;
                    }
                case 10:
                    if (userGrade <= 52 && userGrade >= 0) {
                        System.out.println("Yay! You got an F-!");
                        break;
                    }
                default:
                    System.out.println("Come on guy, get it together");
            }

            System.out.println("Would you like to continue?");
             yesNo = input.nextLine();

    }
        System.out.println("Better grades!");
//        Grade Ranges:
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
    }
}
