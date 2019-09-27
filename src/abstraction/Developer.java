package abstraction;

public class Developer extends Employee implements WritesCode {
    public String work(){
       return "Doing Stuff";
    }

    @Override
    public boolean debug(String bug) {
        return false;
    }

    @Override
    public void drinkCoffee() {
        System.out.println("...sipping");
    }
}
