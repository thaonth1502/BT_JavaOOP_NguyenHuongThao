package BT_JavaOOP_3.testcases;

import BT_JavaOOP_3.common.BaseTest;
import BT_JavaOOP_3.common.Constants;

public class TestCases extends BaseTest {

    public void loginCRM(){
        System.out.println("Navigator URL: https://cms.anhtester.com/login");
        System.out.println("Input username and password valid");
        System.out.println("Click Login button");
        System.out.println("Verify admin CMS page");
    }
    public void testLogin(){
        createDriver();
        loginCRM();
        closeDriver();
    }

    public void addCategory(){
        createDriver();
        loginCRM();
        System.out.println("Click Category link in leftmenu.");
        System.out.println("Click Add new Category button");
        System.out.println("Input valid value into requirement fields");
        System.out.println("Click Save button");
        System.out.println("Check message Successful");
        System.out.println("Verify category in Category list");

        closeDriver(Constants.browser);
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("==========================");
        testCases.addCategory();

    }
}
