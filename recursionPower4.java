public class recursionPower4 {

    // the method actually results in this
        //power(2, 8) 
        // = 2 * power(2, 7)
        // = 2 * (2 * power(2, 6))
        // = 2 * (2 * (2 * power(2, 5)))
        // = 2 * (2 * (2 * (2 * power(2, 4))))
        // = 2 * (2 * (2 * (2 * (2 * power(2, 3)))))
        // = 2 * (2 * (2 * (2 * (2 * (2 * power(2, 2))))))
        // = 2 * (2 * (2 * (2 * (2 * (2 * (2 * power(2, 1)))))))
        // = 2 * (2 * (2 * (2 * (2 * (2 * (2 * (2 * power(2, 0))))))))

    static int power(int base, int exponent) {
        if (exponent < 1) { //base case
            return 1;
        }

        return base * (power(base, exponent -1));
    }
    public static void main(String[] args) {
        int result = power(2, 8);
        System.out.println(result);
        
    }
    
}
