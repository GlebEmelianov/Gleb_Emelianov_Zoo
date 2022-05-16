// Class that describes mammals (inherited from class Animal).

package zoo;

public class Mammal extends Animal {
    protected String nameOfMammal;
    private String action;

    public Mammal(String nameOfMammal, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfMammal = nameOfMammal;
        this.action = action;
    }

    public String getAction() {return action;}

    public String getNameOfMammal() {return nameOfMammal;}

}
