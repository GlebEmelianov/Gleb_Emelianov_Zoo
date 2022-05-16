import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class PositiveTest {

    @BeforeGroups ("Positive")
    public void groupSetup() {
        System.out.println("Positive tests");
    }

    @Test (groups = "Positive")
    public void notEqualTest() {
        String[] listOfAnimals = {"Lion", "Carp", "Parrot"};
        Assert.assertNotEquals(new String[]{"Lion", "Carp", "Parrot"}, new int[]{1, 2, 3});
    }

    @Test (expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void exceptionTest() {
        String[] listOfAnimals = {"Lion", "Carp", "Parrot"};
        System.out.println("1. " + listOfAnimals[4]);
    }

    @Test (groups = "Positive")
    public void falseTest() {
        String mammalType = "";
        Assert.assertFalse(mammalType.length() > 2);
    }

    }


