package day45_Exceptions;

import java.io.IOException;

public class Summary {
    public static void main(String[] args) {


        try {
            throw new IOException(); // checked exception

        } catch (Exception e) {
        }

        System.out.println("Hello");

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (RuntimeException e){

        }



        try {
            throw new ClassNotFoundException(); // checked
        } catch (ClassNotFoundException e){

        }

        try {
            throw new NullPointerException(); // unchecked

        } catch (ArithmeticException e){
            System.out.println("Arithmetic");

        } catch (ClassCastException e){
            System.out.println("Class cast");

        } catch (NullPointerException e){
            
        }


        System.out.println("Completed");


    }




}