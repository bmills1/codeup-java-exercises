package grades;

import java.util.Scanner;
import java.util.HashMap;


//    2. Create a map for students and GitHub usernames
//
//    Create a class named GradesApplication with a main method. Inside the main method,
//    create a HashMap named students. It should have keys that are strings that represent
//    github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map.
//    Be creative! Make up GitHub usernames and grades for your student objects.

//   3. Create the command line interface
//
//Print the list of GitHub usernames out to the console, and ask the user which student they would
// like to see more information about. The user should enter a GitHub username (i.e. one of the keys
// in your map). If the given input does not match up with a key in your map, tell the user that no
// users with that username were found. If the given username does exist, display information about
// that student, including their name and their grades.
//
//After the information is displayed, the application should ask the user if they want to continue,
// and keep running so long as the answer is yes.


public class GradesApplication {
    static HashMap<String, Student> students;
    // creating a new instance of a collection ,from the Student class, called students.
    //the String parameter is the username we are going to be assigning, and Student is the data type of the new object.


    private static void init() {

        students = new HashMap<String, Student>(); //redundant but there for my reference

        //new Student objects, from the Student class, that are in our new HashMap called students
        Student annette = new Student("Annette");
        annette.addGrade(90); // addGrade method from the Student class
        annette.addGrade(85);
        annette.addGrade(40);

        Student bridget = new Student("Bridget");
        bridget.addGrade(90);
        bridget.addGrade(70);
        bridget.addGrade(60);


        Student bev = new Student("Bev");
        bev.addGrade(97);
        bev.addGrade(96);
        bev.addGrade(95);


        Student glo = new Student("Glo");
        glo.addGrade(94);
        glo.addGrade(93);
        glo.addGrade(92);


        // sets the usernames as keys
        // and values that are student objects
        students.put("bmills", bridget);
        students.put("annette1", annette);
        students.put("bevvybev", bev);
        students.put("thegloUp", glo);

    }

    // enhanced-for loop that iterates through the hashmap and prints the key (which is the username,
    // in this case) out to the console

    private static void userDisplay() {
        String nameList = " | ";
        for (String username : students.keySet()) {
            nameList += " " + username + " | ";
        }
        System.out.println(nameList);
    }

    private static void classAverage() {

        Scanner userInput = new Scanner(System.in);
        double allGradesTotal = 0;
        double classTotal = 0;

        for (String grades : students.keySet()) {
//            System.out.println( students.get(grades).getGrades());
            for (int grade : students.get(grades).getGrades()) {
                allGradesTotal++;
                classTotal += grade;
            }
        }
        System.out.println("The total class average is: " + classTotal / allGradesTotal + "\n");
        welcomeMsg();
        userOptions(Integer.parseInt(userInput.nextLine()));

    }

    private static void clvReport() {
        Scanner userInput = new Scanner(System.in);

           System.out.printf("%7s,%7s,%7s%n","name","github_username","average");
        for (String username : students.keySet()) {
            System.out.printf("%7s,%7s,%.2f%n",students.get(username).getName(), username, students.get(username).getGradeAverage() );
        }
        welcomeMsg();
        userOptions(Integer.parseInt(userInput.nextLine()));
    }





    ///Print the list of GitHub usernames out to the console, and ask the user which student they would
    //// like to see more information about. The user should enter a GitHub username (i.e. one of the keys
    //// in your map). If the given input does not match up with a key in your map, tell the user that no
    //// users with that username were found. If the given username does exist, display information about
    //// that student, including their name and their grades


    private static void userSelection(String key) {
        // compare userInput with usernames
        if (students.containsKey(key)) {
            System.out.printf("Name: %s - Github Username: %s%n", students.get(key).getName(), key);
            System.out.printf("Current Average: %.2f%n", students.get(key).getGradeAverage());
            System.out.printf("All grades: %s \n", students.get(key).getGrades().toString());
            //System.out.printf("Student grades are: %s", students.get(key).addGrade());
            // output student record
        } else {
            System.out.printf("Sorry, no student found with the github username of \"%s\".%n", key);
        }
    }

    private static void userOptions(int userNum) {

        switch (userNum) {
            case 1:
                gitHubDetails();
            case 2:
                classAverage();
            case 3:
                clvReport();
            case 4: keepGoing = false;
                System.out.println("Exit");
        }
    }

    private static void welcomeMsg() {
        System.out.println(
                "\nPlease make a selection: \n" +
                        "1 - Get github user grades and average\n" +
                        "2 - Get total class average \n" +
                        "3 - Get cvs report of all students \n"+
                        "4 - Get cvs report of all students");

    }

    private static boolean keepGoing;
    private static void gitHubDetails() {
        System.out.println("Hello there! Here is a list of our users: \n");
        userDisplay();
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nWhich student would you like to see more information about? (Enter a Github username) : \n");
            String userChoice = userInput.nextLine();
            userSelection(userChoice);


            System.out.println("\nWould you like to see more about another student? \n");
            String userContinue = userInput.nextLine();

            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")) {
                keepGoing = true;
            } else {
                System.out.println("Okay, bye!");
                welcomeMsg();
                userOptions(Integer.parseInt(userInput.nextLine()));
                keepGoing = false;
            }

        } while (keepGoing);
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        init();
        classAverage();
        welcomeMsg();
        userOptions(Integer.parseInt(userInput.nextLine()));


    }

}

