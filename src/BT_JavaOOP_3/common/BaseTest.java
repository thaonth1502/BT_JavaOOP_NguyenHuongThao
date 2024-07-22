package BT_JavaOOP_3.common;

public class BaseTest {

    public void createDriver(){

        System.out.println("Browser: " + Constants.browser);
        System.out.println("Report: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Close browser " + Constants.browser);

    }
    public void closeDriver(String browser){
        System.out.println("Close browser " + browser);

    }
}
