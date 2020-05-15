package day40_Encapsulation;

public class Encapsulation {

    private long SSN;

    /*
    getter: read only, public instance method; return-type must match with instance variable data type;no parameter
    returning the private instance variable
     */

    public long getSSN () {
        return SSN;
    }

    /* setter: write (modify)  only, public instance method;return-type is void;passes a parameter and
     parameter must match with instance variable data type
    initializes the argument to private instance variable
     */

    public void setSSN (long SSN){
        this.SSN = SSN;

    }






}
