package day42_Inheritance;

public class Data {
    /*
    public: accessible at everywhere, visible to the world
    default: only visible in same package
    private: only visible within the same class
    protected: visible in the same package, visible in sub class outside of package

    public > protected > default > private (according to comparision of visibility}
     */

    public static String publicData = "Public";
    protected static String protectedData = "Protected";
    static String defaultData = "Default";
    private static String privateData = "Private";
}

class testing extends Data{

    public static void main(String[] args) {

       // System.out.println(testing.privateData);error=>  not in same class with its own class

        System.out.println(testing.defaultData);
        System.out.println(testing.protectedData);
        System.out.println(testing.publicData);

    }
}
