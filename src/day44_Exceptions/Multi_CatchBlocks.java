package day44_Exceptions;

import java.util.NoSuchElementException;

public class Multi_CatchBlocks {
    public static void main(String[] args) {

        try {

            System.out.println(100 / 0); // arithmetic exception
        } catch (ClassCastException e){
            System.out.println("Class Cast"); // not  get executed

        } catch (NoSuchElementException e){
            System.out.println("No such element");  // not  get executed

        } catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bound"); // not  get executed

        } catch (ArithmeticException e){
            System.out.println("Arithmetic");  // get executed

        } catch (RuntimeException e){
            System.out.println("Run time");  // not get executed since exception already to be handled on Arithmetic step

        } catch (Exception e){
            System.out.println("Exception"); // not get executed since exception already to be handled on Arithmetic step
        }

        // parent exception can not come before child exception (Runtime : parent   Exception:Grandparent)

    }



}
