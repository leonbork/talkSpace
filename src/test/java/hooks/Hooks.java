package hooks;

import pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private LoginPage loginPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
    }

    @After
    public void tearDown() {
        loginPage.closeBrowser();
    }
}