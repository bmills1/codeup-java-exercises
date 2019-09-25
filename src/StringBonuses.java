import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class StringBonuses {
    public static void main(String[] args) {
//        ================================= JAVA STRING BONUSES
//
//                ----BONUS 1
//
//        Create date format converter application.
//                Take in the following format:
        Scanner input = new Scanner(System.in);
//        String dateFormat = "MM/DD/YYYY";
        System.out.println("Enter a date");
        String userDate = input.nextLine();
        String userMonth = userDate.substring(0, userDate.indexOf("/"));
        String userDay = userDate.substring (3, 5);
        String userYear = userDate.substring (6);
        System.out.println(userMonth);
        System.out.println(userDay);
        System.out.println(userYear);

//            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        for (int i=0; i < months.length; i++)
//        {
//            System.out.println(months[i]);
//        }


//        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        System.out.println("Enter a date");
//        String userDate = input.nextLine();
//        try {
//            Date date1 = dateFormat.parse(userDate);
//            System.out.println(date1);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }




//        MM/DD/YYYY

//        Output the following:
//
//        MonthName DD, YYYY
//
//        Example:
//
//        input - 12/01/1999
//        output - December 12, 1999
//
//
//                ----BONUS 2
//
//        Create an application that allows the user to enter a sentence
//        and tells them how many vowels and consonants were used.
//
//        Example:
//
//        input - "The hill are alive."
//        output - 5 vowels and 10 consonants
//
//
//                ----BONUS 3
//
//        Create a command line calculator application.
//
//        The program should welcome the user, prompt them for a calculation,
//        and give the result. The user should be prompted after each result is
//        outputted if they want to enter another calculation. When they
//        say no, give them an exit message. Allow the user first to specify
//        how many operands they will enter. Do not worry about
//        input validation (assume user enters correct data type).
//
//        Example program:
//
//...
//
//        WELCOME TO THE CALCULATOR APP!!! (program output)
//
//        Do you wish to enter a new calculation? (program output)
//        yes (user inputs this)
//
//        How many operands will you calculate? (program output)
//        2 (user inputs this)
//
//        Please enter a calculation: (program output)
//        2 + 2 (user enters this or something like this)
//        The output of 2 + 2 is 4. (program outputs this)
//
//        Do you wish to enter a new calculation? (program outputs this)
//        no (user enters this)
//
//        GOODBYE!!!
    }
}
