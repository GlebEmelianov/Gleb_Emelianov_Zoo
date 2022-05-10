// Class that describes mammals (inherited from class Animal).

package zoo;

public class Mammal extends Animal {
    private String nameOfMammal;

    public Mammal(String nameOfMammal, String action, String move, String breathe) {
        super(breathe, move, action);
        this.nameOfMammal = nameOfMammal;
    }

    public String getAction() {return action;}

    public String getNameOfMammal() {return nameOfMammal;}

}
