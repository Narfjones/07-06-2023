public class Conditionals {

    public static void main(String[] args){
    int x = 10;
    String str = "Cheeseburger Mac";
    String str2 = "Corn on the Cob";
    

    // a conditional is just a boolean statement
    boolean bool = true; // boolean variable

    // boolean operators can only be true or false
    // (=, ==, >, <, =>, <=, &&, ||)
    // Use == when checkin the value of an variable


    // Conditional for integers (the condition is whatever is inside parentheses)
    if(x == 15 || x == 10){
        //Only runs this code if the condition is true
        // Skips the stuff in curly brackets if the condition is false
        x = 10;
    } else {
        // runs if no previous condition is true
        // only runs if the condition is false
        x = 20;
    }

    // Blackjack Conditional

    // Takes the player and dealer scores and decides if the player won
    void boolean didWin(int  player, int dealer){

        if(player == 21){
            return true;
        } else if(player > dealer){
            return true;
        } else {
            return false;
        }
    }

    // takes the current player score and decides if they hit or stay
    void boolean doIHit(int score){

        if(score <= 14){
            return true;
        } else if(score > 14 && score <= 21){
            return false;
        } else {
            System.out.println("You've busted. Should have stayed.")
            return false;
        }
    }

    // The NOT operator returns the opposite of a regular condition
    // != -> NOT equal
    // !> -> NOT greater than
    // !< -> NOT less than

    if (str != "Cheeseburger Mac"){
        System.out.println("I'm goin to Arby's. Be back in 15 minutes.");
    }

    // multiple conditional statements can be listed in an else/if statement
    if(str == "Cheeseburger Mac"){
        System.out.println("Eat Dinner");
    } else if(str == "Corn on the Cob"){
        System.out.println("Eat Dinner");
    } else {
        System.out.println("I'm goin to Arby's. Be back in 15 minutes.");
    }

    // Returns true if either statement is true
    if(str == "Cheeseburger Mac" || str == "Corn on the Cob"){
        System.out.println("Eat Dinner");
    } else {
        System.out.println("I'm goin to Arby's. Be back in 15 minutes.");
    }

    // When comparing strings, capitalization, punctuation, and whitespace matters
    // "cheeseburger mac" =/= "Cheeseburger Mac"
}

}
