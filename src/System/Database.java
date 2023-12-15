package System;

import Employees.User;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Database {

    Vector<User> userVector = new Vector<>(
            List.of(
                    new User(030505, "a_abzalkhanuly@kbtu.kz", "12341234", "Alan", "Abzalkhanuly"),
                    new User(030506, "z_zurgambaev@kbtu.kz", "11112222", "Zeinaddin", "Zurgambaev")
            )
    );

    public Vector<User> getUserVector() {
        return userVector;
    }

    public void setUserVector(Vector<User> userVector) {
        this.userVector = userVector;
    }
}
