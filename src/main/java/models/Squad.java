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

}


    public static List<Squad> getAllSquads() {
        return squadList;
    }

    public String getName() {
        return (String) Name;
    }

    public void removeMember(Hero heroToDelete) {
//        return null;
    }
}