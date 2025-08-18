public class App {
    public static void main(String[] args) throws Exception {
       DynamicArray dynamicArray = new DynamicArray(5);
       //System.out.println(dynamicArray.capacity);
       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       dynamicArray.insert(0, "x");
       dynamicArray.delete("A");
       

       System.out.println(dynamicArray.search("C"));
       
       

       System.out.println(dynamicArray);
       System.out.println("SIZE: " +dynamicArray.size);
       System.out.println("CAPACTITY: " +dynamicArray.capacity);
       System.out.println("EMPTY: " +dynamicArray.isEmpty());
    }
}
