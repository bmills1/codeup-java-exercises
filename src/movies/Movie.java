package movies;

public class Movie {
    private String name;
    private String category;
//    name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).

    public Movie(String movieName,String movieCategory){
        setMovieName(movieName);
        setMovieCategory(movieCategory);
    }
//    public Movie(String movieCategory){
//        setMovieCategory(movieCategory);
//    }
    public String getMovieName(){
        return this.name;
    }
    public void setMovieName(String movieName){

        this.name = movieName;
    }
    public String getMovieCategory(){
        return this.category;
    }
    public void setMovieCategory(String movieCategory){

        this.category = movieCategory;
    }

}
