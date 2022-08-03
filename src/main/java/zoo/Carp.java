package zoo;

public class Carp extends Fish{
    private String makeSound;

    public Carp(String makeSound, String nameOfFish, String action, String move, String breathe){
        super(breathe, move, action, nameOfFish);
        this.makeSound = makeSound;
    }

    public String getSound() {return makeSound;}

}
