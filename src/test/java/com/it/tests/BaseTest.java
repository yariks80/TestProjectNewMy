package com.it.tests;

import com.it.App;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class BaseTest {
  static   App app= new App();
  static User validUser= UserFactory.getValidUser();

    @AfterSuite
    public void afterSuite() {
        app.common.stopApp();
    }
}
