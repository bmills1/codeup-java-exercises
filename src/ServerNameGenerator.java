import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String adj = random(adjectives);
        String noun = random(nouns);
        System.out.format("\n" +
                "Here is your server name:\n %s-%s", adj, noun);

    }


    private static String[] adjectives = {"amusing", "anchored", "ancient", "blond", "blue", "blushing", "bountiful"};
    private static String[] nouns = {"area", "book", "business", "case", "child", "company", "day", "eye", "family"};
//    Create a method that will return a random element from an array of strings.

    static String random(String[] arr) {
        String word = arr[new Random().nextInt(arr.length)];
        return word;

    }
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

}
