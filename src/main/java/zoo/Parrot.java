package zoo;

public class Parrot extends Bird {
    private String makeSound;

    public Parrot(String makeSound, String breath, String move, String action, String nameOfBird){
        super(breath, move, action, nameOfBird);
        this.makeSound = makeSound;
    }

    public String getSound() {return makeSound;}
}
