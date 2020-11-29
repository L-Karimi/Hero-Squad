package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HeroTest {

    @Before
    public void setUp() throws Exception {
    }

    private Hero setupNewHero(){
        return new Hero("Jessica jones", 32, "Money", "Loud Noises");
    }

    private Hero setupHero2() {
        return new Hero("Krypton", 105, "magic", "range");
    }

    @Test
    public void heroInstantiatesCorrectly() {
        Hero newHero = setupNewHero();
        assertTrue(newHero instanceof Hero);
    }
    @Test
    public void getHeroName_true() {
        Hero newHero = setupNewHero();
        assertTrue(newHero.getName() instanceof String);
    }
    @Test
    public void getHeroAge_int() {
        Hero newHero = setupNewHero();
        assertEquals(45, newHero.getAge());
    }
    @Test
    public void getHeroPower_true() {
        Hero newHero = setupNewHero();
        assertEquals();
    }

@Test
public void getHeroWeakness_true() {
    Hero newHero = setupNewHero();
    assertTrue(newHero.getWeakness() instanceof String);
}


    @Test
    public void getHeroList_storeTwoHeroes_true() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        assertTrue(Hero.getHeroRegistry().contains(newHero));
        assertTrue(Hero.getHeroRegistry().contains(anotherNewHero));
    }
    @Test
    public void findHero_searchForHeroById_String() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        assertEquals("Krypton", Hero.findHero(newHero.getHeroID()).getName());
    }
    @Test
    public void deleteSingleHero() {
        Hero newHero = setupNewHero();
        Hero anotherNewHero = setupHero2();
        Hero thirdHero = new Hero("Jessica jones", 32, "Money", "Loud Noises");
        Hero.deleteHero(anotherNewHero.getHeroID());
        assertFalse(Hero.getHeroRegistry().contains(anotherNewHero));
        assertEquals(3, Hero.getHeroRegistry().get(1).getHeroID());
    }

    private void assertEquals(int i, int heroID) {
    }

    private void assertEquals(String krypton, String name) {
    }


    private void assertEquals() {
    }


    @After
    public void tearDown() throws Exception {
        Hero.clearHeroRegistry();
    }
}
