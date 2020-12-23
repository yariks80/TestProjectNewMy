package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.LoginHelper;
import com.it.users.User;

public class App {
    public LoginHelper login;
    public DashBoardHelper dashboard;
    public CommonHelper common;

    public App() {
        this.login = new LoginHelper();
        this.dashboard = new DashBoardHelper();
        this.common =new CommonHelper();
    }

    public void login(User user) {
        login.login(user.userName,user.password);
    }
}
