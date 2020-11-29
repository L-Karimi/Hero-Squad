package models;
import  static spark.Spark.*;
import  models.Hero;
import models.Squad;
import  spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
            public static void main(String[] args) {
            staticFileLocation("/public");

            ProcessBuilder process = new ProcessBuilder();
            int port;

            if (process.environment().get("PORT") != null) {
                port = Integer.parseInt(process.environment().get("PORT"));
            } else {
                port = 4567;
            }

            port(port);
                get("/", (request, response) -> {
                    Map<String, Object> model = new HashMap<>();
                    int totalHeroes = Hero.getHeroRegistry().size();
                    int totalSquads = Squad.getAllSquads().size();
                    int squadlessHeroes = 0;
                    int squadfullHeroes = 0;
                    for (Hero hero : Hero.getHeroRegistry()) {
                        if (hero.getSquadAlliance().equals("")) {
                            squadlessHeroes += 1;
                        } else {
                            squadfullHeroes += 1;
                        }
                    }
                    model.put("totalHeroes", totalHeroes);
                    model.put("totalSquads", totalSquads);
                    model.put("squadlessHeroes", squadlessHeroes);
                    model.put("squadfullHeroes", squadfullHeroes);
                    model.put("uniqueId", request.session().attribute("uniqueId"));
                    return new ModelAndView(model, "index.hbs");
                }, new HandlebarsTemplateEngine());


    }
}






