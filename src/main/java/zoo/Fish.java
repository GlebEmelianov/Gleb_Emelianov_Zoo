// Class that describes fishes (inherited from class Animal).

package zoo;

public class Fish extends Animal {
    protected String nameOfFish;
    private String action;

    public Fish(String nameOfFish, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfFish = nameOfFish;
        this.action = action;
    }

    public String getAction() {return action;}

    public String getNameOfFish() {return nameOfFish;}
}
