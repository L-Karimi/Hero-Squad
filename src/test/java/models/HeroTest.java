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
        return new Hero("Kryptonite", 105, "magic", "range");
    }

    @Test
    public void heroInstantiatesCorrectly() {
        Hero newHero = setupNewHero();
        assertTrue(newHero instanceof Hero);
    }



    @After
    public void tearDown() throws Exception {

    }
}