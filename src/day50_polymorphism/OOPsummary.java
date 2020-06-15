package day50_polymorphism;

public class OOPsummary {
    /*
    Encapsulation:
            Data hiding by using "private" access modifier
           using the public getter/setter methods to read and modify the private data
           getter => read only
           setter=> modify the data
           if private data is "final" we can only generate "getter" not "setter"

   Inheritance:
           build super & sub class
           super class: can not inherit anything from child
           sub class: can inherit visible variables and visible methods (except constructor) from super class.
           easy way to get rich for sub class
           using "extends" keyword for inheriting
           for method overriding this inheritance is mandatory. Overriding is occurred in sub class
           advantage: less codes, reusable, easy to maintain

    Abstraction:
            hiding the implementation details
            Concentrating on essentials/importance, without worrying the details
            can not create an object from abstract class
                Abstract Method:
                      Abstract method does not has body/implementation
                      Abstract method meant to be overridden (can not be final,static,private)
            there are only two ways to achieve abstraction
                 1: abstract class: not concrete, can not create object
                                    meant to be inherited (can not be final)
                                    a class only extends one class

                 2: interface: we can implement multiple interfaces to a class
                               interface can not be declared as "final"
                               meant to be inherited
                               can not create an object from interface
                               everything has "public" access modifier in interface by default
                               we can only have:
                                      variables: by default static and final
                                      methods: abstract method, static method, default method
                               we can not have:
                                      constructors, instance variables, instance methods, blocks

              extends vs implements:
                        class          extends         class
                        interface      extends         interface
                        class          implements      interface
                        class          extends         class          implements         I1,I2,I3....







     */
}
