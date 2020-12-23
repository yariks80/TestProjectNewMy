package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest  extends BaseTest {
    @Test
    void name() {
        app.login(validUser);
        Assert.assertEquals( app.dashboard.getLbUserEmail() ,validUser.email);
    }
}
