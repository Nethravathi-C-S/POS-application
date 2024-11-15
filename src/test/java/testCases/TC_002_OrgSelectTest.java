package testCases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.OrgSelectPage;
import testBase.BaseClass;

public class TC_002_OrgSelectTest extends BaseClass {
    private static final Logger log = LoggerFactory.getLogger(TC_001_LoginTest.class);


    @Test(groups = {"Sanity", "Master"}) //Step8 groups added
    public void test_OrgSelect() {
        log.info("Starting TC_002_OrgSelectTest");

        try {
            OrgSelectPage os = new OrgSelectPage(driver);
            os.clickLoc();
        } catch (Exception e) {
            Assert.fail("org select failed");
        }
        log.info("Finished TC_002_OrgSelectTest");

    }
}
