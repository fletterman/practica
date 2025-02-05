package practicum_6B;

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

    public Game zoekGameOpNaam(String naam){
        Game game = null;
        for (Game games : mijnGames){
            if (games.getNaam() == naam){
                game = games;
            }
        }
        return game;
    }

    public ArrayList<Game> bepaalGamesNietInBezit(ArrayList<Game> games){
        for (Game mijnGame : mijnGames){
            for (Game game : games){
                if (mijnGame.getNaam() == game.getNaam()){
                    games.remove(game);
                }
            }
        }
        return games;
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
