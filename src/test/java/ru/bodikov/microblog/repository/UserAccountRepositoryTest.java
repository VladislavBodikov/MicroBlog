package ru.bodikov.microblog.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.bodikov.microblog.domain.UserAccount;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserAccountRepositoryTest {

    @Autowired
    UserAccountRepository userAccountRepository;
    @Test
    void save(){
        UserAccount userAccount = new UserAccount("log","pass");

        userAccountRepository.save(userAccount);
    }

}