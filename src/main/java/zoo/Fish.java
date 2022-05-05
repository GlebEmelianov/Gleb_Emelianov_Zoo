// Class that describes fishes (inherited from class Animal).

package zoo;

public class Fish extends Animal {
    private String nameOfFish;

    public Fish(String nameOfFish, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfFish = nameOfFish;
    }

    public String getAction() {return action;};

    public String getNameOfFish() {return nameOfFish;};
}
