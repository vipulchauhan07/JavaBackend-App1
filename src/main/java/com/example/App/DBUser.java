package com.example.App;

import java.util.ArrayList;
import java.util.List;

public class DBUser {
    private List<User> userTable = new ArrayList<>();

    public DBUser() {
        userTable.add(new User(1, "Vipul Chauhan", 23));
        userTable.add(new User(2, "Mukul Chauhan", 20));

    }
    public List<User> getUserTable() {
        return userTable;
    }

    public User getAUser(int id) {
        for(User user : userTable) {
            if(user.getId() == id)
                return user;
        }
        return null;
    }

    public Boolean deleteAUser(int id) {
        for(User user : userTable) {
            if(user.getId() == id) {
                userTable.remove(user);
                return  true;
            }
        }
        return false;
    }


    public User addAUser(User user) {
       userTable.add(user);
       return user;
    }
}
