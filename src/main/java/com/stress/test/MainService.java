package com.stress.test;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MainService {

    public List<User> getUsers() {
        List<User> users= new ArrayList<>(1000);
        for (int i = 1; i < 1001; i++) {
            String stringIndex = Integer.toString(i);
            users.add(new User(
                    i,
                    "FirstName" + stringIndex,
                    "LastName" + stringIndex,
                    25,
                    "Quarkus (Java)"
            ));
        }

        return users;
    }

    public User getOneUser() {
        return new User(
                1,
                "FirstName",
                "LastName",
                25,
                "Quarkus (Java)"
        );
    }
}
