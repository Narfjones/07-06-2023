public class Loops {
    public static void main(String[] args){
        boolean bool = true;
        int x = 10;
        // While loop - does stuff while the condition is true
        // inside the parentheses is the condition - returns true or false
        // Condition must be a boolean value or contain a boolean operator
        while(!bool){
            // run some code
        }
        while(x != 10){
            // run some code
        }

        // Loops check the condition every iteration

        // Do-While loop checks the condition after it runs
        do{
            // run some code
        } while (!bool);

        // For loop is the most common loop
        // For loop is iterative(for moving through a list of stuff)
        // For loop keeps track of how many times it's been run
        for(int i = 1; i <= 100; i = i + 2){
            System.out.println(i + 1);
        }

        for(int i = 0; i < 100; i++){
            if(i%2 == 0 && i != 0){
                System.out.println(i);
            }
        }








    }
}
