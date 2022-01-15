package com.sancode.invent.workshop.utility;

import java.util.function.BiFunction;

public class utiliy {
    BiFunction userPasswordValidator = (u, p) -> u.equals("sanjay") & p.equals("12345");

    private Boolean isCredentialsAreValid(BiFunction<String, String, Boolean> credentials, String userName, String password) {
        return credentials.apply(userName, password);
    }
}
