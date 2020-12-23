package com.it.users;

import java.util.ResourceBundle;

public class UserFactory {
   static ResourceBundle resourceUser = ResourceBundle.getBundle("user");
    public  static User getValidUser() {
        return  new User(
                resourceUser.getString("userName"),
                resourceUser.getString("password"),
                resourceUser.getString("email")
        );
    }
}
