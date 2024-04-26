package agustin;

import org.testng.annotations.Test;

import agustin.utils.TestHelper;

public class SendMsgTest extends BaseTest {
    private SendMsgPage sendMsgPage;
    private LoginHelper loginHelper;

    @Test
    public void testAction1() {
        driver.get(getBaseUrl());
        loginHelper = new LoginHelper(driver);
        sendMsgPage = new SendMsgPage(driver);

        String validEmail = TestHelper.getValidEmail();
        String validPassword = TestHelper.getValidPassword();

        loginHelper.login(validEmail, validPassword);
    }

    @Test(dependsOnMethods = "testAction1")
    public void testSendMsg() {

        sendMsgPage.clickCompose();

    }
}
