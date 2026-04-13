package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void allGsAreHappy_returnsTrueForDoubleG() {
        Assertions.assertTrue(new GHappy().gHappy("xxggxx"));
    }

    @Test
    public void singleG_returnsFalse() {
        Assertions.assertFalse(new GHappy().gHappy("g"));
    }

    @Test
    public void isolatedG_returnsFalse() {
        Assertions.assertFalse(new GHappy().gHappy("xxgxx"));
    }

    @Test
    public void trailingGWithoutPartner_returnsFalse() {
        Assertions.assertFalse(new GHappy().gHappy("xxggyygxx"));
    }

    @Test
    public void happyGAtBeginning_returnsTrue() {
        Assertions.assertTrue(new GHappy().gHappy("ggx"));
    }
}
