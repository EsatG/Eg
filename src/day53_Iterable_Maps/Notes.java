package day53_Iterable_Maps;

public class Notes {

    /*
    List : Accepts duplicates, has index number
           List is child interface of Collection
           insertion order preserved
           implemented by ArrayList,LinkedList,Vector
           size is dynamic

           Vector:
             - Implements a dynamic array
             - It is similar to ArrayList but two differen things
                 1. Vector is synchronized (thread-safe)
                 2. Vector contains many legacy methods that are not part of the collection framework.
            - Synchronize can only be applied for methods and block of code.
    Set : does not accept duplicates, does not have index

    Iterable(I): Root interface,
                 Classes that implements iterable,gains the ability to iterate the objects
                 We can apply Iterator(I) to the classes that are implementing Iterable
                 Iterable internally uses Iterator

                 Iterator(I):
                      1. it allows us to get access to each objects of the collections type
                      2. it allows us to remove the objects from collection
                      in order to reomve the objects from collection you have to use iterator

                      iterator(): iterates the any given collection, then returns Iterator interface

                      hasNext():  checks if there are enough elements that can be iterated, it returns boolean

                      next(): if hasNext() condition is true we can use this next() method. This method accesses and retrieves the element

                      remove(): removes the current element of iteration


     */
}
