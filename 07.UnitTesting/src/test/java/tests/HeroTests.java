package tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rpg.Hero;
import rpg.Target;
import rpg.Weapon;

public class HeroTests {

    private static final int TARGET_XP = 10;
    public static final String DEFAULT_NAME = "Gosho";

    @Test
    public void testHeroGainsXPWhenTargetIsDead(){

    Target targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
                Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_XP);

                Weapon weapon = Mockito.mock(Weapon.class);

        Hero hero = new Hero(DEFAULT_NAME, weapon);
        hero.attack(targetMock);
        Assert.assertEquals(TARGET_XP, hero.getExperience());
        }
        }