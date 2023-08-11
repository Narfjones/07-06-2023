package Week5;

public class TheJoshes extends FootballTeam{
    
    public TheJoshes(){
        super("Josh", "The Joshes");
    }

    public void addScore(int score){
        this.scores.add(score*2);
    }



}
