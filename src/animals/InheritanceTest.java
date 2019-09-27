package animals;

public class InheritanceTest {
    public static void main(String[] args) {
        Dog pico = new Dog();
        pico.setName("Pico");
        pico.setSpecies("dog");
        pico.setBreed("chihuahua");
        pico.setAge(24);
        pico.setAlive(false);
        System.out.format("\n" +
                        "Animal Species: %s\n" +
                        "Dog Breed: %s\n" +
                        "Dog Name: %s\n" +
                        "Dog Age: %d\n" +
                        "Dog Alive: %b\n",
                pico.getSpecies(),
                pico.getBreed(),
                pico.getName(),
                pico.getAge(),
                pico.isAlive);
    }
}
