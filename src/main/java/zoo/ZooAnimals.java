// Class that describes different actions of different animals.

package zoo;


public class ZooAnimals {
    private static String mammalType = "";
    private static String fishType = "";
    private static String birdType = "";

    private static String mammalSound = "";
    private static String fishSound = "";
    private static String birdSound = "";

    public static void typeOfMammal(Mammal mammal) {
        mammalType += String.format("Mammal %s %s, walks on %s, breathes %s\n", mammal.getNameOfMammal(),
                mammal.getAction(), mammal.getMove(), mammal.getBreathe());
        System.out.printf("I am %s, I walk on %s and breathe %s\n", mammal.getNameOfMammal(), mammal.getMove(), mammal.getBreathe());
    }

    public static void mammalSound(Lion lion) {
        mammalSound += String.format("Lion %s", lion.getSound());
        System.out.printf("Lion %s\n", lion.getSound());
    }

    public static void typeOfFish(Fish fish){
        fishType += String.format("Fish %s %s, swims %s, breathes %s\n", fish.getNameOfFish(),
                fish.getAction(), fish.getMove(), fish.getBreathe());
        System.out.printf("I am %s, I swim in %s and breathe %s\n", fish.getNameOfFish(), fish.getMove(), fish.getBreathe());
    }

    public static void fishSound(Carp carp) {
        fishSound += String.format("Carp %s", carp.getSound());
        System.out.printf("Carp %s\n", carp.getSound());
    }

    public static void typeOfBird(Bird bird){
        birdType += String.format("Bird %s %s, flies %s, breathes %s\n", bird.getNameOfBird(),
                bird.getAction(), bird.getMove(), bird.getBreathe());
        System.out.printf("I am %s , I fly in %s and breathe %s\n", bird.getNameOfBird(),
                bird.getMove(), bird.getBreathe());
    }

    public static void birdSound(Parrot parrot) {
        birdSound += String.format("Parrot %s", parrot.getSound());
        System.out.printf("Parrot %s\n", parrot.getSound());
    }

}
