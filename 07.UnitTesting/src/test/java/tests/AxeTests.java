package tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg.Axe;
import rpg.Dummy;
import rpg.Target;
import rpg.Weapon;

public class AxeTests {

    private static final int DEFAULT_AXE_ATTACK = 10;
    private static final int DEFAULT_AXE_DURABILITY = 10;
    private static final int DEFAULT_DUMMY_HEALTH = 10;
    private static final int DEFAULT_DUMMY_XP = 10;
    private Weapon weapon;
    private Target target;

    @Before
    public void initialize(){
        this.weapon = new Axe(DEFAULT_AXE_ATTACK, DEFAULT_AXE_DURABILITY);
        this.target = new Dummy(DEFAULT_DUMMY_HEALTH, DEFAULT_DUMMY_XP);
    }

    @Test
    public void testAxeDurabilityLoss(){
        this.weapon.attack(target);
        Assert.assertEquals("Wrong health.",
                DEFAULT_DUMMY_HEALTH - DEFAULT_AXE_ATTACK,
                target.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testBrokenAxeAttack(){
        while (this.weapon.getDurabilityPoints() > 0){
            this.weapon.attack(this.target);
        }
        weapon.attack(target);
    }
}
