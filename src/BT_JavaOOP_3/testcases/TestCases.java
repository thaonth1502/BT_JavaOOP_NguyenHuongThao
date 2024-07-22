package BT_JavaOOP_3.testcases;

import BT_JavaOOP_3.common.BaseTest;
import BT_JavaOOP_3.common.Constants;

public class TestCases extends BaseTest {


    public TestCases(String browser, boolean report, boolean headless) {
        super(browser, report, headless);
    }

    public void login(){
        createDriver();
        System.out.println("Step 1: Navigator URL: https://cms.anhtester.com/login");
        System.out.println("Step 2: Input username valid");
        System.out.println("Step 3: Input password valid");
        System.out.println("Step 4: Click Login button");
        closeDriver(Constants.browser);
    }

    public void addCategory(){
        createDriver();
        System.out.println("Step 1: Login successful");
        System.out.println("Step 2: Click Products > Add New Products link in leftmenu.");
        System.out.println("Step 3: Input valid value into requirement fields");
        System.out.println("Step 4: Click Save & Unpublish Or Save & Publish");
        closeDriver(Constants.browser);
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases(Constants.browser, Constants.report, Constants.headless);
        testCases.login();
        testCases.addCategory();

    }
}
