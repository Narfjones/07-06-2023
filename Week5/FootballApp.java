package Week5;

public class FootballApp {
    

    public static void main(String[] args){
    FootballTeam storms = new TheStorms();
    FootballTeam joshes = new TheJoshes();

    storms.addScore(52);
    storms.addScore(21);
    storms.addScore(72);
    storms.addScore(2);

    joshes.addScore(27);
    joshes.addScore(36);
    joshes.addScore(12);

    System.out.println("The Storms average score per game is: " + storms.getAvgScore());
    System.out.println("The Joshes average score per game is: " + joshes.getAvgScore());


    }
}
