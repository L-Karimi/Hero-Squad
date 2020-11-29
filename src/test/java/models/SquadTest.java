package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }
    private Hero setupNewHero() {
        return new Hero("Jessica jones", 32, "Money", "Loud Noises");
    }

    private Hero setupHero2() {
        return new Hero("Krypton", 105, "magic", "range");
    }
    private Squad setupNewSquad(Hero hero) {
        return new Squad("Justice League", "Just Exist", hero);
    }
    private Squad setupNewSquad2(Hero hero) {
        return new Squad("Avengers", "Just Exist again", hero);
    }
    @Test
    public void squadInstanciatedCorrectly() {
        Squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad instanceof Squad);
    }
    @Test
    public void getSquadName() {
        Squad squad = setupNewSquad(setupNewHero());
        assertTrue(squad.getName() instanceof String);
    }

    @After
    public void tearDown() throws Exception {
        Hero.clearHeroRegistry();
    }
}