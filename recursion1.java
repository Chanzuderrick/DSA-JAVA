public class recursion1 {
    //this is what happens in the method
    /*
     * Step 1: First call

walk(5)

steps = 5

steps < 1? ❌ No

Print → "You take a step"

Call → walk(4)

Step 2: Second call

walk(4)

steps = 4

steps < 1? ❌ No

Print → "You take a step"

Call → walk(3)

Step 3: Third call

walk(3)

steps = 3

steps < 1? ❌ No

Print → "You take a step"

Call → walk(2)

Step 4: Fourth call

walk(2)

steps = 2

steps < 1? ❌ No

Print → "You take a step"

Call → walk(1)

Step 5: Fifth call

walk(1)

steps = 1

steps < 1? ❌ No

Print → "You take a step"

Call → walk(0)

Step 6: Sixth call (base case)

walk(0)

steps = 0

steps < 1? ✅ Yes

Return → stop recursion

No printing here
    */
    static void walk(int steps){
        //iterative method

        /*
         *    for(int i= 0; i<steps; i++){
            System.out.println("You take a step");

        }
        */
     

        if (steps < 1) {
            return;
        }
           
        
        
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