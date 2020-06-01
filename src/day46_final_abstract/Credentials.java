package day46_final_abstract;

public class Credentials {

    final private String userName = "Cybertek";
    final private String password = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // we can not reassign the final variables, so there is no setter method
}
