// Class that describes birds (inherited from class Animal).

package zoo;

public class Bird extends Animal{
    private String nameOfBird;

    public Bird(String nameOfBird, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfBird = nameOfBird;
    }

    public String getAction() {return action;};

    public String getNameOfFish() {return nameOfBird;};
}
