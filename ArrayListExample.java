import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample{
    public static void main(String[] args){
        //ArrayList = A resizable array that stores objects (auto boxing)
        //Arrays are fixed in size, but Array lists can change in size

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("pineapple");
        fruits.add("lemon");
        fruits.add("mango");
        fruits.add("passion");
        //fruits.remove("passion");
        //fruits.set(2, "apple");
        //fruits.remove(0);
        Collections.sort(fruits);
       

        System.out.println(fruits);
        System.out.println(fruits.get(3));
        System.out.println(fruits.size());


    }
}