package Week5;

import java.util.List;
import java.util.ArrayList;

public class FootballTeam {
    
    private int players = 52;
    private String coach = "Coach";
    private String teamName = "TeamName";
    private int wins = 0;
    private int losses = 0;
    private int avgScore = 0;
    List<Integer> scores = new ArrayList<>();

    public FootballTeam(String coach, String teamName){
        this.coach = coach;
        this.teamName = teamName;
    }

    public FootballTeam(String coach, String teamName, int players){
        this.coach = coach;
        this.teamName = teamName;
        this.players = players;
    }


    // Setters
    public void setCoach(String coach){
        this.coach = coach;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public void setPlayers(int players){
        this.players = players;
    }

    public void setWins(int wins){
        this.wins = wins;
    }

    public void setLosses(int losses){
        this.losses = losses;
    }

    // Getters
    public String getCoach(){
        return this.coach;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public int getWins(){
        return this.wins;
    }

    public int getLosses(){
        return this.losses;
    }

    public int getPlayers(){
        return this.players;
    }


    // add a score to the list
    public void addScore(int score){
        this.scores.add(score);
    }

    // return the average score
    public int getAvgScore(){
        if (scores.size() > 0){ // If there are scores in the list
           int scoreSum = 0;
           for (int score : scores){
                scoreSum += score; // add them up
            }
            this.avgScore = scoreSum/scores.size(); // divide by the number of scores
            return this.avgScore;
        } else {
            System.out.println("There are no scores on this list. You need to be patient for goodnesssake, let the season start.");
            return -1; // -1 indicates that there are no scores
        }
    }



}
