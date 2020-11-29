package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("ALL")
public class SquadTest {

    @Before
    public void setUp() throws Exception {
    }



    @After
    public void tearDown() throws Exception {
        Hero.clearHeroRegistry();
    }
}