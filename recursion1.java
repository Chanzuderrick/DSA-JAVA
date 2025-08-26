public class recursion1{
    static void walk(int steps){
        //iterative method

        /*
         *    for(int i= 0; i<steps; i++){
            System.out.println("You take a step");

        }
        */
     

        if (steps < 1)  return ;
           
        
        
        System.out.println("You take a step");
        walk(steps - 1);

    }
    public static void main(String[] args){
        /*
         * RECURSION
         * = When a thing is defined in terms of itself
         * apply the result of a procedure, to a procedure
         * a recursive method calls itself, and can be substituted for iteration
         * Divide a problem into subproblems of the same type as the original
         * Commonly used with advanced sorting algorithms and navigating trees
         * 
         * ADVANTAGES
         * Easier to read/write
         * easier to debug
         * 
         * Disadvantages
         * sometime slower
         * uses more memory
         * 
         * 
        */

        walk(5);
    }
}