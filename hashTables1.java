import java.util.Hashtable;

public class hashTables1 {
    public static void main(String[] args) {
        /*HASHTABLES
         * It contains entry(k, v)
         * eg. 100 spongebob
         * 123 patrick
         * 321 sandy
         * 777 gary
         * 555 squidward
         * 
         * So lets say we want to put it into a hashtable which has a storage of 10 (from 0 to 9)
         * we pass it the k in the key.hashCode() so we can know where to place it
         * we will use modulus. we will divide all the keys by 10. The modulus will be the index
         * we actually divide the k with the capacity and group it based on the modulus
         * 
         * 
         * COLLISISON
         * lets say we find the 'hashtables' to have some equal indices
         * lets say sandy and patrick end up having 0 index then we will turn it into a linked list (most common resolution)
         * that process is known as chaining
         * 
         * SUMMARY
         * HashTable    = a data structure that stores unique keys to values eg <Integer, Strings>
         *              = each key/ value pair is known as an entry
         *              = FAST insertion, look up, deletion of key/value pairs
         *              = not ideal for small data sets, great with large data sets
         * 
         * Hashing      = takes a key and computes an integer (formula will be based on key and data type)
         *              = in a hashTable, we use the hash % capacity to calculate an index number
         *              = key.hashCode() % capacity = index
         * 
         * Bucket       = an indexed storage location for one or more entries
         *              = can store multiple entries in case of collisions ( linked similar to linkedList )
         * 
         * Collision    = hash function generates the same index for more than one key
         *              = less collisions = more efficiency
         * 
         * Runtime complexity = best case 0(1)
         *                      = worst case 0(n)
        */

        Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f); //initital capacity is usual 11 elements and load factor is 0.75
        //if 75 percent of our table is filled it will automatically expand

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");
        //table.remove(777);

        System.out.println(table.get(100));
        for (Integer key : table.keySet()) { //keySet will take all of our keys and return a set, a set is iterable
           // System.out.println(key +"\t" + table.get(key)); display all elements and their keys
            //System.out.println(key.hashCode() +"\t" + key +"\t" + table.get(key)); hashcode is same as key
            System.out.println(key.hashCode() % 10 +"\t" + key +"\t" + table.get(key)); // the method earlier discussed
            

        }

    }
    
}
