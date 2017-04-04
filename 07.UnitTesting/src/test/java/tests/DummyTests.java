package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg.Dummy;
import rpg.Target;

public class DummyTests {

    private static final int DEFAULT_DUMMY_HEALTH = 10;
    private static final int DEFAULT_DUMMY_XP = 10;
    private static final int DEFAULT_ATTACK_ON_DUMMY = 5;
    private static final int EXPECTED_HEALTH = 5;
    private Target target;

    @Before
    public void initialize(){
        this.target = new Dummy(DEFAULT_DUMMY_HEALTH, DEFAULT_DUMMY_XP);
    }

    @Test
    public void testDummyLosesHealthWhenAttacked(){
        this.target.takeAttack(DEFAULT_ATTACK_ON_DUMMY);
        Assert.assertEquals("Wrong Health!",this.target.getHealth(), EXPECTED_HEALTH);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyWhenAttacked(){
        while (this.target.getHealth() > 0){
            this.target.takeAttack(DEFAULT_ATTACK_ON_DUMMY);
        }
        this.target.takeAttack(DEFAULT_ATTACK_ON_DUMMY);
    }

    @Test
    public void testDeadDummyGivesXP(){
        while (this.target.getHealth() > 0){
            this.target.takeAttack(DEFAULT_ATTACK_ON_DUMMY);
        }
        this.target.giveExperience();
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyGivesXP(){
        target.giveExperience();
    }
}
