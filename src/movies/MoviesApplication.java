package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    // re-initializes the movie array to display newly added movie
    private static Movie[] movieArray = MoviesArray.findAll();

    public static void main(String[] args) {
        boolean userContinue = true;
        while (userContinue) {
            //get user movie input using input class
            Input userMovie = new Input();
            //creat new object to hold array of movies from movies array class
            MoviesArray obj = new MoviesArray();//get array of movies from movies array class
            MoviesArray newAdd = new MoviesArray();


            System.out.println("\n" +//display for user
                    "What would you like to do?\n" +
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
            int userSelection = userMovie.getInt(0, 6); //get int method from input class

            switch (userSelection) {
                case 0:
                    userContinue = false;
                    break;
                case 1:
                    for (Movie movie : movieArray) {
                        System.out.println(movie.getMovieName());
                    }
                    break;
                case 2:
                    for (Movie movie : movieArray) {
                        if (movie.getMovieCategory().equalsIgnoreCase("animated")) {
                            System.out.format("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
                        }
                    }
                    break;

                case 3:
                    for (Movie movie : movieArray) {
                        if (movie.getMovieCategory().equalsIgnoreCase("drama")) {
                            System.out.format("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
                        }
                    }
                    break;
                case 4:
                    for (Movie movie : movieArray) {
                        if (movie.getMovieCategory().equalsIgnoreCase("horror")) {
                            System.out.format("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
                        }
                    }
                    break;

                case 5:
                    for (Movie movie : movieArray) {
                        if (movie.getMovieCategory().equalsIgnoreCase("scifi")) {
                            System.out.format("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
                        }
                    }
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
        }
    }

    private static Movie[] addMovie(Movie[] movieArray, Movie category) {
        Movie[] newMovie = Arrays.copyOf(movieArray, movieArray.length + 1);
        newMovie[movieArray.length] = category;
        return newMovie;
    }

}
