public class recursion2{
    public static void main(String[] args){
        //RECURSION
        walk(5);

    }

    private static void walk(int steps) {
        if (steps < 1) { //base step
            return;
        }

        System.out.println("You are walking");

        walk(steps -1); // recursive case
            



    } 
}