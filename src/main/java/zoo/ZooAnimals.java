// Class that describes different actions of different animals.

package zoo;

public class ZooAnimals {
    private static String mammalType = "";
    private static String fishType = "";
    private static String birdType = "";

    public static void typeOfMammal(Mammal mammal) {
        mammalType += String.format("Mammal %s %s, walks on %s, breathes %s\n", mammal.getNameOfMammal(),
                mammal.getAction(), mammal.getMove(), mammal.getBreathe());
        System.out.printf("%s %s, walks on %s, breathes %s\n", mammal.getNameOfMammal(),
                mammal.getAction(), mammal.getMove(), mammal.getBreathe());
    }

    public static void typeOfFish(Fish fish){
        fishType += String.format("Fish %s %s, swims %s, breathes %s\n", fish.getNameOfFish(),
                fish.getAction(), fish.getMove(), fish.getBreathe());
        System.out.printf("%s %s, swims in %s, breathes %s\n", fish.getNameOfFish(),
                fish.getAction(), fish.getMove(), fish.getBreathe());

    }

    public static void typeOfBird(Bird bird){
        birdType += String.format("Bird %s %s, flies %s, breathes %s\n", bird.getNameOfFish(),
                bird.getAction(), bird.getMove(), bird.getBreathe());
        System.out.printf("%s %s, flies in %s, breathes %s\n", bird.getNameOfFish(),
                bird.getAction(), bird.getMove(), bird.getBreathe());

    }

}
