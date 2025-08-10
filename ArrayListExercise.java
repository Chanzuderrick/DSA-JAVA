import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExercise {
    /*
     * Exercise
     * Create an array and let the user enter in the elements
     * Display the array
    */
    public static void main(String[] main) {
        Scanner derrick = new Scanner(System.in);

        /*
         *       System.out.print("Please enter the number of elements you want: ");
        int n = derrick.nextInt();
        derrick.nextLine();
        
        String[] fruits = new String[n];
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("Enter an array element: ");
            fruits[i] = derrick.nextLine();
        
        }
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        */
        
        //lets use arrayLists method

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of food you'll like to store: ");
        int numOfFood = derrick.nextInt();
        derrick.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter the food number(" + i + "): ");
            String food = derrick.nextLine();
            foods.add(food);

        }

        Collections.sort(foods);
        
        System.out.println(foods);


  
        derrick.close();
        
    }
}
