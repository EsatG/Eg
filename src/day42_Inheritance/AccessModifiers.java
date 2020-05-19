package day42_Inheritance;

public class AccessModifiers {

     /*
    public: accessible at everywhere, visible to the world
    default: only visible in same package
    private: only visible within the same class
    protected: visible in the same package, visible in sub class outside of package

    public > protected > default > private (according to comparision of visibility}
     */

    public static String publicVariable = "Public";
    protected static String protectedVariable = "Protected";
    static String defaultVariable = "Default";
    private static String privateVariable = "Private";

    public static void publicMethod(){

    }

    protected static void protectedMethod(){

    }

    static void defaultMethod(){

    }

    private static void privateMethod(){

    }
}
