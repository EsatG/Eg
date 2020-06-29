package day54_Maps;

public class Notes54 {
    /*
    Array ( fixed, primitives &objects)
    Collection ( dynamic, only objects)
    Map(dynamic, only objects)

    -if we use map we can store two types at the same time
    - We don't have index in the Map
    - Map does not accept duplicate key, key must be unique

    put(key,value) : this method add objects to Map

    get(key): returns the value of the given key

    remove(key): removes the given key and it's value from the Map

    size(): gives us the size of Map

    containsKey(): verifies if the key is contained in the Map, it returns boolean

    clear(): clears everything

    isEmpty(): returns boolean

    keySet(): returns all the keys as Set

    values():  returns us all the values from the map as Collection

    entrySet():

    Entry<Key, Value>:
           getKey(): returns the key from the Entry
           getValue(): returns the value from the Entry

    HashMap:  does not keep the insertion order
              accepts null

    HashTable: is synchronized , thread-safe = one thread at a time
               slower
               does not accept null

    LinkedHashMap: keeps the insertion order as it is.
                   put & remove faster
                   accepts null

    TreeMap:  sorts the keys in ascending order
              does not accept "null" keyword at all

    String vs StringBuilder vs StringBuffer :

              String: immutable version char sequences

              StringBuilder : mutable (can be modified) version of char sequences
                              not synchronized

              StringBuffer: mutable (can be modified) version of char sequences
                            any methods in StringBuffer is synchronized, thread-safe, slow

    finalize(): a method that's called by garbage collector before the object gets called by garbage collector

    enum:  we can create custom data type by creating enum
           we only need it if need a variable to take out of small values

            DatatType  variableName = data;


     */
}
