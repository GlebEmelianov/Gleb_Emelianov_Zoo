// Abstract class for all animals.

package zoo;

public abstract class Animal {
    protected String breathe;
    protected String move;
    protected String action;

    public Animal(String breathe, String move, String action) {
        this.breathe = breathe;
        this.move = move;
        this.action = action;
    }

    protected  String getBreathe() {return breathe;}

    protected String getMove() {return move;}
}
