import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class NegativeTest {

    @AfterGroups("Negative")
    public void groupTeardown() {
        System.out.println("Negative tests");
    }

    @Test(groups = "Negative")
    public void equalsTest() {
        int pointOfMenu = 0;
        Assert.assertEquals(pointOfMenu, pointOfMenu + 10);
    }

    @Test (groups = "Negative")
    public void trueTest() {
        String[] listOfAnimals = {"Lion", "Carp", "Parrot"};
        Assert.assertTrue(listOfAnimals.length < 2);
    }

    @Test (groups = "Negative")
    public void failTest() {
        System.out.println("Fail this test");
        Assert.fail();
    }
}
