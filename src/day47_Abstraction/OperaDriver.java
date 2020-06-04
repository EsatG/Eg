package day47_Abstraction;

public class OperaDriver extends RemoteWebDriver {

    @Override
    protected void get(String URL) {
        System.out.println("Opening " + URL + " in opera driver");
    }

    @Override
    public void quit() {
        System.out.println("Closing the opera driver");
    }
}
