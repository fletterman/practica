package practicum_6A;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Persoon {
    private String naam;
    private double budget;
    private List<Game> mijnGames;

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
        this.mijnGames = new ArrayList<>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game game){
        if (budget < game.huidigeWaarde()){
            return false;
        }
        for (Game game1 : mijnGames){
            if (game.equals(game1)){
                return false;
            }
        }
        mijnGames.add(game);
        budget -= game.huidigeWaarde();
        return true;
    }

    public boolean verkoop(Game game, Persoon koper){
        for (Game game1 : mijnGames){
            if (game1.equals(game)){
                if (koper.koop(game)) {
                    this.mijnGames.remove(game1);
                    this.budget += game.huidigeWaarde();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String games = "";
        for (Game game : mijnGames){
            games += game.toString();
        }
        return naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:" + games;
    }
}
