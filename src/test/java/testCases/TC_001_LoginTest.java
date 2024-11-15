package testCases;

import org.slf4j.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;


//@Listeners(ScreenshotListener.class)
public class TC_001_LoginTest extends BaseClass {
    private static final Logger log = LoggerFactory.getLogger(TC_001_LoginTest.class);
    @Test(groups = {"Sanity", "Master"}) //Step8 groups added
    public void test_Login() {
        log.info("Starting TC_001_LoginTest");

        try {
            LoginPage lp = new LoginPage(driver);

            lp.setMobile(rb.getString("Mobile")); // valid email, get it from properties file

            lp.setPassword(rb.getString("password")); // valid password, get it from properties file

            lp.clickLogin();

            TC_002_OrgSelectTest tc002OrgSelectTest = new TC_002_OrgSelectTest();
            tc002OrgSelectTest.test_OrgSelect();

        } catch (Exception e) {
            Assert.fail("login failed");
        }
        log.info(" Finished TC_001_LoginTest");

    }

}
        

