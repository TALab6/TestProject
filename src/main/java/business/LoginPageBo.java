package business;

import core.driver.DriverManager;
import page.LoginPagePo;

import static core.util.Constants.LOGIN_PAGE_URL;

public class LoginPageBo {

    private LoginPagePo loginPagePo;

    public LoginPageBo() {
        loginPagePo = new LoginPagePo();
        DriverManager.getDriver().get(LOGIN_PAGE_URL);

    }


    public void logIn(String login, String password) {
        loginPagePo.enterLogin(login);
        loginPagePo.enterPassword(password);
        loginPagePo.clickSubmit();
    }
}
