package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    // re-initializes the movie array to display newly added movie

    public static Movie[] movieArray = MoviesArray.findAll();

    public static void main(String[] args) {

        boolean userContinue;
        int userSelection;
        do {
            //display user menu
            displayMenu();
            Input userInput = new Input();//get user movie input using input class
            userSelection = userInput.getInt(0, 6); //get int method from input class
            userContinue = processChoice(userSelection);
        } while (userContinue);

    }

    public static void displayMenu() {
        System.out.println(//display for user
                "\n" + "What would you like to do?\n" +
                        "\n" +
                        "0 - exit\n" +
                        "1 - view all movies\n" +
                        "2 - view movies in the animated category\n" +
                        "3 - view movies in the drama category\n" +
                        "4 - view movies in the horror category\n" +
                        "5 - view movies in the scifi category\n" +
                        "6 - add a new movie\n" +
                        "\n" +
                        "Enter your choice:");
    }

    public static boolean processChoice(int userSelection) {
        boolean output = true;
        switch (userSelection) {
            case 0:
                output = false;
                System.out.println("Exit!");
                break;
            case 1:
                displayMovies();
                break;
            case 2:
                displayMovies("animated");
                break;

            case 3:
                displayMovies("drama");
                break;
            case 4:
                displayMovies("horror");
                break;

            case 5:
                displayMovies("scifi");
                break;
            case 6:
                Input addName = new Input();
                Input addCategory = new Input();

                System.out.println("Please enter the name of your new movie: ");
                String userNameAdded = addName.getString();

                System.out.println("Please enter the category of your new movie: ");
                String userCategoryAdded = addCategory.getString();

                movieArray = addMovie(movieArray, new Movie(userNameAdded, userCategoryAdded));
                System.out.println("\n" +
                        "You've added " + movieArray[movieArray.length - 1].getMovieName() + " to the " + movieArray[movieArray.length - 1].getMovieCategory() + " category");
                break;
            default:
                System.out.println("K, bye");
        }
        return output;
    }

    public static void displayMovies() {
        String output = "";
        for (Movie movie : movieArray) {
            output += String.format("%s -- %s \n", movie.getMovieName(), movie.getMovieCategory());
        }
        System.out.println(output);
    }

    public static void displayMovies(String category) {
        String output = "";

        for (Movie movie : movieArray) {
            if (movie.getMovieCategory().equalsIgnoreCase(category)) {
                System.out.format("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
            }
        }
        System.out.println(output);
    }


    private static Movie[] addMovie(Movie[] movieArray, Movie category) {
        Movie[] newMovie = Arrays.copyOf(movieArray, movieArray.length + 1);
        newMovie[movieArray.length] = category;
        return newMovie;
    }

}
