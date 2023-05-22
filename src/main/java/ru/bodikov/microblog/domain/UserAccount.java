package ru.bodikov.microblog.domain;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAccount {

    @Id
    Long id;

    String firstName;
    String secondName;

    String login;
    String password;

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
