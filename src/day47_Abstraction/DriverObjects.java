package day47_Abstraction;

public class DriverObjects {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.quit();

        System.out.println();

        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.herkul.org");
        driver1.quit();

        System.out.println();

        OperaDriver driver2 = new OperaDriver();
        driver2.get("https://www.google.com");
        driver2.quit();

    }
}
