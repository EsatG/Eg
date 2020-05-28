package day44_Exceptions;

public class Browsers {

    protected void openBrowser(){
        System.out.println("Opening the default browser");
    }

    protected  void closeBrowser(){
        System.out.println("Opening the default browser");
    }
}

class ChromeBrowser extends Browsers {

    /*
    openBrowser() =>> inherited
    closeBrowser() =>> inherited
     */
    public void openBrowser(){
        System.out.println("Opening the chrome browser");
    }

    protected  void closeBrowser(){
        System.out.println("Closing the chrome browser");
    }


}

class FirefoxBrowser extends Browsers{

    public void openBrowser(){
        System.out.println("Opening the Firefox browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the Firefox browser ");
    }
}

class Test {
    public static void main(String[] args) {

        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();
        obj.closeBrowser();

        System.out.println("================================================================");

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.openBrowser();
        obj2.closeBrowser();
    }




}
