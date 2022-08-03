package zoo;

public class Lion extends Mammal{
    private String makeSound;

    public Lion(String makeSound, String nameOfMammal, String action, String move, String breathe){
        super(breathe, move, action, nameOfMammal);
        this.makeSound = makeSound;
    }

    public String getSound() {return makeSound;}

}
