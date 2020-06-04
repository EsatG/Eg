package day46_final_abstract;

public abstract class Shape{
    /*
    Abstarction:
                hiding the implementation details
                concentrating on essential things without worrying about the details
                two ways for achieving abstraction
                        1 - by using abstract class
                        2- by using Interface
    Abstract Method:
                A method without the body/implementation
                A method that's meant to be overridden (can not be final, static and private)
                Only instance method you can give abstract
                Abstract method can not be exist in the regular class.Because we cannot create a method
                without body in a regular class

    Abstarct Class:
                A class meant to be inherited (can not be final,static and private )
     */

     abstract void area();

}
