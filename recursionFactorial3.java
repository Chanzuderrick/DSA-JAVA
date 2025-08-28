public class recursionFactorial3 {

    /*
     * This is what happens in the recursion method
    */

        // factorial(7) 
        //= 7 * factorial(6)
        //= 7 * (6 * factorial(5))
        //= 7 * (6 * (5 * factorial(4)))
        //= 7 * (6 * (5 * (4 * factorial(3))))
        //= 7 * (6 * (5 * (4 * (3 * factorial(2)))))
        //= 7 * (6 * (5 * (4 * (3 * (2 * (1 * factorial(0)))))))
        //= 7 * (6 * (5 * (4 * (3 * (2 * factorial(1))))))

    //

    static int factorial(int number) {
        if (number < 1) {
            return 1;
        }
        return number * factorial(number - 1); //recursive case
        
    }
    public static void main(String[] args) {
        int result = factorial(7);
        System.out.println(result);
    }


    
}
