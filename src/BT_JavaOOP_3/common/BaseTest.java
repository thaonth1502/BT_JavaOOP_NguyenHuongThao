package BT_JavaOOP_3.common;

public class BaseTest {

    public BaseTest(String browser, boolean report, boolean headless){
        Constants.browser = browser;
        Constants.report = report;
        Constants.headless = headless;
    }

    public void createDriver(){

        System.out.println("Information of Browser: " + Constants.browser);
        System.out.println("Information of Report: " + Constants.report);
        System.out.println("Information of Headless: " + Constants.headless);
    }

    public void closeDriver(String browser){
        System.out.println("Close browser " + browser);


    }
}
