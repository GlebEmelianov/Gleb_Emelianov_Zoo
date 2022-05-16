// Class that describes birds (inherited from class Animal).

package zoo;

public class Bird extends Animal{
    protected String nameOfBird;
    private String action;

    public Bird(String nameOfBird, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfBird = nameOfBird;
        this.action = action;
    }

    protected String getAction() {return action;}

    protected String getNameOfBird() {return nameOfBird;}
}
