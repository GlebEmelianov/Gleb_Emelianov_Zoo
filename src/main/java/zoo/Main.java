/* Create different animals. Show menu to a user and ask the user to choose point of menu.
For each point of menu show information about animal.
*/

package zoo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int pointOfMenu = 0;

        String[] listOfAnimals = {"Lion", "Carp", "Parrot"};

        Scanner scanner = new Scanner(System.in);

        Mammal Lion = new Mammal("Lion", "roars", "earth", "air");
        Fish Carp = new Fish("Carp", "blows bubbles", "water", "water");
        Bird Parrot = new Bird("Parrot", "talks", "air", "air");

        while (true) {

            System.out.println("1. " + listOfAnimals[0]);
            System.out.println("2. " + listOfAnimals[1]);
            System.out.println("3. " + listOfAnimals[2]);
            System.out.println("0. Exit");

            System.out.println("Please, choose point of menu");



                try {
                    pointOfMenu = new Scanner(System.in).nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Incorrect data. Please, choose number from 0 to 3");
                    continue;
                }


            if (pointOfMenu == 0)
                break;


            switch (pointOfMenu) {

                case 1:
                    ZooAnimals.typeOfMammal(Lion);
                    break;
                case 2:
                    ZooAnimals.typeOfFish(Carp);
                    break;
                case 3:
                    ZooAnimals.typeOfBird(Parrot);
                    break;
            }
        }
    }
}
