
import java.util.HashMap;

public class hashMaps1{
    public static void main(String[] args){
        /*
         * HASHMAPS
         * a data structure that stores key- value pairs
         * keys are unique, but values can be duplicated
         * does not maintain any order, but is memory efficient 
        */
        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("lemon", 10.0);
        map.put("pineapple", 0.8);
        map.put("orange", 0.678); //hashmaps cannot have duplicate keys. if you put another key itll override the previous key
      // map.remove("apple");


        System.out.println(map); // display all 
       // System.out.println(map.get("orange"));
       // System.out.println(map.containsKey("BANANA")); //Checks whether the key exists

       /*
       * 
       if (map.containsKey("apple")) {
          System.out.println( "The price of the apple is:  " +map.get("apple"));
       } else {
          System.out.println("apple not found");
       }
       */
      
       //System.out.println(map.containsValue(0.50));
       System.out.println(map.size());

       for (String key : map.keySet()) {
           System.out.println(key + " : " + map.get(key));
       }



        

    }
}