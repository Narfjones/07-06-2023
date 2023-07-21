public class ArraysAndMethods {
    
    static String str = "Bj is awesome at American gladiators in the NES";

    // scope - where objects(variables) are accessible

    public static void main(String[] args){

        int num = sumTwo(5, 6);

        System.out.println(num);

        arrayBuilder(5);
        hahaIStoleYourVariable();

    }

    public static int sumTwo(int a, int b){
        int res = a + b;
        return res;
    }

    public static void arrayBuilder(int a){
        // array is just a list of things
        // all the objects in an array have to be the same type
        // immutable - once created, they cannot be changed

        // declare the array
        int[] arr = new int[a];
        // arr is a method scope - only available inside this method

        // fill in this array with numbers
        for(int i = 0; i < a; i++){
            arr[i] = i + 1;
        }
        // i is in the loop scope - nothing outside the loop knows about i

        // print the array in a for/each loop
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void hahaIStoleYourVariable(){
        int[] arr = new int[5];

        System.out.println(str);

    }




}
