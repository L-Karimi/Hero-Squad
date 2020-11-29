package models;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;


public class Squad {
    private String squadName;
    private String cause;
    private static boolean isRegisteredHero = false;
    private List<Hero> heroMembers = new ArrayList<>();
    private static List<Squad> squadList = new ArrayList<>();
    private int squadId;
    private boolean isSquadFull = false;
    private Object Name;

    public Squad(String name, String cause, Hero hero) {
        this.squadName = name.trim();
        this.cause = cause.trim();
        crossCheckHero(hero.getHeroID());



     if (isRegisteredHero) {
        hero.setSquadAlliance(squadName);
        heroMembers.add(hero);
        squadList.add(this);
        this.squadId = squadList.size();
    } else {
        System.out.println("HERO ISN'T REGISTERED");
    }
}

    private void crossCheckHero(int heroID) {
    }
}